<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'welcome.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	#f1{
		background-color: ;
	}
	</style>
  </head>
  

   <!--  欢迎${username }登录本系统！！！<br>-->
<frameset id="f1" frameborder="yes" border="2" bordercolor="red" rows="50,*">
	<frame src="top.jsp" noresize="noresize" />
	<frameset frameborder="yes" border="1" bordercolor="blue" cols="20%,*">

		<frame src="sleft.jsp" noresize="noresize" />
		<frame name="right" src="right.jsp" noresize="noresize" />
	</frameset>
</frameset>

</html>