<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
	<link rel="stylesheet" type="text/css" href="style/same.css">
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$("font").click(function(){				
				var c = confirm("确认删除该条记录?");
				if(c == true){
					return true;
				}else{
					return false;
				}
				
			});
		});
	</script>
  </head>
  
  <body>
    <center>
    <div id="top"><div id="inner">学生信息维护</div></div>
    <div style="height: 50px"></div>
    	<table>
    		<tr bgcolor="#22cccc" height="25px" style="font-size:12px" >
    			<td>编号</td>
    			<td>姓名</td>
    			<td>年龄</td>
    			<td>性别</td>
    			<td>专业</td>
    			<td>籍贯</td>
    			<td>删除</td>
    			<td>修改</td>
    		</tr>
    		
    			<c:forEach items="${list }" var="stu">
    			<tr height="25px">
    				<td>${stu.id }</td>
		    		<td>${stu.name }</td>
		    		<td>${stu.age }</td>
		    		<td>${stu.sex }</td>
		    		<td>${stu.major }</td>
		    		<td>${stu.addr }</td>
		    		<td><font color="red"><a href="CRUD.action?method=delete&id=${stu.id }">删除</a></font></td>
		    		<td><a href="CRUD.action?method=getById&id=${stu.id }">修改</a></td>
    			</tr>
    			</c:forEach>
    	</table>
    	<hr align="center" width="80%" color="#CFCFCF">
    </center>
  </body>
</html>
