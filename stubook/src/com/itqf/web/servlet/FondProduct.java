package com.itqf.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itqf.domain.Product;
import com.itqf.service.ProductService;
import com.itqf.service.impl.ProductServiceImpl;

/**
 * Servlet implementation class FondProduct
 */
@WebServlet("/FondProduct")
public class FondProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FondProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("这是模糊查询"+"Served at: ").append(request.getContextPath());
		String product_id = request.getParameter("product_id");
		String product_category = request.getParameter("product_category");
		String product_name = request.getParameter("product_name");
		String minprice = request.getParameter("minprice");
		String maxprice = request.getParameter("maxprice");
		ProductService productService =new ProductServiceImpl();
		  try {
			List<Product> list = productService.queryManyCondition(product_id,product_category,product_name,minprice,maxprice);
		    System.out.println("======"+list);
		    
		    request.setAttribute("list", list);
		    request.getRequestDispatcher("searchproject.jsp").forward(request, response);
		  } catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
