package com.app.domain;

import java.util.Objects;

import com.app.enumeration.ProductCategory;

public class ProductVO {
	private Long id;
	private String productName;
	private int price;
	private int stock;
	private ProductCategory category;
	private String created;
	private String updated;

	public ProductVO() {
	}

	public ProductVO(Long id, String productName, int price, int stock, ProductCategory category, String created,
			String updated) {
		super();
		this.id = id;
		this.productName = productName;
		this.price = price;
		this.stock = stock;
		this.category = category;
		this.created = created;
		this.updated = updated;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public ProductCategory getCategory() {
		return category;
	}

	public void setCategory(ProductCategory category) {
		this.category = category;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}

	@Override
	public String toString() {
		return "ProductVO [id=" + id + ", productName=" + productName + ", price=" + price + ", stock=" + stock
				+ ", category=" + category + ", created=" + created + ", updated=" + updated + "]";
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
		ProductVO other = (ProductVO) obj;
		return Objects.equals(id, other.id);
	}

}