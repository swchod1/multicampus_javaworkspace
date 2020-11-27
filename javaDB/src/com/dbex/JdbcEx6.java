package com.dbex;

import java.sql.*;

public class JdbcEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sql = new StringBuffer();
		
		sql.append("update professor ");
		sql.append("set sal = ? ");
		sql.append("where name = ? ");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con = ConnUtil.getConnection();
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 500);
			pstmt.setString(2, "홍길동");
			
			int i = pstmt.executeUpdate();
			
			System.out.println(i + "개의 행이 수정되었습니다.");
			
		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		} finally {
			
			try {
				if(con != null) {
					con.close();
				}
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
			
			try {
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
