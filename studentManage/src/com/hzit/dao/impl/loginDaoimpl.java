package com.hzit.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hzit.dao.loginDao;
import com.hzit.entity.Admin;
import com.hzit.util.jdbcTools;

public class loginDaoimpl implements loginDao{

	@Override
	public Boolean login(String name, int psd) {
		// TODO Auto-generated method stub
		Connection con = jdbcTools.getCon();
		String sql = "select * from login where user=? and psd=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setInt(2, psd);
			rs = ps.executeQuery();
			if(rs.next()){
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			jdbcTools.closeCon(con, ps, rs);
		}
		return false;
	}

}
