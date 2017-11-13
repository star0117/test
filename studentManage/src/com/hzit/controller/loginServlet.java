package com.hzit.controller;

import java.io.IOException;

import javax.enterprise.inject.New;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hzit.service.checkUserService;
import com.hzit.service.loginService;
import com.hzit.service.impl.checkUserServiceImpl;
import com.hzit.service.impl.loginServiceimpl;

public class loginServlet extends HttpServlet{
	checkUserService checkservice = new checkUserServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html;charset=utf-8");
		String method = req.getParameter("method");
		if(method.equals("check")){
			check(req, resp);
		}if(method.equals("login")){
			login(req, resp);
		}
		
	}
public void check(HttpServletRequest req, HttpServletResponse resp) throws IOException{
	String name = req.getParameter("name");
	boolean flag = checkservice.checkName(name);
	String result ="";
	if(flag){
		result = "true";
	}else{
		result = "error";
	}
	resp.getWriter().print(result);

	}
//ÖØÐÂµÇÂ¼
public void login(HttpServletRequest req, HttpServletResponse resp) throws IOException{
	resp.sendRedirect("login.jsp");
}
}