package com.dbex;

import java.sql.*;

public class JdbcEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
			
			// 쿼리문 작성
			StringBuffer sql = new StringBuffer();
			sql.append("insert into department "); // 여기서 맨 뒤를 띄어 쓰기를 하던지
			sql.append("values(202, '컴퓨터공학과', 500, '8호관')"); // 여기 맨 앞을 띄어 쓰기를 하던지
			
			// 쿼리문 실행
			
			int result = stmt.executeUpdate(sql.toString());
			
			System.out.println(result + "개의 행이 추가되었습니다."); // 확인용
			
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
