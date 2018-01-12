package com.itqf.service.impl;

import java.sql.SQLException;

import com.itqf.dao.AddCarDao;
import com.itqf.dao.impl.AddCarDaoImpl;
import com.itqf.service.AddCarService;

public class AddCarServiceImpl implements AddCarService{

	@Override
	public int addCar(String ids, String username) throws SQLException {
		// TODO Auto-generated method stub
		AddCarDao dao=new AddCarDaoImpl();
		return dao.addCar(ids, username);
		
	}

}
