<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'xuexin.jsp' starting page</title>
    
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
   		<form id="fm" action="/StudentIn/servlet/PageUpdate" method="POST" enctype="multipart/form-data">
    	
    	
    	<table border="2" cellspacing="0" style="margin: 0 auto;width:60%; height:300px" >
    	<tr>
    	<td>
    	
    	<img alt="图片找不到了" src="http://localhost/allimg/${filename }" width="100px" height="100px">
    	<input type="file" name="file" id="in1"/><input type="button" value="图像上传" onclick="btnclick()"/>
    	</td>
		<td>计算机专业</td>
		<tr height="400px">
		<td colspan="2"><textarea style="width: 100%" rows="20" cols="50">
					    升学历程
     从大学一年级到现在已经有一段时间了，自己的生活已经有了很大的变化，想让自己的生活变得更好，在这四年 的时间里会变的更好!

		</textarea></td>
		</tr>
		
    	</tr>
    	</table>
    	</form>
  </body>
  <script type="text/javascript">
  function btnclick(){
				  	var in1=document.getElementById("in1");
				  	var file=in1.files[0];
				  	var size=file.size;
				  	if(size > 1024*1024*5){
						 alert("图片过大")
						}else{
						
						   var fm = document.getElementById("fm");
						   fm.submit();
						}
  }
  </script>
</html>
