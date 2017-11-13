package com.hzit.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hzit.dao.checkUserDao;
import com.hzit.util.jdbcTools;

public class checkUserDaoimpl implements checkUserDao{

	@Override
	public boolean checkName(String name) {
		// TODO Auto-generated method stub
		Connection con = jdbcTools.getCon();
		String sql = "select * from login where user=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
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
