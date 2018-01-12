package com.itqf.dao;

import java.sql.SQLException;

import com.itqf.domain.Student;

public interface LoginDao {
	public Student Login(Student student)throws SQLException;
}
