package com.itqf.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.itqf.dao.SSearchBooksDao;
import com.itqf.dao.impl.SSearchBooksDaoImpl;
import com.itqf.domain.Product;
import com.itqf.service.SSearchBooksService;

public class SSearchBooksServiceImpl implements SSearchBooksService {

	@Override
	public List<Product> sSearchBooks(String username) throws SQLException {
		// TODO Auto-generated method stub
		SSearchBooksDao dao=new SSearchBooksDaoImpl();
		List<Product> list = dao.sSerachBooks(username);
		return list;
	}

}
