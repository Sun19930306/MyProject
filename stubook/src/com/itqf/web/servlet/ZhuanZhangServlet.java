package com.itqf.web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itqf.service.ZhuanZhangService;
import com.itqf.service.impl.ZhuanZhangServiceImpl;

/**
 * Servlet implementation class ZhuanZhangServlet
 */
@WebServlet("/ZhuanZhangServlet")
public class ZhuanZhangServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ZhuanZhangServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String countMoney = request.getParameter("countMoney");
		double money = Double.parseDouble(countMoney);
//		System.out.println("提交的钱数"+countMoney+request.getServletContext().getAttribute("username"));
		String username =(String) request.getServletContext().getAttribute("username");
		ZhuanZhangService service=new ZhuanZhangServiceImpl();
		service.zhuanZhang(username, "c_lisi", money);
		System.out.println("****转账成功*****");
		request.getRequestDispatcher("SSSearchMoney?uname="+username).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
