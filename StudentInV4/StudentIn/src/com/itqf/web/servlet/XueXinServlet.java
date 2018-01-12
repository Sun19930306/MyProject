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

import com.itqf.domain.XueXin;
import com.itqf.exception.Myexception;
import com.itqf.service.InsertXueXinService;
import com.itqf.service.impl.InsertXueXinServiceImpl;
import com.itqf.utils.UploadUtils;

public class XueXinServlet extends HttpServlet {

	/**
		 * The doGet method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to get.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String, String> map = UploadUtils.handleUploadForm(request);
		System.out.println(map);
		XueXin bean=new XueXin();
		try {
			BeanUtils.populate(bean, map);
			System.out.println(bean);
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		InsertXueXinService service=new InsertXueXinServiceImpl();
		try {
			service.InsertXueXin(bean);
			System.out.println("*********xuexin运行回来了******");
			request.getRequestDispatcher("/servlet/ShowUserServlet").forward(request, response);
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
