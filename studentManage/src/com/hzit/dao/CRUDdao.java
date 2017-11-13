package com.hzit.dao;

import java.util.List;

import com.hzit.entity.student;

public interface CRUDdao {
	//���ѧ����Ϣ
	public void add(String name,int age,String sex,String major,String addr);
	//ɾ��ѧ��
	public void delete(int id);
	//��ѯ������Ϣ
	public List<student> getAll();
	//�޸���Ϣ
	public void change(int id,int age,String sex,String major,String addr);
	//�޸�-ͨ��id ��ȡ����
	public student getById(int id);
	//ģ����ѯ
	public List<student> getByName(String word);
	//����Ա�޸�����
	public void changePsd(String name,int Npsd);
}
