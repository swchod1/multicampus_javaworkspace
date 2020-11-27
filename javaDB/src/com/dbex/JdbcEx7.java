package com.dbex;

import java.sql.*;

public class JdbcEx7 {
	// select

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sql = new StringBuffer();
		
		sql.append("select a.name, a.profno, a.position, b.dname ");
		sql.append("from professor a, department b ");
		sql.append("where a.deptno = b.deptno ");
		sql.append("and a.deptno = ?");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			// 디비연결
			con = ConnUtil.getConnection();
			
			pstmt = con.prepareStatement(sql.toString());
			
			// ? : 바인딩 변수를 대체할 실제값 설정
			pstmt.setInt(1, 203);
			
			// 결과값 얻기
			rs = pstmt.executeQuery();
			
			//rs 에서 값을 추출하여 출력
			
			while(rs.next()) {
				
				System.out.print(rs.getString("name") + "\t");  // 번호로 가도 됨
				System.out.print(rs.getInt("profno") + "\t");
				System.out.print(rs.getString("position") + "\t");
				System.out.print(rs.getString("dname") + "\t");
				
				/*
				System.out.println();
				
				System.out.print(rs.getString(1) + "\t");
				System.out.print(rs.getInt(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t");
				*/
				
			}
			
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
