package com.hzit.service;

import java.util.List;

import com.hzit.entity.student;

public interface selectBypageservice {
	//page当前页数
	public List<student> selectBypage(int page);
	//计算总的页数
	public int getpages();
}
