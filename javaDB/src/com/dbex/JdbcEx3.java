package com.dbex;

import java.sql.*;

public class JdbcEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sql = "delete department where dname = '전자계산학과'";
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "scott", "tiger");
			// localhost ip값

			stmt = con.createStatement();
			
			// delete 쿼리문 작성

			int i = stmt.executeUpdate(sql);
			
			System.out.println(i + "개의 행이 삭제되었습니다."); // 확인용
			
			// stmt.executeUpdate(sql.toString()); // 이렇게 해도 무관
			
			
			
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
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}			
			try {
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
