package com.itqf.dao.impl;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.itqf.dao.InsertXueXinDao;
import com.itqf.domain.XueXin;
import com.itqf.test.JDBCUtils;

public class InsertXueXinDaoImpl implements InsertXueXinDao{

	@Override
	public int insertXueXin(XueXin xueXin) throws SQLException {
		// TODO Auto-generated method stub
		QueryRunner runner=new QueryRunner(JDBCUtils.getSource());
		String sql="insert into XueXin(fileurl,username,sex,age,email,major,level,hometown,hoby) values(?,?,?,?,?,?,?,?,?);";
		return 	runner.update(sql, xueXin.getFileurl(),xueXin.getUsername(),xueXin.getSex(),xueXin.getAge(),xueXin.getEmail(),xueXin.getMajor(),xueXin.getLevel(),xueXin.getHometown(),xueXin.getHoby());
		
	}

}
