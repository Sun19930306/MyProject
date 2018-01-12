package com.itqf.service;

import java.sql.SQLException;
import java.util.List;

import com.itqf.domain.Product;

public interface QueryShuService {
	public List<Product> queryShu()throws SQLException;
}
