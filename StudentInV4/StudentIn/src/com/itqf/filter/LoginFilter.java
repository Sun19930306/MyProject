package com.itqf.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itqf.domain.User;
import com.itqf.exception.Myexception;
import com.itqf.service.RegisterQueryService;
import com.itqf.service.impl.RegisterQueryServiceImpl;

public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		// System.out.println("=================");
		// System.out.println(username+pwd+"------");
		User user = new User();
		user.setUsername(username);
		user.setPwd(pwd);
		RegisterQueryService registerQueryService = new RegisterQueryServiceImpl();
		User user2 = null;
		try {
			user2 = registerQueryService.registerQueryService(user);
			if (user2 == null) {
				response.getWriter().print("用户名不存在请前去注册，3秒转回登录界面<br/>");
				response.setHeader("refresh", "3;url=../index.jsp");
			}
		} catch (Myexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (username.equals("")) {
			response.getWriter().print("用户名不能为空！3秒转回登录界面<br/>");
			response.setHeader("refresh", "3;url=../index.jsp");
		} else {
			if (pwd.equals("")) {
				response.getWriter().print("密码不能为空！3秒转回登录页面");
			} else {
				arg2.doFilter(request, response);
			}

		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
