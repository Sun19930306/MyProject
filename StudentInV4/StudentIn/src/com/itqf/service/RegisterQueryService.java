package com.itqf.service;

import com.itqf.domain.User;
import com.itqf.exception.Myexception;

public interface RegisterQueryService {
	public User registerQueryService(User user) throws Myexception;

	public int registerQueryServiceIn(User user);
}
