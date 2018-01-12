package com.itqf.service;

import java.sql.SQLException;
import java.util.List;

import com.itqf.domain.ProductAndStudent;

public interface SearchPersonInfoService {
	public List<ProductAndStudent> searchPersonInfo()throws SQLException;
}
