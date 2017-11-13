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
	<link rel="stylesheet" type="text/css" href="style/add.css">
  </head>
  
  <body>
  <div>
  	<div id="top"><div id="inner">添加学生信息</div></div>
  	<div id="area">
    <form action="CRUD.action?method=add" method="post">
    	<table style="text-align: center">
    	<tr>
    		<td>姓名:</td>
    		<td><input type="text" name="name"></td>
    	</tr>
    	<tr>
    		<td>年龄:</td>
    		<td><input type="text" name="age"></td>
    	</tr>
    	<tr>
    		<td>性别:</td>
    		<td><input type="radio" value="男" name="sex">男&nbsp;&nbsp;&nbsp;
    			<input type="radio" value="女" name="sex">女</td>
    	</tr>
    	<tr>
    		<td>专业:</td>
    		<td><input type="text" name="major"></td>
    	</tr>
    	<tr>
    		<td>籍贯:</td>
    		<td><input type="text" name="addr"></td>
    	</tr>
    	<tr>
    		<td><input type="submit" value="添加"></td>
    		<td>&nbsp;&nbsp;&nbsp;<input type="reset" value="重置"></td>
    	</tr>
    </table>
    </form>
    </div>
  </div>
    
  </body>
</html>
