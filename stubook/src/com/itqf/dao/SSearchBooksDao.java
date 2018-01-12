package com.itqf.dao;

import java.sql.SQLException;
import java.util.List;

import com.itqf.domain.Product;

public interface SSearchBooksDao {
	public List<Product> sSerachBooks(String username) throws SQLException;
}
