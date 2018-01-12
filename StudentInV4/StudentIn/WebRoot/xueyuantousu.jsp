<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'xueyuantousu.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
	<script type="text/javascript" src="js/jquery.validate.js"></script>
	<script type="text/javascript" src="js/messages_zh.js"></script>
	<script type="text/javascript">
		$(document).ready( function(){
				$("form").validate({
					reles:{
				content:{
						required: true
					}
					},
					messages: {
					content:{
						required:"投诉内容不能为空"
					}
					}
				})
				
		});
	</script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style type="text/css">
	div{
		width: 500px;
		height: 400px;
		border: solid 2px black;
	}
	span{
		font-size: 20px;
		font-weight: 4px;
		color: red;
		
	}
	input {
	width: 100%;
	height: 100%;
}
	.in1{
		width: 80px;
		height: 38px;
		background-color: #6fb3e0;
		margin: 0 40;
		color: white;
	}
	#d1{
		background-color: #abbac3;
		color: white;
	}
	</style>
  </head>
  
  <body>
  <center>
  <br><br><br>
 	<span> 投诉内容：<span><br>
    <div>
   	<form  action="/StudentIn/servlet/TouSuServlet" method="post">
    <textarea name="content" style="width: 100%;height: 90%;" rows="50" cols="100" placeholder="本投诉是匿名投诉，你所提交的内容不会暴露你的信息"></textarea>
    <input class="in1" type="button" value="提交" onclick="bt()">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <input class="in1" id="d1" type="reset" value="重置"> 
    </form>
    </div>
    </center>
  </body>
  <script type="text/javascript">
  	function bt(p){
  	var name=document.getElementsByName("content")[0];
  		confirm("确定提交吗");
  		name.value="";
  		alert("提交成功！");
  		
  	}
  </script>
</html>
