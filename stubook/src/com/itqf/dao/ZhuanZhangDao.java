package com.itqf.dao;

import java.sql.SQLException;

public interface ZhuanZhangDao {
	public  double queryMoneyById(String username) throws SQLException;

	public  int  updateMoneyById(String username,double money) throws SQLException;
}
