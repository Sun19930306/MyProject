package com.itqf.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itqf.exeception.ProductException;
import com.itqf.domain.Product;
import com.itqf.service.ProductService;
import com.itqf.service.impl.ProductServiceImpl;
import com.itqf.utils.UploadUtils;

/**
 * Servlet implementation class AddProductServlet
 */
@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		Map<String, String> map = UploadUtils.handleUploadForm(request);
		Product product =new Product();
		try {
			BeanUtils.populate(product, map);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//配置商品编号
		String product_id= UUID.randomUUID().toString();
		product.setProduct_id(product_id);
		
		System.out.println(product);
		
		
		//2.调用service层
		ProductService productService =new ProductServiceImpl();
		try {
			productService.addProduct(product);
			//添加成功
			request.getRequestDispatcher("QueryShu").forward(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//失败
			request.setAttribute("product", product);
			request.getRequestDispatcher("addProduct.jsp").forward(request, response);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			//失败
			request.setAttribute("product", product);
			request.getRequestDispatcher("addProduct.jsp").forward(request, response);
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
