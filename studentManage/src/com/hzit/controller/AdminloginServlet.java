package com.hzit.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hzit.entity.Admin;
import com.hzit.service.loginService;
import com.hzit.service.impl.loginServiceimpl;

public class AdminloginServlet extends HttpServlet{
	loginService loginservice = new loginServiceimpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String name = req.getParameter("name");
		String psdStr = req.getParameter("password");
		String type = req.getParameter("type");
		System.out.println(type);
		int psd = Integer.parseInt(psdStr);
		Boolean flag = loginservice.login(name, psd);
		if(flag){
			HttpSession session = req.getSession();
			session.setAttribute("name", name);
			session.setAttribute("psd", psd);
			resp.sendRedirect("main.jsp");
		}else{
			resp.getWriter().print("<script type='text/javascript'>alert('’À∫≈√‹¬Î¥ÌŒÛ');window.location.href='login.jsp'</script>");
		}
	}
}
