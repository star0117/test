package com.hzit.dao;

import java.util.List;

import com.hzit.entity.student;

public interface selectBypageDao {
	public List<student> selectBypage(int start,int end);
	//��ȡ������
	public int getSum();
}
