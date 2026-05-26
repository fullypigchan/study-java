package com.app.domain;

import com.app.enumeration.CarUsed;
import com.app.enumeration.MemberGender;

public class CarVO {

	private Long id;
	private String carBrand;
	private String carModel;
	private CarUsed carUsed;
	private int carPrice;
	private String carReleaseDate;

	public CarVO() {
	}

	public CarVO(Long id, String carBrand, String carModel, CarUsed carUsed, int carPrice, String carReleaseDate) {
		super();
		this.id = id;
		this.carBrand = carBrand;
		this.carModel = carModel;
		this.carUsed = carUsed;
		this.carPrice = carPrice;
		this.carReleaseDate = carReleaseDate;
	}

	@Override
	public String toString() {
		return "CarVO [id=" + id + ", carBrand=" + carBrand + ", carModel=" + carModel + ", carUsed=" + carUsed
				+ ", carPrice=" + carPrice + ", carReleaseDate=" + carReleaseDate + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public CarUsed getCarUsed() {
		return carUsed;
	}

	public void setCarUsed(CarUsed carUsed) {
		this.carUsed = carUsed;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	public String getCarReleaseDate() {
		return carReleaseDate;
	}

	public void setCarReleaseDate(String carReleaseDate) {
		this.carReleaseDate = carReleaseDate;
	}

	public void setCarUsed(String carUsed) {
		this.carUsed = CarUsed.getEnum(carUsed);
	}

}
