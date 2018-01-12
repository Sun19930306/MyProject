package com.itqf.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.itqf.dao.AddCarDao;
import com.itqf.utils.JDBCUtils;

public class AddCarDaoImpl implements AddCarDao{

	@Override
	public int addCar(String ids, String username) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtils.getSource());
		String sql="insert into p_s(product_id,username) VALUES(?,?); ";
		return	runner.update(sql, ids,username);
		 
	}

}
