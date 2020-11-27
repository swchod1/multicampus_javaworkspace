package com.dbexprac;

import java.sql.*;

public class JdbcEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		StringBuffer sql = new StringBuffer();
		sql.append("insert into professor values(?, ?, ?, ?, ?, sysdate, ?, ?)");
		*/
		
		String sql = "update professor set sal = ? where profno = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConUtil.getConnection();
			
			/*pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 9000);
			pstmt.setString(2, "이순신");
			pstmt.setString(3, "lee");
			pstmt.setString(4, "시간제 교수");
			pstmt.setInt(5, 300);
			pstmt.setInt(6, 30);
			pstmt.setInt(7, 201);
			*/
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, 250);
			pstmt.setInt(2, 9000);
			
			int i = pstmt.executeUpdate();
			
			// System.out.println(i + "개의 행이 추가되었습니다.");
			
			System.out.println(i + "개의 행이 수정되었습니다.");
			
			
		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		} finally {
			try {
				if(con != null) {
					con.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
		}

	}

}
