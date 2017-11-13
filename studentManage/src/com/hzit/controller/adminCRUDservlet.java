package com.hzit.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hzit.entity.student;
import com.hzit.service.CRUDservice;
import com.hzit.service.selectBypageservice;
import com.hzit.service.impl.CRUDserviceimpl;
import com.hzit.service.impl.selectBypageImpl;

public class adminCRUDservlet extends HttpServlet{
	private selectBypageservice selectbypage = new selectBypageImpl();
	private CRUDservice crudservice = new CRUDserviceimpl();
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
		String method = req.getParameter("method");
		if(method.equals("add")){
			add(req, resp);
		}if(method.equals("selectBypage")){
			selectBypage(req, resp);
		}if(method.equals("delete")){
			delete(req, resp);
		}if(method.equals("getAll")){
			getAll(req, resp);
		}if(method.equals("change")){
			change(req, resp);
		}if(method.equals("getById")){
			getById(req, resp);
		}if(method.equals("selectByName")){
			selectByName(req, resp);
		}if(method.equals("changePsd")){
			changePsd(req, resp);
		}
		
	}
	//添加学生信息
	public void add(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String name = req.getParameter("name");
		String ageStr = req.getParameter("age");
		String sex = req.getParameter("sex");
		String major = req.getParameter("major");
		String addr = req.getParameter("addr");
		int age = Integer.parseInt(ageStr);
		crudservice.add(name, age, sex, major, addr);
		resp.getWriter().print("<script type='text/javascript'>alert('添加成功！');window.location.href='CRUD.action?method=getAll'</script>");
	}
	//查询学生信息、分页显示
	public void selectBypage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String pageStr = req.getParameter("page");
		int page = 0;
		if(pageStr == null){
			page = 1;
		}else{
			page = Integer.parseInt(pageStr);
		}
		List<student> list = selectbypage.selectBypage(page);
		req.setAttribute("list", list);
		req.setAttribute("currentPage", page);
		int pages = selectbypage.getpages();
		req.setAttribute("pages", pages);
		req.getRequestDispatcher("select.jsp").forward(req, resp);
	}
	//删除修改信息
	public void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String idStr = req.getParameter("id");
		int id = Integer.parseInt(idStr);
		crudservice.delete(id);
		req.getRequestDispatcher("CRUD.action?method=getAll").forward(req, resp);
	}
	//获取所有信息
	public void getAll(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		List<student> list = crudservice.getAll();
		req.setAttribute("list", list);
		req.getRequestDispatcher("getAll.jsp").forward(req, resp);
	}
	//修改信息
	public void change(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String idStr = req.getParameter("id");
		int id = Integer.parseInt(idStr);
		String ageStr = req.getParameter("age");
		int age = Integer.parseInt(ageStr);
		String sex = req.getParameter("sex");
		String major = req.getParameter("major");
		String addr = req.getParameter("addr");
		crudservice.change(id, age, sex, major, addr);
		resp.getWriter().print("<script type='text/javascript'>alert('修改成功！');window.location.href='CRUD.action?method=getAll'</script>");
	}
	//通过id获取数据
	public void getById(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String idstr = req.getParameter("id");
		int id = Integer.parseInt(idstr);
		student stu = crudservice.getById(id);
		req.setAttribute("stu", stu);
		req.getRequestDispatcher("change.jsp").forward(req, resp);
	}
	//实现模糊查询
	public void selectByName(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		String word = req.getParameter("word");
		System.out.println(word);
		List<student> list = crudservice.getByName(word);
		req.setAttribute("list", list);
		req.getRequestDispatcher("select.jsp").forward(req, resp);
	}
	//修改密码
	public void changePsd(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		HttpSession session = req.getSession();
		String name = (String)session.getAttribute("name");
		String psdStr = req.getParameter("Npsd");
		int Npsd = Integer.parseInt(psdStr);
		crudservice.changePsd(name, Npsd);
		resp.getWriter().print("<script type='text/javascript'>alert('修改成功！请您重新登录');parent.location.href='login.jsp';</script>");
	}
}
