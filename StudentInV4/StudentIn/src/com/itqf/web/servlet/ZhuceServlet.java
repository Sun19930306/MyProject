package com.itqf.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itqf.domain.User;
import com.itqf.exception.Myexception;
import com.itqf.service.RegisterQueryService;
import com.itqf.service.impl.RegisterQueryServiceImpl;

public class ZhuceServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("value");
		User user = new User();
		user.setUsername(username);
		RegisterQueryService registerQueryService = new RegisterQueryServiceImpl();

		try {
			User user2 = registerQueryService.registerQueryService(user);
			String flag = "false";
			if (user2 == null) {

				flag = "true";

			}

			response.getWriter().print(flag);
		} catch (Myexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
