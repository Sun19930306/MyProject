package com.itqf.service;

import java.sql.SQLException;
import java.util.List;


import com.itqf.domain.Product;
import com.itqf.exeception.ProductException;

public interface ProductService {

	public void addProduct(Product product) throws SQLException,ProductException;
	public Product queryProductById(String id)throws SQLException;
	public void updateProductById(Product product);
	public void deleteManyProducts(String[] ids)throws SQLException,ProductException; 
	public List<Product> queryManyCondition(String product_id, String product_category, String product_name,
			String minprice, String maxprice)throws SQLException;
	public void deletePersonalBook(String[] ids)throws SQLException,ProductException;
}
