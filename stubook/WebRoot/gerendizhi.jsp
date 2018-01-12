<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'gerendenlu.jsp' starting page</title>
    
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
  <center><br><br><br><br>
  <h1>个人收货 地址</h1>
    <table border="1" style="text-align: center; width: 60%;" cellspacing="0">
  <tr>
  	<th>个人姓名</th>
    <th>我的电话</th>
    <th>我的住址</th>
  </tr>
  <tr>
  <td>孙奉明</td>
    <td>15075850779</td>
    <td>河北省衡水市桃城区恒茂城3单元5号</td>
  </tr>
</table><br><br>
<button>添加</button>
<button>删除</button>
</center>
  </body>
</html>
