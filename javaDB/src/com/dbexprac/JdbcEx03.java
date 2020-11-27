package com.dbexprac;

import java.sql.*;

public class JdbcEx03 {

	public static void main(String[] args) { // 시간 어떻게 받냐????
		// TODO Auto-generated method stub
		
		// String sql = "select * from department";
		
		StringBuffer sql = new StringBuffer();
		sql.append("select * from professor");
		
		
		Connection con = null;
		Statement stmt = null;
		
		ResultSet rs = null;
		
		try {
			
			con = ConUtil.getConnection();
			
			stmt = con.createStatement();
			
			// rs = stmt.executeQuery(sql);
			
			rs = stmt.executeQuery(sql.toString());
			
			while(rs.next()) {
				int n1 = rs.getInt(1);
				String s1 = rs.getString(2);
				String s2 = rs.getString(3);
				String s3 = rs.getString(4);
				int n2 = rs.getInt(5);
				// int n3 = rs.getDate(6, )
				
				// System.out.println(i + " " + s1 + " " + j + " " + s2);
			}
			
			
		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		} finally {
			try {
				if(con != null) {
					con.close();
				}
				if(stmt != null) {
					stmt.close();
				}
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
		}

	}

}
