package com.itqf.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.itqf.dao.SearchMoneyDao;
import com.itqf.utils.JDBCUtils;

public class SearchMoneyDaoImpl implements SearchMoneyDao{

	@Override
	public double searchMoney(String username) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtils.getSource());
		String sql="select money from stubook where username=?;";
		 Object object = runner.query(sql,new ScalarHandler(),username);
		 double money=0;
		 if(object!=null){
			money =(double)object;
		 }
		
		 return money;
	}

}
