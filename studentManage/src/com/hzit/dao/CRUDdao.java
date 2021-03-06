package com.hzit.dao;

import java.util.List;

import com.hzit.entity.student;

public interface CRUDdao {
	//添加学生信息
	public void add(String name,int age,String sex,String major,String addr);
	//删除学生
	public void delete(int id);
	//查询所有信息
	public List<student> getAll();
	//修改信息
	public void change(int id,int age,String sex,String major,String addr);
	//修改-通过id 获取数据
	public student getById(int id);
	//模糊查询
	public List<student> getByName(String word);
	//管理员修改密码
	public void changePsd(String name,int Npsd);
}
