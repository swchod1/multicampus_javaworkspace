package com.dbexprac;

import java.sql.*;

import com.dbex.ConnUtil;

public class JdbcEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sql = new StringBuffer();
		sql.append("select a.deptno, a.dname, b.name, b.position, a.loc ");
		sql.append("from department a, professor b ");
		sql.append("where a.deptno = b.deptno and a.deptno = ?");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			con = ConnUtil.getConnection();
			
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setInt(1, 203);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				System.out.print(rs.getInt(1) + "   ");
				System.out.print(rs.getString(2) + "   ");
				System.out.print(rs.getString(3) + "   ");
				System.out.print(rs.getString(4) + "   ");
				System.out.print(rs.getString(5) + "   ");
				
			}
			
		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		} finally {
			
			try {
				if(con != null) {
					con.close();
				}
				if(pstmt !=null) {
					pstmt.close();
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
