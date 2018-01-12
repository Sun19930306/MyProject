package com.itqf.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.itqf.dao.ZhuanZhangDao;
import com.itqf.utils.JDBCUtils;
import com.itqf.utils.ManagerTransactionUtils;


public class ZhuanZhangDaoImpl implements ZhuanZhangDao {

	@Override
	public double queryMoneyById(String username) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner queryRunner =new QueryRunner(JDBCUtils.getSource());
		String sql="select money from stubook where username=?";
		Object object = queryRunner.query(ManagerTransactionUtils.getConnection(),sql, new ScalarHandler(),username);
		double money =(double)object;
		return money;
		
	}

	@Override
	public int updateMoneyById(String username, double money) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner queryRunner =new QueryRunner(JDBCUtils.getSource());
		String sql="update stubook set money= ? where username= ?";
		int rowCount = queryRunner.update(ManagerTransactionUtils.getConnection(),sql,money,username);
		return rowCount;
		
	}

}
