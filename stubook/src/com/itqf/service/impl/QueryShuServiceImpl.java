package com.itqf.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.itqf.dao.QueryShuDao;
import com.itqf.dao.impl.QueryShuDaoImpl;
import com.itqf.domain.Product;
import com.itqf.service.QueryShuService;

public class QueryShuServiceImpl implements QueryShuService {
	QueryShuDao dao=new QueryShuDaoImpl();
	@Override
	public List<Product> queryShu() throws SQLException {
		// TODO Auto-generated method stub
		
		List<Product> list = dao.queryShu();
		System.out.println(list+"*******");
		return list;
	}

	
}
