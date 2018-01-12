package com.itqf.dao;

import java.sql.SQLException;
import java.util.List;

import com.itqf.domain.Product;

public interface ProductDao {

	public int insertProduct(Product product) throws SQLException ;

	public List<Product> queryAllProducts() throws SQLException ;

	public Product findProductById(String id) throws SQLException;

	public int updateProduct(Product product)throws SQLException;

	public int[] deleteManyProducts(String[] ids)throws SQLException;
	public List<Product> queryManyCondition(String product_id, String product_category, String product_name,
			String minprice, String maxprice)throws SQLException;
	public int[] deletePersonalBook(String[] ids) throws SQLException; 
}
