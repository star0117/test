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
	<link rel="stylesheet" type="text/css" href="style/same.css">
	<style type="text/css">
		.list{
			width: 20px;
			text-align: right;
		}
	</style>
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
		$(function(){
		//判断输入的原密码是否和登录的密码一致
			$("#wpsd").blur(function(){
				var psd = $("#psd").val();
				var wpsd = $("#wpsd").val();
				var mess = "";
				if(psd == wpsd){
					mess = "<img src='image/dui.png'>";
					$("#mess").html(mess);
				}else{
					alert("密码输入错误！请重新输入");
				}
				})
				//判断新密码是否为空
			
			$("#Npsd").blur(function(){
				var Npsd = $("#Npsd").val();
				if(Npsd != ""){
				$("#mess1").html("<img src='image/dui.png'>");
			}else{
				$("#mess1").html("<img src='image/cuo.png'>");
				alert("密码不能为空!");
			}
			})
			//判断两次密码是否一致
			$("#Dbpsd").blur(function(){
				var Npsd = $("#Npsd").val();
				var Dbpsd = $("#Dbpsd").val();
				if(Dbpsd == Npsd){
					$("#mess2").html("<img src='image/dui.png'>");
				}else{
					alert("两次输入密码不一致，请重新输入!");
				}
			})
			
		});
	</script>
  </head>
  
  <body>
    <div id="top"><div id="inner">修改密码</div></div>
  	<div style="height: 50px"></div>
  	<center>
  		<form action="CRUD.action?method=changePsd" method="post">
  		<% int psd = (int)session.getAttribute("psd"); %>
  		<input type="hidden" value="${psd }" id="psd">
  			<table border="0">
  				<tr class="list">
  					<td>原密码：</td>
  					<td><input type="text" id="wpsd"></td>
  					<td><div style="width: 24px;height: 24px;" id="mess"></div></td>
  				</tr>
  				<tr class="list">
  					<td>新密码：</td>
  					<td><input type="password" name="Npsd" id="Npsd"></td>
  					<td><div style="width: 24px;height: 24px;" id="mess1"></div></td>
  				</tr>
  				<tr class="list">
  					<td>重复密码：</td>
  					<td><input type="password" name="Dbpsd" id="Dbpsd"></td>
  					<td><div style="width: 24px;height: 24px;" id="mess2"></div></td>
  				</tr>
  				
  					
  				
  			</table>
  			<hr align="center" width="80%" color="#CFCFCF" style="margin-bottom: 10px;margin-top: 10px;">
  				<input type="submit" value="修改">&nbsp;&nbsp;
  				<input type="reset" value="重置">&nbsp;&nbsp;
  				<input type="button" value="取消" onclick="javaScript:window.history.back();" >
  		</form>
  		
  	</center>
  </body>
</html>
