package com.itqf.service.impl;

import java.util.Map;

import com.itqf.dao.ShowUser;
import com.itqf.dao.impl.ShowUserDaoImpl;
import com.itqf.service.ShowUserService;

public class ShowUserServiceImpl implements ShowUserService {
	private ShowUser user = new ShowUserDaoImpl();

	public Map<String, Object> query(int page) {
		return user.query(page);
	}
}
