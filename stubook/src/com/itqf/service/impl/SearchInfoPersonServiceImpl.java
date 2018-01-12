package com.itqf.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.itqf.dao.SearchPsersonInfo;
import com.itqf.dao.impl.SearchPersonInfoDaoImpl;
import com.itqf.domain.ProductAndStudent;
import com.itqf.service.SearchPersonInfoService;

public class SearchInfoPersonServiceImpl implements SearchPersonInfoService{

	@Override
	public List<ProductAndStudent> searchPersonInfo() throws SQLException {
		// TODO Auto-generated method stub
		SearchPsersonInfo dao=new SearchPersonInfoDaoImpl();
		List<ProductAndStudent> list = dao.searchPerson();
		return list;
	}

}
