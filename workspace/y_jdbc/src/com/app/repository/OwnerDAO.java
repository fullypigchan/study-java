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
import com.app.domain.OwnerVO;

public class OwnerDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

//	추가
	public void save(OwnerVO ownerVO) {

		StringBuilder stringBuilder = new StringBuilder();
		String query = null;

		stringBuilder.append("insert into tbl_owner ");
		stringBuilder.append("(owner_name, owner_age, owner_phone, owner_address, owner_address_detail) ");
		stringBuilder.append("values(?, ?, ?, ?, ?)");

//		query문에 DB에 전송할 쿼리문 넣어준다.		
		query = stringBuilder.toString();

//		DB에 전송하기 위해 연결해줌
		connection = DBConnecter.getConnection();

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, ownerVO.getOwnerName());
			preparedStatement.setInt(2, ownerVO.getOwnerAge());
			preparedStatement.setString(3, ownerVO.getOwnerPhone());
			preparedStatement.setString(4, ownerVO.getOwnerAddress());
			preparedStatement.setString(5, ownerVO.getOwnerAddressDetail());
			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("save(OwnerVO) SQL문 오류");
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

//수정

	public void setOwner(OwnerVO ownerVO) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;

		stringBuilder.append("update tbl_owner ");
		stringBuilder.append("set owner_name, owner_age, owner_address, owner_address_detail ");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, ownerVO.getOwnerName());
			preparedStatement.setInt(2, ownerVO.getOwnerAge());
			preparedStatement.setString(3, ownerVO.getOwnerAddress());
			preparedStatement.setString(4, ownerVO.getOwnerAddressDetail());
			preparedStatement.setLong(5, ownerVO.getId());

			preparedStatement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("setOwner(OwnerVO) SQL문 오류");
		}
	}

//	삭제
	public void delete(Long id) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;

		stringBuilder.append("delete from tbl_owner ");
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
//	 조회

	public Optional<OwnerVO> findById(Long id) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;
		OwnerVO owner = null;

		stringBuilder.append("select id, owner_name, owner_age, owner_phone, owner_address, owner_address_detail ");
		stringBuilder.append("from tbl_owner ");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				owner = new OwnerVO();

				owner.setId(resultSet.getLong("id"));
				owner.setOwnerName(resultSet.getString("owner_name"));
				owner.setOwnerAge(resultSet.getInt("owner_password"));
				owner.setOwnerName(resultSet.getString("owner_phone"));
				owner.setOwnerAddress(resultSet.getString("owner_address"));
				owner.setOwnerAddressDetail(resultSet.getString("owner_address_detail"));
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

		return Optional.ofNullable(owner);
	}

//  목록
	public List<OwnerVO> findAll() {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;
		OwnerVO owner = null;
		List<OwnerVO> cars = new ArrayList<OwnerVO>();

		stringBuilder.append("select id, owner_name, owner_age, owner_phone, owner_address, owner_address_detail  ");
		stringBuilder.append("from tbl_owner");

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