package com.itqf.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itqf.service.ShowUserService;
import com.itqf.service.impl.ShowUserServiceImpl;

public class ShowUserServlet extends HttpServlet {


	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String _page = request.getParameter("page");
		ShowUserService service = new ShowUserServiceImpl();

		int page = 1;
		if (_page != null && _page.matches("\\d+")) {
			page = Integer.parseInt(_page);
		}
		Map<String, Object> map = service.query(page);
		request.setAttribute("list", map.get("list"));
		request.setAttribute("page", page);
		request.setAttribute("pageCount", map.get("pageCount"));
		request.getRequestDispatcher("/right.jsp").forward(request, response);
	}

	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
