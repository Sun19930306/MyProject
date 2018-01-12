package com.itqf.service.impl;

import java.sql.SQLException;

import com.itqf.dao.LoginDao;
import com.itqf.dao.impl.LoginDaoImpl;
import com.itqf.domain.Student;
import com.itqf.service.LoginService;

public class LoginServiceImpl implements LoginService{

	@Override
	public Student Login(Student student) throws SQLException {
		// TODO Auto-generated method stub
		LoginDao dao=new LoginDaoImpl();
		Student student2 = dao.Login(student);
		return student2;
	}
	
}
