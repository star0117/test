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
	<style type="text/css">
		.pageController{
			margin-left:30px;
			cursor: pointer;
			color:black;
			font-size: 15px;
		}
		.disabled{
			color:#767676;
		}
		#go{
			color: blue;
			margin-left: 10px;
		}
		.in_style{
			background-color: #CFCFCF;
			border-radius: 3px;
		}
	</style>
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
		$(function(){
			//根据当前的页码信息设置按钮
			var currentPage = $("#currentPage").text();
			//当前为第一页，将"首页","上一页"两个按钮屏蔽
			if(currentPage == 1){
				$("#first").addClass("disabled");
				$("#pervious").addClass("disabled");
			}
			
			//当前为最后一页，将"尾页","下一页"两个按钮屏蔽
			var pages = $("#pages").text();
			if(currentPage == pages){
				$("#next").addClass("disabled");
				$("#last").addClass("disabled");
			}
			//首页
			$("#first").click(function(){
				//获取当前页码信息
				var currentPage = $("#currentPage").text();
				//判断当前是否为第一页，如果是，则不执行任何操作
				if(currentPage == 1){
					return false;
				}
				window.location.href = "CRUD.action?method=selectBypage&page=1";
			});
			//上一页
			$("#pervious").click(function(){
				//获取当前页码信息
				var currentPage = $("#currentPage").text();
				//判断当前是否为第一页，如果是，则不执行任何操作
				if(currentPage == 1){
					return false;
				}
				//根据当前页计算下一页的页面信息
				var page = parseInt(currentPage)-1;
				window.location.href = "CRUD.action?method=selectBypage&page="+page;
			});
			//下一页
			$("#next").click(function(){
				//获取当前页码信息
				var currentPage = $("#currentPage").text();
				//判断当前是否已经是最后一页，如果是，则不执行任何操作
				var pages = $("#pages").text();
				if(currentPage == pages){
					return false;
				}
				//根据当前页计算下一页的页面信息
				var page = parseInt(currentPage)+1;
				window.location.href = "CRUD.action?method=selectBypage&page="+page;
			});
			//尾页
			$("#last").click(function(){
				//获取当前页码信息
				var currentPage = $("#currentPage").text();
				//判断当前是否已经是最后一页，如果是，则不执行任何操作
				var pages = $("#pages").text();
				if(currentPage == pages){
					return false;
				}
				window.location.href = "CRUD.action?method=selectBypage&page="+pages;
			});
			//判断跳转页面是否存在
			$("#go").click(function(){
				var text=document.getElementById("pageIndex").value;
		
				var max=${pages };
				if(text>max){
					alert("输入值超出范围，请重新输入！");
					text=${currentPage };
				}
				if(text<=0){
					text=1;
				}
			window.location.href="CRUD.action?method=selectBypage&page="+text;
			});
			
		});
	</script>
  </head>
  <body>
  <div id="top"><div id="inner">查询学生信息</div></div>
  <div style="height: 50px"></div>
  <center>
  <form action="CRUD.action?method=selectByName" method="post">
  请输入学生姓名：<input type="text"  name="word">&nbsp;&nbsp;<input type="submit" value="查询" class="in_style">&nbsp;&nbsp;
  				<a href="CRUD.action?method=selectBypage"><input type="button" value="返回" class="in_style"></a>
  </form>
  <table border="0" width="400px" style= "text-align: center" >
    	<tr bgcolor="#22cccc" height="30px" style="font-size:12px">
    		<td>学生编号</td>
    		<td>姓名</td>
    		<td>年龄</td>
    		<td>性别</td>
    		<td>专业</td>
    		<td>籍贯</td>
    	</tr>
    	<c:forEach items="${list }" var="stu">
    	<tr height="25px">
    		<td>${stu.id }</td>
    		<td>${stu.name }</td>
    		<td>${stu.age }</td>
    		<td>${stu.sex }</td>
    		<td>${stu.major }</td>
    		<td>${stu.addr }</td>
    	</tr>    	    	
    </c:forEach>
    </table>
    <hr align="center" width="80%" color="#CFCFCF" style="margin-top: 10px;margin-bottom: 10px;">
    <font id="first" class="pageController">首页</font>
    <font id="pervious" class="pageController">上一页</font>
    <font class="pageController"><font id="currentPage">${currentPage }</font>/<font id="pages">${pages }</font></font>
    <font id="next" class="pageController">下一页</font>
    <font id="last" class="pageController">尾页</font>
    第<input type="text" id="pageIndex" style='width:20px;height:20px'/>页
    <font id="go" class="pageController">Go</font>
    </center>
  </body>
</html>
