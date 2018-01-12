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
    
    <title>My JSP 'personMoney.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
  </head>
  
  <body>
   <!--   This is my JSP page. 这是返回来的钱<br>
    <div>${username }   +    ${money }</div>-->
   <center>
   <h1>个人账户详情</h1>
    <table bordercolor="black" border="1px" cellspacing="0" style="width: 60%;height: 50px;  margin-top: 50px;text-align: center;">
    	<tr>
    		<td>用户名</td>
    		<td>余额</td>
    		<td>我的金豆</td>
    		<td>我的级别</td>
    	</tr>
    	<tr>
    		<td>${username }</td>
    		<td>${money }</td>
    		<td>30</td>
    		<td>
    		<c:choose>
			
			<c:when test="${money>8000 }">
			超级VIP
			</c:when>
			<c:when test="${money>5000 }">
			钻石会员
			</c:when>
			<c:when test="${money>3000 }">
			铂金会员
			</c:when>
			<c:when test="${money>2000 }">
			黄金会员
			</c:when>
			<c:when test="${money>1000 }">
			白银会员
			</c:when>
			<c:otherwise>
			黄铜会员
			</c:otherwise>
		</c:choose>
    		</td>
    	</tr>
    </table>
    <br><br>
    <div style="width: 100%;height: 50px; background-color: lightblue"></div>
    </center>
  </body>
</html>
