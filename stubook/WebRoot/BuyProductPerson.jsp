<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'BuyProductPerson.jsp' starting page</title>
    
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
 <!--    This is my JSP page.这是展示购买图书的人的信息 <br>
    ${listPerson } -->
    <h1 style="text-align: center;">购买人和购买图书</h1>
	<table cellspacing="0" cellpadding="1" rules="all" bordercolor="gray"
		border="1" id="DataGrid1"
		style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
		<tr
			style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">
		<!-- 	<td align="center" width="9%"><input type="checkbox"
				name="ckAll" id="ckAll" />全选/反选</td> -->
			<td align="center" width="12%">购买人</td>
			<td align="center" width="12%">图书名称</td>
			<td align="center" width="12%">图书编号</td>
			<td width="8%" align="center">图书图标</td>
		<!--  	<td width="8%" align="center">删除</td>-->
			
		</tr>

		<c:forEach var="item" items="${listPerson }">
			<tr onmouseover="this.style.backgroundColor = 'white'"
				onmouseout="this.style.backgroundColor = '#F5FAFE';">
				<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="15">${item.username}</td>
				<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="8%">${item.product_name}</td>
				<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="15%">${item.product_id }</td>
				<td style="CURSOR: hand; HEIGHT: 22px" align="center" width="15%"><img
					src="http://localhost/allimg/${item.product_url}" alt="加载失败"
					width="75px" height="100px" border="1" /></td>
				
			</tr>
		</c:forEach>
	</table><br>
  </body>
</html>
