package com.itqf.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itqf.domain.XueSheng;
import com.itqf.exception.Myexception;
import com.itqf.service.QinJiaService;
import com.itqf.service.impl.QingJiaServiceImpl;

public class QingJia extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request
	 *            the request send by the client to the server
	 * @param response
	 *            the response send by the server to the client
	 * @throws ServletException
	 *             if an error occurred
	 * @throws IOException
	 *             if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String[]> map = request.getParameterMap();
		XueSheng bean = new XueSheng();
		try {
			BeanUtils.populate(bean, map);
			QinJiaService service = new QingJiaServiceImpl();
			service.QingJiaService(bean);
			
			response.getWriter().print("请假成功");
			
			System.out.println("运行了请假查询");
			request.getRequestDispatcher("/servlet/QueryQingJia?username="+bean.getUsername()+"&resone"+bean.getResone()+"&date"+bean.getDate()).forward(request, response);
//			response.setHeader("refresh", "3;url=../xuexin.jsp");
			System.out.println(bean.getUsername()+":"+bean.getResone()+":"+bean.getDate());

		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Myexception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
