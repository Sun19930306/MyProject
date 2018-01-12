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
 * Servlet implementation class DeleteManyServlet
 */
@WebServlet("/DeleteManyServlet")
public class DeleteManyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String idString=  request.getParameter("ids");
//		System.out.println(idString);
		String[] ids = idString.split(",");
	   //2.调用service层
		ProductService productService=new ProductServiceImpl();
		try {
			productService.deleteManyProducts(ids);
			//request.getRequestDispatcher("list").forward(request, response);
		} catch (SQLException e) {
			e.printStackTrace();
			//request.getRequestDispatcher("list").forward(request, response);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//删除失败
			//request.getRequestDispatcher("list").forward(request, response);
		}finally {
			request.getRequestDispatcher("QueryShu").forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
