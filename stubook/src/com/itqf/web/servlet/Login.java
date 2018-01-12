package com.itqf.web.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;

import com.itqf.domain.Student;
import com.itqf.service.LoginService;
import com.itqf.service.impl.LoginServiceImpl;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		Map<String, String[]> map = request.getParameterMap();
		Student student=new Student();
		try {
			BeanUtils.populate(student, map);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LoginService service=new LoginServiceImpl();
		try {
			Student student2 = service.Login(student);
			if(student2!=null){
				String ch1 = request.getParameter("ch1");
				Cookie cookie=new Cookie("userinfo", student2.getUsername()+"&"+student2.getPassword());
//			记住密码
				if(ch1!=null){
					cookie.setMaxAge(5*60);
				}else {
					cookie.setMaxAge(0);
				}
				response.addCookie(cookie);
//			记住密码
//			自动登录	
				String ch2=request.getParameter("ch2");
				Cookie cookie2=new Cookie("autoin", student2.getUsername());
				if(ch2!=null){
					cookie2.setMaxAge(5*60);
				}else {
					cookie2.setMaxAge(0);
				}
				response.addCookie(cookie2);
//			自动登录
//				request.setAttribute("user", student2.getUsername()+"&"+student2.getPassword());
				request.getServletContext().setAttribute("username", student2.getUsername());
				if(student2.getUsername().substring(0, 1).equals("s")){
					response.sendRedirect("welcome.jsp");
				}else {
					response.sendRedirect("cwelcome.jsp");
				}
				
			}else {
				request.getRequestDispatcher("shibai.jsp").forward(request, response);
			}
			
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
