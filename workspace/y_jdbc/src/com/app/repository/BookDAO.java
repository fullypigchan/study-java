package com.app.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import com.app.config.DBConnecter;
import com.app.domain.BookVO;
import com.app.domain.CarVO;

public class BookDAO {
	private Connection connection;
	private PreparedStatement preparedStatement;
	private ResultSet resultSet;

	public void save(BookVO bookVO) {
//		book_title, book_author, book_price, book_publisher, book_stock
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;
		stringBuilder.append("insert into tbl_book ");
		stringBuilder.append("(book_title, book_author, book_price, book_publisher, book_stock) ");
		stringBuilder.append("values(?, ?, ?, ?, ?)");
		query = stringBuilder.toString();

		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setString(1, bookVO.getBookTitle());
			preparedStatement.setString(2, bookVO.getBookAuthor());
			preparedStatement.setInt(3, bookVO.getBookPrice());
			preparedStatement.setString(4, bookVO.getBookPublisher());
			preparedStatement.setInt(5, bookVO.getBookStock());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("save(BookVO) SQL문 오류");
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

	public Optional<BookVO> findById(Long id) {
		StringBuilder stringBuilder = new StringBuilder();
		String query = null;
		BookVO book = null;

		stringBuilder.append(
				"select id, book_title, book_author, book_price, book_publisher, book_stock, book_status, book_created_datetime, book_updated_datetim ");
		stringBuilder.append("from tbl_book ");
		stringBuilder.append("where id = ?");

		query = stringBuilder.toString();

		connection = DBConnecter.getConnection();
		try {
			preparedStatement = connection.prepareStatement(query);
			preparedStatement.setLong(1, id);
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				book = new BookVO();

				book.setId(resultSet.getLong("id"));
				book.setBookTitle(resultSet.getString("book_title"));
				book.setBookAuthor(resultSet.getString("book_author"));
				book.setBookPrice(resultSet.getInt("book_price"));
				book.setBookPublisher(resultSet.getString("book_publisher"));
				book.setBookStock(resultSet.getInt("book_stock"));
				book.setBookStatus(resultSet.getString("book_status"));
				book.setCreatedDateTime(resultSet.getString("created_datetime"));
				book.setUpdatedDateTime(resultSet.getString("updated_datetime"));
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

		return Optional.ofNullable(book);
	}
	public void updatePrice(Long id, int newPrice) {
		
	}
}
