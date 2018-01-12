<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'biancheng.jsp' starting page</title>
    
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
  <h3 align="center">学员在校成绩</h3>
    <table border="1" bordercolor="black" cellpadding="1" cellspacing="0" align="center" width="60%">
    	<tr>
			<td colspan="2">大学一年级</td>
			<td colspan="2">大学二年级</td>
			<td colspan="2">大学三年级</td>
			<td colspan="2">大学四年级</td>    	
    	</tr>
    	<tr>
    		<td>上学期</td>
    		<td>下学期</td>
    		<td>上学期</td>
    		<td>下学期</td>
    		<td>上学期</td>
    		<td>下学期</td>
    		<td>上学期</td>
    		<td>下学期</td>
    	</tr>
    </table>
  </body>
</html>
