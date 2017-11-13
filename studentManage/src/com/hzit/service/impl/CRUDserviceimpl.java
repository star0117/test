package com.hzit.service.impl;

import java.util.List;

import com.hzit.dao.CRUDdao;
import com.hzit.dao.impl.CRUDdaoimpl;
import com.hzit.entity.student;
import com.hzit.service.CRUDservice;

public class CRUDserviceimpl implements CRUDservice{
	private CRUDdao crud = new CRUDdaoimpl();
	@Override
	public void add(String name, int age, String sex, String major, String addr) {
		// TODO Auto-generated method stub
		crud.add(name, age, sex, major, addr);
	}
	//删除
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		crud.delete(id);
	}
	//获取所有
	@Override
	public List<student> getAll() {
		// TODO Auto-generated method stub
		return crud.getAll();
	}
	//修改信息
	@Override
	public void change(int id, int age, String sex, String major, String addr) {
		// TODO Auto-generated method stub
		crud.change(id, age, sex, major, addr);
	}
	//通过id获取数据
	@Override
	public student getById(int id) {
		// TODO Auto-generated method stub
		return crud.getById(id);
	}
	//模糊查询
	@Override
	public List<student> getByName(String word) {
		// TODO Auto-generated method stub
		return crud.getByName(word);
	}
	//修改密码
	@Override
	public void changePsd(String name, int Npsd) {
		// TODO Auto-generated method stub
		crud.changePsd(name, Npsd);
	}
	
}
