package com.dbex;

import java.sql.*;

public class JdbcEx2 { // update 예제

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sql = "update department set loc = '5호관' where deptno = 205";
		
		/*
		StringBuffer sql = new StringBuffer();
		sql.append("");
		*/
		
		Connection con = null;
		Statement stmt = null;
		
		try {
			// jdbc 드라이브 메모리에? 로드함
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// connection 객체 생성
			
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
			

			// System.out.println("디비 연결 성공"); // 확인용
			
			// 여까지는 연결하는 것은 고정
			
			// 밑에 캣치랑 파이널리도 고정
			
			// 여기에 쿼리문 들어감
			
			// 보낼 객체 생성
			stmt = con.createStatement();
			
			// update 쿼리문 작성
			// update 문은 executeUpate() 메소드 사용
			
			int result = stmt.executeUpdate(sql);
			
			System.out.println(result + "개의 행이 수정되었습니다.");			
			
			
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
			
			// 객체 추가 되서 추가
			
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
