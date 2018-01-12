package com.itqf.service;

import java.sql.SQLException;
import java.util.List;

import com.itqf.domain.XueSheng;
import com.itqf.exception.Myexception;

public interface QueryQingJiaService {
	public List<XueSheng> QueryQingjia(XueSheng sheng)throws SQLException, Myexception;
}
