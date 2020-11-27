package com.dbexprac;

import java.sql.*;

import com.dbex.ConnUtil;

public class JdbcEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sql1 = new StringBuffer();
		
		sql1.append("insert into department ");
		sql1.append("values(?, ?, ?, ?)");
		
		StringBuffer sql2 = new StringBuffer();
		
		sql2.append("update department ");
		sql2.append("set dname = ?, loc = ? ");
		sql2.append("where deptno = ?");
		
		StringBuffer sql3 = new StringBuffer();
		
		sql3.append("delete from department ");
		sql3.append("where deptno = ?");
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			con = ConnUtil.getConnection();

			con.setAutoCommit(false);

			pstmt = con.prepareStatement(sql3.toString());

			pstmt.setInt(1, 200);

			pstmt.executeUpdate();

			pstmt = con.prepareStatement(sql1.toString());
			
			pstmt.setInt(1, 255);
			pstmt.setString(2, "기계공학과");
			pstmt.setInt(3, 700);
			pstmt.setString(4, "1호관");
			
			pstmt.executeUpdate();
			
			
			pstmt = con.prepareStatement(sql2.toString());
			
			pstmt.setString(1, "토목공학과");
			pstmt.setString(2, "2호관");
			pstmt.setInt(3, 200);
			
			pstmt.executeUpdate();
			
			
			
			
			con.commit();
			System.out.println("db에 정상적으로 반영되었습니다.");
			
		} catch (SQLException se) {
			// TODO: handle exception
			
			try {
				con.rollback();
				System.out.println("db에 반영된 작업이 취소되었습니다.");
			} catch (SQLException ss) {
				// TODO: handle exception
				ss.printStackTrace();
			}
			
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
