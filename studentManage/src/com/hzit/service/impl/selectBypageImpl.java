package com.hzit.service.impl;

import java.util.List;

import com.hzit.dao.selectBypageDao;
import com.hzit.dao.impl.selectBypageDaoimpl;
import com.hzit.entity.student;
import com.hzit.service.selectBypageservice;

public class selectBypageImpl implements selectBypageservice{
	private selectBypageDao selectbypagedao = new selectBypageDaoimpl();
	//每页显示个数
	private int showNum = 4;
	@Override
	public List<student> selectBypage(int page) {
		// TODO Auto-generated method stub
		int start = (page-1)*showNum;
		int end = showNum;
		return selectbypagedao.selectBypage(start, end);
	}
	@Override
	public int getpages() {
		// TODO Auto-generated method stub
		int sum = selectbypagedao.getSum();
		int pages =(int)Math.ceil((double)sum/showNum);
		return pages;
	}
	

}
