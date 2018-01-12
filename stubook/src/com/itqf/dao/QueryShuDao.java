package com.itqf.dao;

import java.sql.SQLException;
import java.util.List;

import com.itqf.domain.Product;
import com.itqf.domain.Student;

public interface QueryShuDao {
	public List<Product> queryShu()throws SQLException;
	public List<Student> queryShuPerson()throws SQLException;
}
