package com.itqf.web.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itqf.exeception.ProductException;
import com.itqf.service.ProductService;
import com.itqf.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class DeletePersonalBook
 */
@WebServlet("/DeletePersonalBook")
public class DeletePersonalBook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeletePersonalBook() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String id=request.getParameter("ids");
		String[] ids = id.split(",");
		System.out.println(ids+"要删除的id");
		ProductService service=new ProductServiceImpl();
		try {
			service.deletePersonalBook(ids);
			System.out.println("已经运行到删除回来的servlet");
			request.getRequestDispatcher("SSearchBooks").forward(request, response);
			
		} catch (SQLException | ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
