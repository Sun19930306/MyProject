package com.itqf.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.itqf.exeception.ProductException;
import com.itqf.dao.ProductDao;
import com.itqf.dao.impl.ProductDaoImpl;
import com.itqf.domain.Product;
import com.itqf.service.ProductService;
import com.itqf.utils.ManagerTransactionUtils;

public class ProductServiceImpl  implements ProductService{

	ProductDao productDao = new ProductDaoImpl();
	@Override
	public void addProduct(Product product) throws SQLException,ProductException {
		// TODO Auto-generated method stub
		int rowCount = productDao.insertProduct(product);
		if (rowCount>0) {
			
		}else {
			throw new  ProductException("添加失败");
		}
	}
	@Override
	public Product queryProductById(String id) throws SQLException {
		// TODO Auto-generated method stub
		return productDao.findProductById(id);
	}
	@Override
	public void updateProductById(Product product) {
		// TODO Auto-generated method stub
		ManagerTransactionUtils.startTransaction();
		try {
			String url=  product.getProduct_url();
			if ("".equals(url)||null==url) {
			}else {
				if (url.endsWith(".png")||url.endsWith(".jpg")||url.endsWith(".gif")) {
				
				}else {
					Product p1 = productDao.findProductById(product.getProduct_id());
					
					product.setProduct_url(p1.getProduct_url());
				}
			}	
			int rowCount = productDao.updateProduct(product);
			if (rowCount>0) {
//				System.out.println("更新成功");
			}else{
				throw new ProductException("更新失败");
			}
			ManagerTransactionUtils.closeTransaction();
		}catch (Exception e) {
			// TODO: handle exception
			ManagerTransactionUtils.rollBackTransaction();
		}
	}
	@Override
	public void deleteManyProducts(String[] ids) throws SQLException, ProductException {
		// TODO Auto-generated method stub
		int[] rowCount = productDao.deleteManyProducts(ids);
		if (rowCount.length>0) {
			
		}else {
			throw new  ProductException("更新失败");
		}
	
	}
	@Override
	public List<Product> queryManyCondition(String product_id, String product_category, String product_name,
			String minprice, String maxprice) throws SQLException {
		// TODO Auto-generated method stub
		List<Product> list = productDao.queryManyCondition(product_id,product_category,product_name,minprice,maxprice);
		return list;
		
	}
	@Override
	public void deletePersonalBook(String[] ids) throws SQLException, ProductException {
		// TODO Auto-generated method stub
		int[] rowCount = productDao.deletePersonalBook(ids);
		if (rowCount.length>0) {
			
		}else {
			throw new  ProductException("更新失败");
		}
	}
}
