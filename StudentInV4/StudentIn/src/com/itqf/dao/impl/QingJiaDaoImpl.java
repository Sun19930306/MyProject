package com.itqf.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.itqf.dao.QingJiaDao;
import com.itqf.domain.XueSheng;
import com.itqf.test.JDBCUtils;

public class QingJiaDaoImpl implements QingJiaDao {

	@Override
	public int QingJiaUpdate(XueSheng sheng) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner = new QueryRunner(JDBCUtils.getSource());
		String sql = "insert into qingjia(username,resone,date) values(?,?,?);";
		return runner.update(sql, sheng.getUsername(), sheng.getResone(), sheng.getDate());

	}

	@Override
	public List<XueSheng> QueryQingJiaDao(XueSheng sheng) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtils.getSource());
		String sql="select * from qingjia;";
		return 	runner.query(sql, new BeanListHandler<XueSheng>(XueSheng.class));
		
	}
	

}
