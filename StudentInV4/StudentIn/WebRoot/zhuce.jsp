<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'zhuce.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<link rel="stylesheet" type="text/css" href="css/zhuce.css">
	<script type="text/javascript" src="js/jquery-1.8.3.js"></script>
	<script type="text/javascript" src="js/jquery-1.11.0.js"></script>
	<script type="text/javascript" src="js/jquery.validate.js"></script>
	<script type="text/javascript" src="js/messages_zh.js"></script>
	
	<script type="text/javascript">
	$(document).ready(function(){
		$("form").validate({
		rules:{
			username:{
			required:true
			},
			password1:{
			required:true
			},
			password2:{
			required:true
			},
			yanzhengma:{
			required:true
			}
		},
		messages:{
			username:{
			required:"用户名不能为空"
			},
			password1:{
			required:"密码不能为空"
			},
			password2:{
			required:"验证密码不能为空"
			},
			yanzhengma:{
			required:"验证码不能为空"
			}
		}
	})
		}
	);
	</script>
  </head>
  
  <body>

    <div id="d1">
		<form action="/StudentIn/servlet/Servlet4" method="post">
		
			<input type="text" name="username" id="in1"  placeholder="用户名/手机号" onkeyup="yhm(this)" />
			<span id="sp1"></span>
			<br />
		
			<input type="password" name="password1" id="in2"  placeholder="密码" /><br />
			<input type="password" name="passwordd2" id="in3"  placeholder="验证密码" onkeyup="mima()" />
			<span id="sp2">
			</span>
			<br />
			<input type="text" name="yanzhengma" id="in4"  placeholder="验证码" onkeyup="yanzheng(this)" /><span id="sp3">
			</span><br>
			<img alt="获取验证码" src="/StudentInfo/servlet/Servlet2" onclick="chyan()"><a href="javascript:chyan()">看不清换一张</a>
			<br />
			<input type="submit" name="age" id="in5" value="注册" /><br />
		</form>
		
	</div>
	
 	
	<script type="text/javascript">
	
	
		function chyan(){
		var img=document.getElementsByTagName("img")[0];
		img.src="/StudentIn/servlet/Servlet2?count="+Math.random();
		}
		
		var sp1=document.getElementById("sp1");
		
		function yhm(ipt){
					var value=ipt.value;
					if(value!=null && value!="")
					{
					
					//ajax
		 			if (window.XMLHttpRequest)
					{
					    //  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
					    xmlhttp=new XMLHttpRequest();
					}
					else
					{
					    // IE6, IE5 浏览器执行代码
					    xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
					}
					xmlhttp.onreadystatechange=function()
					{
						if (xmlhttp.readyState==4 && xmlhttp.status==200)
						{
							var result=xmlhttp.responseText;
							if(result=="true"){
							sp1.innerHTML="";
							sp1.innerHTML="<font color='green'>可以注册！</font>";
							}else{
							sp1.innerHTML="";
							
							sp1.innerHTML="<font color='red'>用户已注册！</font>";
							
							}
							
						}
					}
					xmlhttp.open("GET","/StudentIn/servlet/ZhuceServlet?value="+value);
					xmlhttp.send();
					}
				}
			function mima(){
			var sp2=document.getElementById("sp2");
			var value1= document.getElementById("in2").value;
			var value2=document.getElementById("in3").value;
			   if(value1==value2){
			   	sp2.innerHTML="<font color='green'>密码一致</font>";
			   }else{
			   	sp2.innerHTML="<font color='red'>密码不一致</font>"
			   }
			}
			function yanzheng(ipt1){
			var sp3=document.getElementById("sp3");
			var value=ipt1.value;
					if(value!=null && value!="")
					{
					
					//ajax
		 			if (window.XMLHttpRequest)
					{
					    //  IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
					    xmlhttp=new XMLHttpRequest();
					}
					else
					{
					    // IE6, IE5 浏览器执行代码
					    xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
					}
					xmlhttp.onreadystatechange=function()
					{
						if (xmlhttp.readyState==4 && xmlhttp.status==200)
						{
							var result=xmlhttp.responseText;
							if(result=="true"){
							sp3.innerHTML="";
							sp3.innerHTML="<font color='green'>验证码正确！</font>";
							}else{
							sp3.innerHTML="";
							sp3.innerHTML="<font color='red'>验证码不正确！</font>";
							}
							
						}
					}
					xmlhttp.open("GET","/StudentIn/servlet/Servlet5?value="+value);
					xmlhttp.send();
					}
			
			}
			
	</script>
  </body>
</html>
