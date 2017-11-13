package com.hzit.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hzit.dao.CRUDdao;
import com.hzit.entity.student;
import com.hzit.util.jdbcTools;

public class CRUDdaoimpl implements CRUDdao{

	@Override
	public void add(String name, int age, String sex, String major, String addr) {
		// TODO Auto-generated method stub
		Connection con = jdbcTools.getCon();
		String sql = "insert into student(name,age,sex,major,addr) values(?,?,?,?,?)";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, age);
			ps.setString(3, sex);
			ps.setString(4, major);
			ps.setString(5, addr);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbcTools.closeCon(con, ps, null);
		}
	}
//删除信息
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Connection con = jdbcTools.getCon();
		String sql = "delete from student where id=?";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbcTools.closeCon(con, ps, null);
		}
	}
	//查询所有信息
	@Override
	public List<student> getAll() {
		// TODO Auto-generated method stub
		Connection con = jdbcTools.getCon();
		String sql = "select * from student";
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<student> list = new ArrayList<student>();
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				int id = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String sex = rs.getString(4);
				String major = rs.getString(5);
				String addr = rs.getString(6);
				student stu = new student(id,name,age,sex,major,addr);
				list.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbcTools.closeCon(con, ps, rs);
		}
		return list;
	}
	//修改信息
	@Override
	public void change(int id, int age, String sex, String major, String addr) {
		// TODO Auto-generated method stub
		Connection con = jdbcTools.getCon();
		String sql = "update student set age=?,sex=?,major=?,addr=? where id=?";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, age);
			ps.setString(2, sex);
			ps.setString(3, major);
			ps.setString(4, addr);
			ps.setInt(5, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbcTools.closeCon(con, ps, null);
		}
	}
	//通过id获取数据
	@Override
	public student getById(int id) {
		// TODO Auto-generated method stub
		Connection con = jdbcTools.getCon();
		String sql = "select * from student where id=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		student stu = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			while(rs.next()){
				int sid = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String sex = rs.getString(4);
				String major = rs.getString(5);
				String addr = rs.getString(6);
				stu = new student(sid,name,age,sex,major,addr);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbcTools.closeCon(con, ps, rs);
		}
		return stu;
	}
	//模糊查询
	@Override
	public List<student> getByName(String word) {
		// TODO Auto-generated method stub
		Connection con = jdbcTools.getCon();
		String sql = "select * from student where name like '%"+word+"%'";
		PreparedStatement ps = null;
		ResultSet rs = null;
		student stu = null;
		List<student> list = new ArrayList<student>();
		try {
			ps = con.prepareStatement(sql);
//			ps.setString(1, word);
			rs = ps.executeQuery();
			while(rs.next()){
				int sid = rs.getInt(1);
				String name = rs.getString(2);
				int age = rs.getInt(3);
				String sex = rs.getString(4);
				String major = rs.getString(5);
				String addr = rs.getString(6);
				stu = new student(sid,name,age,sex,major,addr);
				list.add(stu);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbcTools.closeCon(con, ps, rs);
		}
		return list;
	}
	//管理员修改密码
	@Override
	public void changePsd(String name,int Npsd) {
		// TODO Auto-generated method stub
		Connection con = jdbcTools.getCon();
		String sql = "update login set psd=? where user=?";
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, Npsd);
			ps.setString(2, name);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbcTools.closeCon(con, ps, null);
		}
	}

}
