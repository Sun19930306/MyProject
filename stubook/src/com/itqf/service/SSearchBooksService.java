package com.itqf.service;

import java.sql.SQLException;
import java.util.List;

import com.itqf.domain.Product;

public interface SSearchBooksService {
	public List<Product> sSearchBooks(String username) throws SQLException;
}
