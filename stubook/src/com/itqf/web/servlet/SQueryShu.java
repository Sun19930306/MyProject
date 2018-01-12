package com.itqf.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itqf.domain.Product;
import com.itqf.service.QueryShuService;
import com.itqf.service.ShowProductService;
import com.itqf.service.ShowProductService;
import com.itqf.service.impl.QueryShuServiceImpl;
import com.itqf.service.impl.ShowProductServiceImpl;
import com.itqf.service.impl.ShowProductServiceImpl;

/**
 * Servlet implementation class SQueryShu
 */
@WebServlet("/SQueryShu")
public class SQueryShu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SQueryShu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub	
		String _page = request.getParameter("page");
		ShowProductService service=new ShowProductServiceImpl();
		int page = 1;
		if (_page != null && _page.matches("\\d+")) {
			page = Integer.parseInt(_page);
		}
		
		Map<String, Object> map = service.query(page);
		request.setAttribute("list1", map.get("list"));
		System.out.println(map.get("list"));
		request.setAttribute("page", page);
		request.setAttribute("pageCount", map.get("pageCount"));
		request.getRequestDispatcher("sshumuzhanshi.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
