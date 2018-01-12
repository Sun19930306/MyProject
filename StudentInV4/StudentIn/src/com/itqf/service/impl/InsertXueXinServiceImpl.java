package com.itqf.service.impl;

import java.sql.SQLException;

import com.itqf.dao.InsertXueXinDao;
import com.itqf.dao.impl.InsertXueXinDaoImpl;
import com.itqf.domain.XueXin;
import com.itqf.exception.Myexception;
import com.itqf.service.InsertXueXinService;

public class InsertXueXinServiceImpl implements InsertXueXinService {

	@Override
	public int InsertXueXin(XueXin xueXin) throws SQLException, Myexception {
		// TODO Auto-generated method stub
		InsertXueXinDao dao=new InsertXueXinDaoImpl();
		
		 int xin = dao.insertXueXin(xueXin);
		if(xin>0){
			return xin;
		}else {
			throw new Myexception("插入到数据库有错误！");
		}
	}

}
