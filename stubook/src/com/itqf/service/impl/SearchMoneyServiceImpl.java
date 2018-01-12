package com.itqf.service.impl;

import java.sql.SQLException;

import com.itqf.dao.SearchMoneyDao;
import com.itqf.dao.impl.SearchMoneyDaoImpl;
import com.itqf.service.SearchMoneyService;

public class SearchMoneyServiceImpl implements SearchMoneyService {

	@Override
	public double searchMonye(String username) throws SQLException {
		// TODO Auto-generated method stub
		SearchMoneyDao dao=new SearchMoneyDaoImpl();
		return 	dao.searchMoney(username);
		
		
	}

}
