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
	<link rel="stylesheet" type="text/css" href="style/change.css">
  </head>
  
  <body>
 	<div id="top"><div id="inner">添加学生信息</div></div>
  <center>
  	<form action="CRUD.action?method=change&id=${requestScope.stu.id }" method="post">
  	<table style="margin-top: 50px">
  		<tr class="list">
  			<td>姓名：</td>
  			<td><input type="text" value="${requestScope.stu.name }" disabled="disabled"></td>
  		</tr>
  		<tr class="list">
  			<td>年龄：</td>
  			<td><input type="text" value="${requestScope.stu.age }" name="age"></td>
  		</tr>
  		<tr class="list">
  			<td>性别：</td>
  			<td><input type="text" value="${requestScope.stu.sex }" name="sex"></td>
  		</tr>
  		<tr class="list">
  			<td>专业：</td>
  			<td><input type="text" value="${requestScope.stu.major }" name="major"></td>
  		</tr>
  		<tr class="list">
  			<td>籍贯：</td>
  			<td><input type="text" value="${requestScope.stu.addr }" name="addr"></td>
  		</tr>
  		<tr class="list">
  			<td colspan="2" style="text-align: center"><input type="submit" value="提交">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  			<input type="reset" value="重置"></td>
  		</tr>
  	</table>
  	</form>  
  </center>
  	
  </body>
</html>
