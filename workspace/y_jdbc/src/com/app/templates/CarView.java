package com.app.templates;

import com.app.domain.CarVO;
import com.app.enumeration.CarUsed;
import com.app.enumeration.MemberGender;
import com.app.repository.CarDao;

public class CarView {
	public static void main(String[] args) {

		CarVO carVO = new CarVO();
		CarDao carDAO = new CarDao();
		
		
		carVO.setCarBrand("Benz");
		carVO.setCarModel("E-class");
		carVO.setCarUsed(CarUsed.NEW_CAR);
		carVO.setCarPrice(2_000_000_000);
		carVO.setCarReleaseDate("2024_12_18");
		
		carDAO.save(carVO);
		
//		carDAO.delete(1L);
//		carDAO.delete(2L);
		
		
		

	}
}
