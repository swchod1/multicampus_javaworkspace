package com.dbexprac;

import java.sql.*;

public class JdbcEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		StringBuffer sql = new StringBuffer();
		sql.append("insert into department values(201, '기계공학과', 100, '3호관')");
		*/
		
		String sql = "update department set loc = '1호관' where deptno = 201";
		
		
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			
			// System.out.println("디비 연결 성공");
			
			stmt = con.createStatement();

			/*
			int i = stmt.executeUpdate(sql.toString());

			System.out.println(i + "개의 행이 추가되었습니다.");
			*/
			
			int i = stmt.executeUpdate(sql);
			System.out.println(i + "개의 행이 수정되었습니다.");
			
			
		} catch (ClassNotFoundException ce) {
			// TODO: handle exception
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();			
		} finally {
			try {
				if(con != null) {
					con.close();
				}
				if(stmt != null) {
					stmt.close();
				}
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
		}
		

	}

}
