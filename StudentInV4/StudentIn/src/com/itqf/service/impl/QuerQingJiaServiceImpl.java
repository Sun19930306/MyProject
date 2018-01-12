package com.itqf.service.impl;

import java.sql.SQLException;
import java.util.List;

import com.itqf.dao.QingJiaDao;
import com.itqf.dao.impl.QingJiaDaoImpl;
import com.itqf.domain.XueSheng;
import com.itqf.exception.Myexception;
import com.itqf.service.QueryQingJiaService;

public class QuerQingJiaServiceImpl implements QueryQingJiaService {

	@Override
	public List<XueSheng> QueryQingjia(XueSheng sheng) throws SQLException, Myexception {
		// TODO Auto-generated method stub
		QingJiaDao dao=new QingJiaDaoImpl();
		List<XueSheng> list = dao.QueryQingJiaDao(sheng);
		if(!list.isEmpty()){
			return list;
		}else {
			throw new Myexception("数据库查询错误");
		}
	}
	
}
