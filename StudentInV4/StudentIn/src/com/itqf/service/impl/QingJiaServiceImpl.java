package com.itqf.service.impl;

import java.sql.SQLException;

import com.itqf.dao.QingJiaDao;
import com.itqf.dao.impl.QingJiaDaoImpl;
import com.itqf.domain.XueSheng;
import com.itqf.exception.Myexception;
import com.itqf.service.QinJiaService;

public class QingJiaServiceImpl implements QinJiaService {

	@Override
	public void QingJiaService(XueSheng sheng) throws SQLException, Myexception {
		// TODO Auto-generated method stub
		QingJiaDao dao = new QingJiaDaoImpl();
		int update = dao.QingJiaUpdate(sheng);
		if (update > 0) {

		} else {
			throw new Myexception("����д���");
		}

	}

}
