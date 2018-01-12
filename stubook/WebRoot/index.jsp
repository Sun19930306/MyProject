<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
		body {
			
			background-image: url("img/denglu.jpg");
			background-repeat: no-repeat;
			
			background-position: 435px 120px;
}
	</style>
</head>


<body>
	<%
		Cookie[] cookies = request.getCookies();
		if (cookies != null && cookies.length > 0) {
			String userString = "";
			String checkString = "";
			for (Cookie cookie : cookies) {
				String name = cookie.getName();
				if (name.equals("userinfo")) {
					userString = cookie.getValue();
					checkString = "checked";
					String[] strings = userString.split("&");
					request.setAttribute("username", strings[0]);
					request.setAttribute("password", strings[1]);
					request.setAttribute("checkString", checkString);
				}
			}

		}
	%>
	<center>
	<div>
		<form action="Login" method="post">
		<br><br><br><br><br><br><br><br><br>
			
			<table style="text-align: center;">
				<tr style="height: 80px;">
					<th colspan="2" style="font-size: 40px; font-family: fantasy;">学生图书管理</th>
					
				</tr>
				
				<tr>
					<td>用户名：</td>
					<td><input type="text" name="username" value="${username }"></td>
				</tr>
				<tr>
					<td>密码：</td>
					<td><input type="password" name="password"
						value="${password }"></td>
				</tr>
				<tr>
					<td>记住密码：</td>
					<td><input type="checkbox" name="ch1" ${checkString }></td>
				</tr>
				<tr>
					<td>自动登录:</td>
					<td><input type="checkbox" name="ch2"></td>
				</tr>
				<tr>
					<td><input type="submit" value="登录"></td>
					<td><input type="button" value="注册"></td>
				</tr>
			</table>
		</form>
	</div>
	</center>
</body>
</html>
