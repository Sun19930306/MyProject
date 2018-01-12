package com.itqf.web.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itqf.domain.ProductAndStudent;
import com.itqf.service.SearchPersonInfoService;
import com.itqf.service.impl.SearchInfoPersonServiceImpl;

/**
 * Servlet implementation class QueryShuPerson
 */
@WebServlet("/QueryShuPerson")
public class QueryShuPerson extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QueryShuPerson() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().print("这是买书人的信息");
		SearchPersonInfoService service=new SearchInfoPersonServiceImpl();
		try {
			List<ProductAndStudent> listPerson = service.searchPersonInfo();
			System.out.println(listPerson+"这是查询的是个人信息的数据");
			request.setAttribute("listPerson", listPerson);
			request.getRequestDispatcher("BuyProductPerson.jsp").forward(request, response);
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
