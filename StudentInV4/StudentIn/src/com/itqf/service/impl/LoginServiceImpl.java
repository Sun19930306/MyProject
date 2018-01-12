package com.itqf.service.impl;

import com.itqf.dao.LoginDao;
import com.itqf.dao.impl.LoginDaoImpl;
import com.itqf.domain.User;
import com.itqf.exception.Myexception;
import com.itqf.service.LoginService;

public class LoginServiceImpl implements LoginService {

	@Override
	public User loginService(User user) throws Exception {
		// TODO Auto-generated method stub
		LoginDao loginDao = new LoginDaoImpl();
		User user2 = loginDao.QueryByLogin(user);
		if (user2 != null) {
			return user2;
		} else {

			throw new Myexception("�û�������");
		}
	}

}
