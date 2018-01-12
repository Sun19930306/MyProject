package com.itqf.service;

import java.sql.SQLException;

import com.itqf.domain.Student;

public interface LoginService {
	public Student Login(Student student)throws SQLException;
}
