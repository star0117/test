package com.hzit.service;

import java.util.List;

import com.hzit.entity.student;

public interface selectBypageservice {
	//page��ǰҳ��
	public List<student> selectBypage(int page);
	//�����ܵ�ҳ��
	public int getpages();
}
