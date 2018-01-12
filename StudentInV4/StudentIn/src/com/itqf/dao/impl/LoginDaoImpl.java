package com.itqf.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.itqf.dao.LoginDao;
import com.itqf.domain.User;
import com.itqf.test.JDBCUtils;

public class LoginDaoImpl implements LoginDao {

	@Override
	public User QueryByLogin(User user) {
		// TODO Auto-generated method stub
		QueryRunner runner = new QueryRunner(JDBCUtils.getSource());

		String sql = "select * from stu where username=? and pwd=?;";
		User user2 = null;
		try {
			user2 = runner.query(sql, new BeanHandler<User>(User.class), user.getUsername(), user.getPwd());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user2;
	}

}
