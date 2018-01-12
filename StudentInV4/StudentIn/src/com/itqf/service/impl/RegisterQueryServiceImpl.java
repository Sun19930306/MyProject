package com.itqf.service.impl;

import com.itqf.dao.RegisterDao;
import com.itqf.dao.impl.RegisterDaoImpl;
import com.itqf.domain.User;
import com.itqf.exception.Myexception;
import com.itqf.service.RegisterQueryService;

public class RegisterQueryServiceImpl implements RegisterQueryService {

	@Override
	public User registerQueryService(User user) throws Myexception {
		// TODO Auto-generated method stub
		RegisterDao registerDao = new RegisterDaoImpl();
		User user2 = registerDao.registerDao(user);
		if (user2 == null) {
			return user2;
		}
		throw new Myexception("���û��Ѿ�ע�ᣡ");
	}

	@Override
	public int registerQueryServiceIn(User user) {
		// TODO Auto-generated method stub
		RegisterDao registerDao = new RegisterDaoImpl();
		int count = registerDao.registerDaoIn(user);
		return count;
	}

}
