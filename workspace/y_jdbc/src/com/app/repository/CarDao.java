package com.app.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.app.config.DBConnecter;
import com.app.domain.CarVO;
import com.app.domain.MemberVO;

public class CarDao {
//  내가 설정한 RDB 연결 객체
	private Connection connection;
//  내가 작성한 SQL문을 담아서 완성 후 실행해주는 객체
	private PreparedStatement preparedStatement;
//  조회 결과를 담아줄 객체
	private ResultSet resultSet;

//		추가할 정보를 객체로 전부 가져온다.
	public void save(CarVO carVO) {

//		StringBuilder 생성
		StringBuilder stringBuilder = new StringBuilder();

//		query문 작성할 변수 생성 후 초기화
		String query = null;

//		추가
//		DB에 전송할 쿼리문 작성: 양식 맞춰서 작성해야함. 마지막에 띄어쓰기.
		stringBuilder.append("insert into tbl_car ");
		stringBuilder.append("(car_brand, car_model, car_used, car_price, car_release_date) ");
		stringBuilder.append("values(?, ?, ?, ?, ?)");

//		query문에 DB에 전송할 쿼리문 넣어준다.		
		query = stringBuilder.toString();

//		DB에 전송하기 위해 연결해줌
		connection = DBConnecter.getConnection();

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, carVO.getCarBrand());
			preparedStatement.setString(2, carVO.getCarModel());
			preparedStatement.setString(3, carVO.getCarUsed().getValue());
			preparedStatement.setInt(4, carVO.getCarPrice());
			preparedStatement.setString(5, carVO.getCarReleaseDate());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("save(CarVO) SQL문 오류");
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException();
			}
		}

	}

//		삭제
	public void setCar(CarVO carVO) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;

		stringBuilder.append("update tbl_car ");
		stringBuilder.append("set car_model, car_used, car_price, car_release_date");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, carVO.getCarModel());
			preparedStatement.setString(2, carVO.getCarUsed().getValue());
			preparedStatement.setInt(3, carVO.getCarPrice());
			preparedStatement.setString(4, carVO.getCarReleaseDate());
			preparedStatement.setLong(5, carVO.getId());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("setMember(MemberVO) SQL문 오류");
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException();
			}
		}

	}
//	soft 삭제

//	hard 삭제
	public void delete(Long id) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;

		stringBuilder.append("delete from tbl_car ");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		connection = DBConnecter.getConnection();

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("delete(Long) SQL 오류");
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException();
			}
		}
	}

//	찾기

	public Optional<CarVO> findById(Long id) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;
		CarVO car = null;

		stringBuilder.append("select id, car_brand, car_model, car_used, car_price, car_release_date ");
		stringBuilder.append("from tbl_car ");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				car = new CarVO();

				car.setId(resultSet.getLong("id"));
				car.setCarBrand(resultSet.getString("car_brand"));
				car.setCarModel(resultSet.getString("member_password"));
				car.setCarUsed(resultSet.getString("car_used"));
				car.setCarPrice(resultSet.getInt("car_price"));
				car.setCarReleaseDate(resultSet.getString("car_release_date"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("findById(Long) SQL 오류");
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException();
			}
		}

		return Optional.ofNullable(car);
	}

//  목록
	public List<CarVO> findAll() {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;
		CarVO car = null;
		List<CarVO> cars = new ArrayList<CarVO>();

		stringBuilder.append("select id, car_brand, car_model, car_used, car_price, car_release_date ");
		stringBuilder.append("from car");

		query = stringBuilder.toString();

		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				car = new CarVO();

				car.setId(resultSet.getLong("id"));
				car.setCarBrand(resultSet.getString("car_brand"));
				car.setCarModel(resultSet.getString("member_password"));
				car.setCarUsed(resultSet.getString("car_used"));
				car.setCarPrice(resultSet.getInt("car_price"));
				car.setCarReleaseDate(resultSet.getString("car_release_date"));

				cars.add(car);
			}

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("findAll() SQL 오류");
		} finally {
			try {
				if (preparedStatement != null) {
					preparedStatement.close();
				}
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
				throw new RuntimeException();
			}
		}

		return cars;
	}

}