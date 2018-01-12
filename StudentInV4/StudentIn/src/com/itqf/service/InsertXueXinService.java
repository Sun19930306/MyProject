package com.itqf.service;

import java.sql.SQLException;

import com.itqf.domain.XueXin;
import com.itqf.exception.Myexception;

public interface InsertXueXinService {
	public int  InsertXueXin(XueXin xueXin)throws SQLException, Myexception;
}
