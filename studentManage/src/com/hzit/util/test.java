package com.hzit.util;

import java.sql.SQLException;

public class test {
	public static void main(String[] args) throws SQLException {
		jdbcTools jdbctool = new jdbcTools();
		jdbctool.getCon();
	}
}