package com.itqf.service;

import java.sql.SQLException;

import com.itqf.domain.XueSheng;
import com.itqf.exception.Myexception;

public interface QinJiaService {
	public void QingJiaService(XueSheng sheng) throws SQLException, Myexception;
}
