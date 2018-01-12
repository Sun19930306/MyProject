<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'xueyuankaoqin.jsp.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
<script type="text/javascript" src="js/jquery.validate.js"></script>
<script type="text/javascript" src="js/messages_zh.js"></script>
<style type="text/css"></style>
<script type="text/javascript">
	$(document).ready(function() {
		$("form").validate({
			rules : {
				username : {
					required : true
				},
				resone : {
					required : true
				},
				date : {
					required : true
				}
			},
			messages : {
				username : {
					required : "用户名不能为空"
				},
				resone : {
					required : "必须有请假原因"
				},
				date : {
					required : "日期不能为空"
				}
			}
		});
	}
	);
</script>
<style type="text/css">
</style>
</head>

<body>
	<form method="post" action="/StudentIn/servlet/QingJia">

		<table border="1" cellspacing="0" width="60%"
			style="margin: 0 auto;text-align: center; margin-top: 80">
			<tr>
				<td>用户名：</td>
				<td><input type="text" name="username"></td>

			</tr>
			<tr>
				<td>请假原因：</td>
				<td><input type="text" name="resone"></td>
			</tr>
			<td>请假时间 ：</td>
			<td><input type="text" name="date"></td>
			<tr>
				<td><input type="submit" value="提交"></td>
				<td><input type="reset" value="重置" id="in1" onclick="bt1()" />
				</td>
			</tr>
		</table>
	</form><br><br><br>
	
	<table border="1" width="60%" cellspacing="0" style="margin: 0 auto; text-align: center;" >
	<tr>
		<td>用户名</td>
		<td>请假原因</td>
		<td>请假时间</td>
		
	</tr>
	<c:forEach items="${list1 }" var="user">
		<tr>
			
			<td>
				${user.username }
			</td>
			<td>
				${user.resone }
			</td>
			<td>
				${user.date }			
			</td>
		</tr>
	</c:forEach>
	</table>
<div style="width:100%; height: 50px; background-color: #b0c6e6;line-height: 50px;margin-bottom: 1%" >班主任寄语</div>	
	

</body>
<script type="text/javascript">
	var fm = document.getElementById("fm");
	function bt1() {
		fm.submit();
	}
</script>
</html>
