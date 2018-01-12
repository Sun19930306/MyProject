<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
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
		<style>
			/*#d1 {
				width: 100%;
				height: 800px;
				background: blue;
			}*/
			*{
				
			}
			#d2{
				width: 350px;
				height: 300px;
				background: #f7f7f7;
				margin: 220px auto;
			}
			body{
				background: #6fb3e0;
			}
			#in1{
				
				width: 75%;
				display: block;
				margin: 20px auto;
				height: 30px;
			}
			#in2{
				width: 75%;
				display: block;
				margin: 10px auto;
				height: 30px;
			}
			#in3{
				text-align: center;
				height: 35px;
				width: 60px;
				float: right;
				margin: 0px 45px;
				bgcolor:#428BCA;
				
			}
			#in4{
				text-align: center;
				height: 35px;
				width: 60px;
				
				margin: 0px 45px;
				bgcolor:#428BCA;
				
			}
			#h1{
				font-size:27px;
				position: absolute;
				margin-left: 80px;
				
			}
			#d3{
				height: 20%;
				color: #6FB3E0; 
			}
			#d4{
				height: 40%;
				/*border: solid black 2px;*/
			}
			#d5{
				/*height: 10%;*/
				text-align: center;
				border: solid cornflowerblue 2px;
				position: relative;
				top: 32px;
				background: cornflowerblue;
			}
			hr{
				border-color: #d5e3ef;
				width: 75%;
			}
		</style>
  </head>
  
  <body>
   	<div id="d1">
			<div id="d2">
				<div id="d3"><h1 id="h1">学员后台系统</h1>
					
				</div>
				<hr />
				<div id="d4">
				<form action="/StudentIn/servlet/LoginServlet" method="post" id="fm">
					<input name="username" type="text" id="in1" placeholder="身份证号码/学号" />
					<input name="pwd" type="password" id="in2" placeholder="密码" />
					<input id="in3" type="button" value="登陆" onclick="sub()"/>
				</form>
				<form action="zhuce.jsp" method="post" id="fm1">
				<input id="in4" type="button" value="注册" onclick="zhuce()" />
				</form>
				
				</div>
				<div id="d5"><p>2015&copy;</p></div>
				
			</div>
		</div>
		<script type="text/javascript">
			var  fm=document.getElementById("fm");
			var  fm1=document.getElementById("fm1");
			function sub(){
				fm.submit();
			}
			function zhuce(){
				fm1.submit();
			}
			
		</script>
 	  	<!--  <a href="login.jsp">登录</a>
    	<a href="register.jsp">注册</a>-->
  </body>
</html>
