package com.itqf.dao;

import java.sql.SQLException;

public interface SearchMoneyDao {
	public double searchMoney(String username)throws SQLException;
}
