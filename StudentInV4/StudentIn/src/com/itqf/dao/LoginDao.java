package com.itqf.dao;

import com.itqf.domain.User;

public interface LoginDao {
	public User QueryByLogin(User user);
}
