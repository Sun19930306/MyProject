<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'addProduct.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <!--  <body>
    This is my JSP page. <br>
  </body>-->
  <body>
	<form id="userAction_save_do" name="Form1"
		action="AddProductServlet" method="post"
		enctype="multipart/form-data">
		&nbsp;
		<table cellSpacing="1" cellPadding="5" width="100%" align="center"
			bgColor="#eeeeee" style="border: 1px solid #8ba7e3" border="0">
			<tr>
				<td class="ta_01" align="center" bgColor="#afd1f3" colSpan="4"
					height="26"><strong><STRONG>添加图书</STRONG> </strong>
				</td>
			</tr>


			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">图书名称：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"
					name="product_name" class="bg" value="${product.product_name}"/>
				</td>
				<td align="center" bgColor="#f5fafe" class="ta_01">图书价格：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"
					name="product_price" 
					class="bg"  value="${product.product_price}"/>
				</td>
			</tr>
			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">图书数量：</td>
				<td class="ta_01" bgColor="#ffffff"><input type="text"
					name="product_num" 
					class="bg" value="${product.product_num}" />
				</td>
				<td align="center" bgColor="#f5fafe" class="ta_01">图书类别：</td>
				<td class="ta_01" bgColor="#ffffff"><select name="product_category"
					id="category">
						<option value="" selected="selected">${product.product_category}</option>
						<option value="文学">文学</option>
						<option value="生活">生活</option>
						<option value="计算机">计算机</option>
						<option value="外语">外语</option>
						<option value="经营">经营</option>
						<option value="励志">励志</option>
						<option value="社科">社科</option>
						<option value="学术">学术</option>
						<option value="少儿">少儿</option>
						<option value="艺术">艺术</option>
						<option value="原版">原版</option>
						<option value="科技">科技</option>
						<option value="考试">考试</option>
						<option value="生活百科">生活百科</option>
				</select>
				</td>
			</tr>


			<tr>
				<td align="center" bgColor="#f5fafe" class="ta_01">图书图片：</td>
				<td class="ta_01" bgColor="#ffffff" colSpan="3">
				<input
					type="file" name="product_url" size="30" value="${product.product_url}"/>
				</td>
			</tr>
			<TR>
				<TD class="ta_01" align="center" bgColor="#f5fafe">图书描述：</TD>
				<TD class="ta_01" bgColor="#ffffff" colSpan="3">
				<textarea
						name="product_description" cols="30" rows="3" 
						style="WIDTH: 96%">${product.product_description}</textarea>
				</TD>
			</TR>
			<TR>
				<td align="center" colSpan="4" class="sep1">
				<input type="hidden">
				</td>
			</TR>


			<tr>
				<td class="ta_01" style="WIDTH: 100%" align="center"
					bgColor="#f5fafe" colSpan="4">
					
					
						
					<input type="submit" class="button_ok" value="确定">	
						
					<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT>
					
					
					
					<input type="reset" value="重置" class="button_cancel">

					<FONT face="宋体">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</FONT> <INPUT
					class="button_ok" type="button" onclick="history.go(-1)" value="返回" />
					<span id="Label1">
					
					</span>
				</td>
			</tr>
		</table>
	</form>
</body>
</html>