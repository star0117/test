package com.hzit.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

import com.hzit.dao.selectBypageDao;
import com.hzit.entity.student;
import com.hzit.util.jdbcTools;

public class selectBypageDaoimpl implements selectBypageDao{

	@Override
	public List<student> selectBypage(int start, int end) {
		// TODO Auto-generated method stub
		Connection con = jdbcTools.getCon();
		String sql = "select * from student limit ?,?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<student> list = new ArrayList<student>();
		try {
			ps = con.prepareStatement(sql);
			ps.setInt(1, start);
			ps.setInt(2, end);
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

	@Override
	public int getSum() {
		// TODO Auto-generated method stub
		Connection con = jdbcTools.getCon();
		String sql = "select count(id) from student";
		PreparedStatement ps = null;
		ResultSet rs = null;
		int sum = 0;
		try {
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()){
				sum = rs.getInt(1);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbcTools.closeCon(con, ps, rs);
		}
		return sum;
	}

}
