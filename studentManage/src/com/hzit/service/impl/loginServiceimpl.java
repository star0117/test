package com.hzit.service.impl;

import com.hzit.dao.loginDao;
import com.hzit.dao.impl.loginDaoimpl;
import com.hzit.service.loginService;

public class loginServiceimpl implements loginService{
	private loginDao logindao = new loginDaoimpl();
	@Override
	public Boolean login(String name, int psd) {
		// TODO Auto-generated method stub
		return logindao.login(name, psd);
	}

}
