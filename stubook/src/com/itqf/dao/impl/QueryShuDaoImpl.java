package com.itqf.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ColumnListHandler;

import com.itqf.dao.QueryShuDao;
import com.itqf.domain.Product;
import com.itqf.domain.Student;
import com.itqf.utils.JDBCUtils;

public class QueryShuDaoImpl implements QueryShuDao {

	@Override
	public List<Product> queryShu() throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtils.getSource());
		String sql ="select * from product;";
		return	runner.query(sql, new BeanListHandler<Product>(Product.class));
	}

	@Override
	public List<Student> queryShuPerson() throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtils.getSource());
		String sql="select distinct  product_id from p_s; ";
		List<Object> list = runner.query(sql, new ColumnListHandler());
		for (Object object : list) {
			String product_id=(String)object;
		}
		return null;
	}
}
