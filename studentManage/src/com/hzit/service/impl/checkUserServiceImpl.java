package com.hzit.service.impl;


import com.hzit.dao.checkUserDao;
import com.hzit.dao.impl.checkUserDaoimpl;
import com.hzit.service.checkUserService;

public class checkUserServiceImpl implements checkUserService{
	private checkUserDao logindao = new checkUserDaoimpl();
	@Override
	public boolean checkName(String name) {
		// TODO Auto-generated method stub
		return logindao.checkName(name);
	}

}
