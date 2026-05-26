package com.app.domain;

import java.util.Objects;

import com.app.enumeration.BookStatus;
import com.app.enumeration.CarUsed;

//	    id BIGINT PRIMARY KEY AUTO_INCREMENT,
//	    book_title VARCHAR(200) NOT NULL,
//	    book_author VARCHAR(100) NOT NULL,
//	    book_price INT NOT NULL,
//	    book_publisher VARCHAR(100),
//	    book_stock INT DEFAULT 0,
//	    book_status VARCHAR(20) DEFAULT 'available',
//	    created_datetime DATETIME DEFAULT CURRENT_TIMESTAMP,
//	    updated_datetime DATETIME DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
public class BookVO {
	private Long id;
	private String bookTitle;
	private String bookAuthor;
	private int bookPrice;
	private String bookPublisher;
	private int bookStock;
	private BookStatus bookStatus;
	private String createdDateTime;
	private String updatedDateTime;

	public BookVO() {
	}

	public BookVO(Long id, String bookTitle, String bookAuthor, int bookPrice, String bookPublisher, int bookStock,
			BookStatus bookStatus, String created_datetime, String updated_datetime) {
		super();
		this.id = id;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookPublisher = bookPublisher;
		this.bookStock = bookStock;
		this.bookStatus = bookStatus;
		this.createdDateTime = createdDateTime;
		this.updatedDateTime = updatedDateTime;
	}

	@Override
	public String toString() {
		return "BookVO [id=" + id + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor + ", bookPrice="
				+ bookPrice + ", bookPublisher=" + bookPublisher + ", bookStock=" + bookStock + ", bookStatus="
				+ bookStatus + ", createdDateTime=" + createdDateTime + ", updatedDateTime=" + updatedDateTime
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}

	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookPublisher() {
		return bookPublisher;
	}

	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}

	public int getBookStock() {
		return bookStock;
	}

	public void setBookStock(int bookStock) {
		this.bookStock = bookStock;
	}

	public BookStatus getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(BookStatus bookStatus) {
		this.bookStatus = bookStatus;
	}

	public String getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(String created_datetime) {
		this.createdDateTime = createdDateTime;
	}

	public String getUpdatedDateTime() {
		return updatedDateTime;
	}

	public void setUpdatedDateTime(String updatedDateTime) {
		this.updatedDateTime = updatedDateTime;
	}

	public void setBookStatus(String bookStatus) {
		this.bookStatus = BookStatus.getEnum(bookStatus);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookVO other = (BookVO) obj;
		return Objects.equals(id, other.id);
	}

}
