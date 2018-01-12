package com.itqf.dao;

import java.sql.SQLException;
import java.util.List;

import com.itqf.domain.XueSheng;

public interface QingJiaDao {
	public int QingJiaUpdate(XueSheng sheng) throws SQLException;
	public List<XueSheng> QueryQingJiaDao(XueSheng sheng) throws SQLException;
}
