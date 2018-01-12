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
import com.itqf.service.QueryShuService;
import com.itqf.service.SSearchBooksService;
import com.itqf.service.impl.QueryShuServiceImpl;
import com.itqf.service.impl.SSearchBooksServiceImpl;

/**
 * Servlet implementation class SSearchBooks
 */
@WebServlet("/SSearchBooks")
public class SSearchBooks extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SSearchBooks() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		String username=(String) request.getServletContext().getAttribute("username");
		response.getWriter().print(username+"这是要查询个人图书的servlet");
		SSearchBooksService service=new SSearchBooksServiceImpl();
		try {
			List<Product> list = service.sSearchBooks(username);
			System.out.println("sSearchBooksServlet层的list"+list);
			double countMoney=0;
			if(list!=null&&list.size()>0){
				for (Product product : list) {
					if(product!=null){
						countMoney+=product.getProduct_price();
					}
					
				}
			}
			
			System.out.println(countMoney+"这是总钱数");
			request.setAttribute("Plist", list);
			request.setAttribute("countMoney", countMoney);
			request.getRequestDispatcher("personalProduct.jsp").forward(request, response);
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
