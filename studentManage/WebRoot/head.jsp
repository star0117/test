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
	<link rel="stylesheet" type="text/css" href="style/head.css">
  </head>
  
  <body style="background-color: #E0EDFE">
  <table border="0" width="100%" height="10px">
  	<tr>
  		<td><img src="image/sc.png"></td>
  		<td id="head"><font><b>欢迎访问学生信息管理系统</b></font></td>
  		<td><div id="intd"><font class="sname">${sessionScope.name }</font>，您好&nbsp;|&nbsp;
  		<font><a href="login.jsp" target="_parent">安全退出</a></font>&nbsp;|&nbsp;
  		<font><a href="changePsd.jsp" target="body">修改密码</a></font></div></td>
  	</tr>   
  </table>
  </body>
</html>
