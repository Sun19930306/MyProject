<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'left.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <center>
		<div style="width: 100%; height: 40px;background: aliceblue;line-height: 40px "><a href="searchproject.jsp" style="font-size: 30px;text-decoration: none;"target="right">&lt;搜索商品&gt;</a></div>
		<br> <a href="SQueryShu" target="right">选购商品</a><br />
		<br><a href="SSearchBooks" target="right">我的商品</a><br><br>
			
		<option><a href="SSearchMoney" target="right">我的余额</a></option>
		<br> <a href="gerendizhi.jsp" target="right">个人地址</a><br /><br>
	<!-- <a href="index.jsp?">退出系统</a> -->	
	<!-- 	<br> <a href="#" target="right">商品投诉</a><br /> -->	
	</center>
  </body>
</html>
