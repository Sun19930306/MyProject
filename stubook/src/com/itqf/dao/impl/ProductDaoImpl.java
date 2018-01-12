package com.itqf.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itqf.dao.ProductDao;
import com.itqf.domain.Product;
import com.itqf.utils.JDBCUtils;
import com.itqf.utils.ManagerTransactionUtils;

public class ProductDaoImpl implements ProductDao {

	@Override
	public int insertProduct(Product product) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner queryRunner =new QueryRunner(JDBCUtils.getSource());
		String sql="insert into product (product_id,product_name,product_price,product_num,product_category,product_url,product_description) values(?,?,?,?,?,?,?)";
		return queryRunner.update(sql,product.getProduct_id(),
				product.getProduct_name(),
				product.getProduct_price(),
				product.getProduct_num(),
				product.getProduct_category(),
				product.getProduct_url(),
				product.getProduct_description()
				);
	}

	@Override
	public List<Product> queryAllProducts() throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner queryRunner =new QueryRunner(JDBCUtils.getSource());
		String sql="select * from  product";
		return queryRunner.query(sql, new BeanListHandler<Product>(Product.class));
	}

	@Override
	public Product findProductById(String id) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner queryRunner =new QueryRunner(JDBCUtils.getSource());
		String sql="select * from  product where product_id =?";
		return queryRunner.query(ManagerTransactionUtils.getConnection(),sql, new BeanHandler<Product>(Product.class),id);
	}

	@Override
	public int updateProduct(Product product) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner queryRunner =new QueryRunner(JDBCUtils.getSource());
		String sql="update  product set product_name=?,"
				+ "product_price=?,product_num=?,"
				+ "product_category=?,product_url=?,"
				+ "product_description=? where  product_id = ? ";
		return queryRunner.update(ManagerTransactionUtils.getConnection(),sql,product.getProduct_name(),
				product.getProduct_price(),product.getProduct_num(),
				product.getProduct_category(),product.getProduct_url(),
				product.getProduct_description(),product.getProduct_id());
	}

	@Override
	public int[] deleteManyProducts(String[] ids) throws SQLException {
		QueryRunner queryRunner =new QueryRunner(JDBCUtils.getSource());
		String sql="delete from product where product_id =?";
		Object[][] params =new Object[ids.length][];
		for (int i = 0; i < params.length; i++) {
			params[i]=new Object[] {ids[i]};
		}
		int[] rowCount = queryRunner.batch(sql, params);
		return rowCount;
	}

	@Override
	public List<Product> queryManyCondition(String product_id, String product_category, String product_name,
			String minprice, String maxprice) throws SQLException {
		QueryRunner queryRunner =new QueryRunner(JDBCUtils.getSource());
		String sql="select * from product where 1=1 ";
		if ("".equals(product_id)||null==product_id) {
		}else {
			sql=sql+" and  product_id = "+"'"+product_id+"'";
		}
		if ("".equals(product_category)||null==product_category) {
		}else {
			sql=sql+" and  product_category = "+"'"+product_category+"'";
		}
		if ("".equals(product_name)||null==product_name) {
		}else {
			sql=sql+" and  product_name like '%"+product_name+"%'";
		}
		if ("".equals(minprice)||null==minprice) {
		}else {
			sql=sql+" and  product_price  > "+minprice;
		}
		if ("".equals(maxprice)||null==maxprice) {
		}else {
			sql=sql+" and  product_price < "+maxprice;
		}
		return queryRunner.query(sql, new BeanListHandler<Product>(Product.class));
		
	}

	@Override
	public int[] deletePersonalBook(String[] ids) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner queryRunner =new QueryRunner(JDBCUtils.getSource());
		String sql="delete from p_s where product_id =?";
		Object[][] params =new Object[ids.length][];
		for (int i = 0; i < params.length; i++) {
			params[i]=new Object[] {ids[i]};
		}
		int[] rowCount = queryRunner.batch(sql, params);
		System.out.println(rowCount+"这是删除的数组");
		return rowCount;
	}

}
