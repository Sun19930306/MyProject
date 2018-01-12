package com.itqf.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itqf.service.SearchMoneyService;
import com.itqf.service.impl.SearchMoneyServiceImpl;

/**
 * Servlet implementation class SSearchMoney
 */
@WebServlet("/SSearchMoney")
public class SSearchMoney extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SSearchMoney() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().print("这是查询余额的方法");
		SearchMoneyService service=new SearchMoneyServiceImpl();
		String  username =(String) request.getServletContext().getAttribute("username");
		try {
			double monye = service.searchMonye(username);
			request.setAttribute("username", username);
			request.setAttribute("money", monye);
			request.getRequestDispatcher("personMoney.jsp").forward(request, response);
			System.out.println(monye);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
