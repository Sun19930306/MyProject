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
    
    <title>My JSP 'shumuzhanshi.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
$(document).ready(function() {
	$("#ckAll").click(function() {
		$("input[name='ckOne']").each(function(index, docElement) {	
			if($("#ckAll").is(":checked")){
				$(this).attr("checked",true);
			}else{
				$(this).removeAttr("checked");
			}
		});
	});
	$("input[name='ckOne']").click(function() {
		var  checkedNum=  $("input[name='ckOne']:checked").length;
		var  allCheckBox=  $("input[name='ckOne']").length;
		if (checkedNum==allCheckBox) {
			$("#ckAll").attr("checked", true);
		}else{
			$("#ckAll").removeAttr("checked");
		}
		
	});
	
	$("#deleteMany").click(function() {
		var result="";
		$("input[name='ckOne']:checked").each(function(index, docElem) {
			if(index>0){
				result+=",";
			}
			result+=$(this).val();
		});	
	
		window.location.href="DeleteManyServlet?ids="+result;
	});	
});
</script>




  </head>
  
  <body>
 <h1 style="text-align: center;">所有图书</h1>
 <button type="button" id="deleteMany" name="deleteMany" value="批量删除"
							class="button_deleteMany" style="margin-left: 980px;height: 40px;width: 80px;" >批量删除
						</button>
    <table cellspacing="0" cellpadding="1" rules="all"
							bordercolor="gray" border="1" id="DataGrid1"
							style="BORDER-RIGHT: gray 1px solid; BORDER-TOP: gray 1px solid; BORDER-LEFT: gray 1px solid; WIDTH: 100%; WORD-BREAK: break-all; BORDER-BOTTOM: gray 1px solid; BORDER-COLLAPSE: collapse; BACKGROUND-COLOR: #f5fafe; WORD-WRAP: break-word">
							<tr
								style="FONT-WEIGHT: bold; FONT-SIZE: 12pt; HEIGHT: 25px; BACKGROUND-COLOR: #afd1f3">
						  	<td align="center" width="9%"><input type="checkbox" name="ckAll"  id="ckAll"/>全选/反选</td>
								<td align="center" width="12%">图书编号</td>
								<td align="center" width="12%">图书名称</td>
								<td align="center" width="12%">图书图标</td>
								<td align="center" width="9%">图书价格</td>
								<td align="center" width="9%">图书数量</td>
								<td width="8%" align="center">图书类别</td>
								<td width="8%" align="center">编辑</td>
								<td width="8%" align="center">删除</td>
							</tr>

							   <c:forEach var="item" items="${list }">
								<tr onmouseover="this.style.backgroundColor = 'white'"
									onmouseout="this.style.backgroundColor = '#F5FAFE';">
								 	<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="15"><input type="checkbox" name="ckOne" value="${item.product_id}"/></td> 
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="15">${item.product_id}</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="15%">${item.product_name }</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="15%"><img src="http://localhost/allimg/${item.product_url}" alt="加载失败"
										  width="75px" height="100px" border="1" "/></td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="8%">${item.product_price}</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center"
										width="8%">${item.product_num}</td>
									<td style="CURSOR: hand; HEIGHT: 22px" align="center">${item.product_category}</td>
									<td align="center" style="HEIGHT: 22px" width="7%"><a
										href="${pageContext.request.contextPath}/QueryShuById?id=${item.product_id}">
											修改图书 </a>
									</td>

									<td align="center" style="HEIGHT: 22px" width="7%"><a
										href="${pageContext.request.contextPath}/DeleteManyServlet?ids=${item.product_id}">
											删除
									</a>
									</td>
								</tr>
					  </c:forEach>  
						</table>
  </body>
</html>
