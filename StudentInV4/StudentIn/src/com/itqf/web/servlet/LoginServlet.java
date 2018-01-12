package com.itqf.web.servlet;

import java.io.IOException;

import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itqf.domain.User;
import com.itqf.exception.Myexception;
import com.itqf.service.LoginService;
import com.itqf.service.impl.LoginServiceImpl;

public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String[]> map = request.getParameterMap();
		User user = new User();

		System.out.println("***************�Ѿ�������****************");
		try {
			BeanUtils.populate(user, map);
		} catch (IllegalAccessException | InvocationTargetException e1) {
			System.out.println("========");
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		// String username = request.getParameter("username");
		// String pwd = request.getParameter("pwd");
		// user.setUsername(username);
		// user.setPwd(pwd);

		System.out.println(user.getUsername() + "***************�Ѿ�������****************" + user.getPwd());

		LoginService service = new LoginServiceImpl();
		try {
//			System.out.println("");
			User user2 = service.loginService(user);
			System.out.println("��¼�ɹ��û����ǣ� " + user2.getUsername() + "  �����ǣ� " + user2.getPwd());
			response.sendRedirect("../html/zhanshi.html");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
