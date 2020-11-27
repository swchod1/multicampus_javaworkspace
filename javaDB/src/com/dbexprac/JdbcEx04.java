package com.dbexprac;

import java.sql.*;

public class JdbcEx04 {

	public static void main(String[] args) { // 무결성 제약조건 위배
		// TODO Auto-generated method stub
		
		// String sql = "delete department where deptno = ?";
		
		StringBuffer sql = new StringBuffer();
		
		sql.append("delete professor where profno = ?");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConUtil.getConnection();
			
			// pstmt = con.prepareStatement(sql);
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 9000);
			
			int i = pstmt.executeUpdate();
			
			System.out.println(i + "개의 행이 삭제되었습니다.");
			
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
