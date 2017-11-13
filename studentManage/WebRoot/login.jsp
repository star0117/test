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
	<link rel="stylesheet" type="text/css" href="style/login.css">
	<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
	<script type="text/javascript">
		$(function(){
			$("#name").blur(function(){
				var name = $(this).val();
				$.ajax({
					"url": "login.action?method=check",
					"type": "post",
					"data": "name="+name,
					"dataType": "text",
					"success":function(data){
						var mess = "";
						if(data=="true"){
							mess="<img src='image/dui.png'>";
						}else{
							mess="<img src='image/cuo.png'>";
						}
						$("#message").html(mess);
					}
				})
			})
			
		});
	</script>
  </head>
  
  <body>
    <div id="login">
    <form action="Adminlogin.action" method="post">
    	<h3>学生信息管理系统</h3>
    	<table>
    	<tr>
    		<td>类型：</td>
    		<td><input type="radio" value="1" checked="checked" name="type">管理员&nbsp;&nbsp;&nbsp;
    		<input type="radio" value="2" name="type">学生用户</td>
    	</tr>
    		<tr>
    			<td>用户名：</td>
    			<td><input type="text" id="name" name="name"></td>
    			<td><div style= "width: 25px;height:26px" id="message"></div></td>
    		</tr>
    		<tr>
    			<td>密码：</td>
    			<td><input type="password" name="password"></td>
    		</tr>
    		<tr>
    			<td><input type="submit" value="登录"></td>
    			<td id="td"><a href="register.jsp"><input type="button" value="注册"></a></td>
    			
    		</tr>
    	</table>
    </form>
    </div>
  </body>
</html>
