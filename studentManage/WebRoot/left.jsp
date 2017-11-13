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
	<link rel="stylesheet" type="text/css" href="style/left.css">
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$("aa").click(function(){
				var text = $(this).text();
				alert(text);
			})
		});
	</script>
  </head>
  <body id="body">
  <table border="0" width="180px">
  <tr class="list"><td><font><a href="main.jsp" target="_parent">学生信息管理</a></font></td></tr>
  	<tr class="list"><td><a href="add.jsp" target="body">添加学生信息</a></td></tr>
  	<tr class="list"><td><a href="CRUD.action?method=selectBypage" target="body">查询学生信息</a></td></tr>
  	<tr class="list"><td><a href="CRUD.action?method=getAll" target="body">学生信息维护</a></td></tr>
  	<tr class="list"><td><font><a href="login.jsp" target="_parent">退出系统</a></font></td></tr>
  </table>
  </body>
</html>
