package com.itqf.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.itqf.dao.LoginDao;
import com.itqf.domain.Student;
import com.itqf.utils.JDBCUtils;

public class LoginDaoImpl implements LoginDao {

	@Override
	public Student Login(Student student) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtils.getSource());
		String sql="select * from stubook where username=? and password=?;";
		Student student2 = runner.query(sql, new BeanHandler<Student>(Student.class),student.getUsername(),student.getPassword());
		return student2;
	}

}
