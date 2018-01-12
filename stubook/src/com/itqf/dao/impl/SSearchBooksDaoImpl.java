package com.itqf.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import com.itqf.dao.SSearchBooksDao;
import com.itqf.domain.Product;
import com.itqf.utils.JDBCUtils;

public class SSearchBooksDaoImpl implements SSearchBooksDao{

	@Override
	public List<Product> sSerachBooks(String username) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtils.getSource());
		String sql ="select product_id from p_s where username=?;";
		List<Object> list = runner.query(sql, new ColumnListHandler(),username);
		List<Product> list2=new ArrayList<Product>();
		for (Object object : list) {
			String product_id=(String)object;
			sql="select * from product where product_id=?";
			Product product = runner.query(sql, new BeanHandler<Product>(Product.class),product_id);
			list2.add(product);
//			System.out.println(product_id+"****");
			
		}
		System.out.println(list2+"**");
//		List<String> list =runner.query(sql, new ColumnListHandler());
//		System.out.println(list+"查询的结果是****"+username);
		
		
		
		
//		List<Product> list2=new ArrayList<Product>();
//		for (String string : list) {
//			sql="select * from product where product_id=?";
//			Product product = runner.query(sql, new BeanHandler<Product>(Product.class),string);
//			list2.add(product);
//		}
		return list2;
		
	}

}
