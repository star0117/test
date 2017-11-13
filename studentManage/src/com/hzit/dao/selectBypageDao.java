package com.hzit.dao;

import java.util.List;

import com.hzit.entity.student;

public interface selectBypageDao {
	public List<student> selectBypage(int start,int end);
	//获取总条数
	public int getSum();
}
