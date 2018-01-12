package com.itqf.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itqf.service.AddCarService;
import com.itqf.service.impl.AddCarServiceImpl;

/**
 * Servlet implementation class AddCar
 */
@WebServlet("/AddCar")
public class AddCar extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AddCar() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().print("这是添加到购物车的内容Servlet");
//		response.getWriter().append("Served at: ").append(request.getContextPath());

		String ids = request.getParameter("ids");
		String username = (String)request.getServletContext().getAttribute("username");
		System.out.println("得到的ids是"+ids+"得到的名字是："+username);
		AddCarService service=new AddCarServiceImpl();
		try {
			int count = service.addCar(ids, username);
//			System.out.println("****插入成功****");
//			response.getWriter().print("加入成功，请继续购物！");
//			response.setHeader("refresh", "2;url=SQueryShu");
			request.getRequestDispatcher("SQueryShu").forward(request, response);
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
