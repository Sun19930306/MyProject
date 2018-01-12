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

<title>My JSP 'rightfirst.jsp.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<style type="text/css">
input {
	width: 100%;
	border: none;
	text-align: center;
}
</style>
</head>

<body>
	<form id="fm" action="/StudentIn/servlet/XueXinServlet" method="POST"
		enctype="multipart/form-data">
		<table border="2"
			style="margin: 20 auto;text-align: center; width: 50% ;border-color: black;"
			cellspacing="0">
			<tr>
				<td colspan="2"><h2>完善个人信息</h2></td>
			</tr>
			<tr>
			
				<td>个人头像：</td>
				<td><input type="file" name="fileurl" id="in1" /></td>
				
			</tr>
			<tr>
				<td>姓名：</td>
				<td><input type="text" name="username"></td>
			</tr>
			<tr>
				<td>性别：</td>
				<td><input type="text" name="sex"></td>
			</tr>
			<tr>
				<td>年龄：</td>
				<td><input type="text" name="age"></td>
			</tr>
			<tr>
				<td>邮箱：</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>专业：</td>
				<td><input type="text" name="major"></td>
			</tr>
			<tr>
				<td>级别:</td>
				<td><input type="text" name="level"></td>
			</tr>
			<tr>
				<td>籍贯：</td>
				<td><input type="text" name="hometown"></td>
			</tr>
			<tr>
				<td>个人爱好:</td>
				<td><input type="text" name="hoby"></td>
			</tr>
			<tr>
				<td><input type="submit" value="提交" /></td>
				<td><input type="reset" value="重置"></td>
			</tr>
			<br>
		</table>
	</form>
</body>

</html>
