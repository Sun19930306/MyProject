package com.itqf.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.itqf.dao.RegisterDao;
import com.itqf.domain.User;
import com.itqf.test.JDBCUtils;

public class RegisterDaoImpl implements RegisterDao {

	@Override
	public User registerDao(User user) {
		// TODO Auto-generated method stub
		QueryRunner runner = new QueryRunner(JDBCUtils.getSource());
		String sql = "select username from stu where username=?;";
		User user2 = null;
		try {
			user2 = runner.query(sql, new BeanHandler<User>(User.class), user.getUsername());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user2;
	}

	@Override
	public int registerDaoIn(User user) {
		// TODO Auto-generated method stub
		QueryRunner runner = new QueryRunner(JDBCUtils.getSource());
		String sql = "insert into stu(username,pwd) value(?,?);";
		int count = 0;
		try {
			count = runner.update(sql, user.getUsername(), user.getPwd());

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}

}
