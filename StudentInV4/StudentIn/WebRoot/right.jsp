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
    
    <title>My JSP 'right.jsp' starting page</title>
 
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	   <script type="text/javascript" src="js/xhr.js"></script>

  </head>
  
  <body>
	<table border="1" width="80%" cellspacing="0" style="margin: 0 auto;margin-top: 100;text-align: center;" >
	<tr>
		<td>个人头像</td>
		<td>用户名</td>
		<td>性别</td>
		<td>年龄</td>
		<td>email</td>
		<td>专业</td>
		<td>级别</td>
		<td>籍贯</td>
		<td>个人爱好</td>
	</tr>
	<c:forEach items="${list }" var="xueXin">
		<tr>
			<td>
				<img alt="个人头像" src="http://localhost/allimg/${xueXin.fileurl }" style="width: 80px;height: 100px">
			</td>
			<td>
				${xueXin.username }
			</td>
			<td>
				${xueXin.sex }
			</td>
			<td>
				${xueXin.age }			
			</td>
			<td>
				${xueXin.email }			
			</td>
			<td>
				${xueXin.major }			
			</td>
			<td>
				${xueXin.level }			
			</td>
			<td>
				${xueXin.hometown }			
			</td>
			<td>
				${xueXin.hoby }			
			</td>
		</tr>
	</c:forEach>
	</table>
	<br/>
	<center>
	<c:if test="${page!=1 }">
	<a href="<c:url value='/servlet/ShowUserServlet?page=${page-1 }'/>" >上一页</a>&nbsp;
	</c:if>
	<c:forEach begin="1" end="${pageCount }" var="page">
		<c:choose>
			<c:when test="${pageScope.page==requestScope.page }">
			${page }
			</c:when>
			<c:otherwise>
			<a href="<c:url value='/servlet/ShowUserServlet?page=${page }'/>" >${page }</a>&nbsp;
			</c:otherwise>
		</c:choose>
		
	
	</c:forEach>
	<c:if test="${page!=pageCount }">
	<a href="<c:url value='/servlet/ShowUserServlet?page=${page+1 }'/>" >下一页</a>&nbsp;
	</c:if>
	</center>
  </body>
</html>
