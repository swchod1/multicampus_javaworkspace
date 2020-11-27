package com.dbex;

import java.sql.*;

public class JdbcEx4 { // select

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String sql = "select deptno, dname, college, loc from department";
		
		Connection con = null;
		Statement stmt = null;
		
		// select 쿼리의 수행 결과 집합과 결과 집합에서 데이터를 추출할 수 있는 메소드를 가지고 있는 객체
		
		ResultSet rs = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");

			con = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl", "scott", "tiger");
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			// ResultSet 객체로 부터 데이터를 추출
			// next() 메소드를 이용하여 다음행으로 이동시킴
			// 이동된 위치는 row가 존재하면 true, 존재하지 않으면 false를 변환
			// rs.next() 메소드가 참인 동안에 데이터를 추출함
			
			while (rs.next()) { // 행이 존재하면
				// 커서가 위치한 row의 각각의 column 값을 추출함
				// 값을 추출할 때 getXXX() 메소드를 이용함
				
				int i = rs.getInt(1); // or rs.getInt("deptno");
				String s1 = rs.getString(2); // or rs.getInt("dname");
				int j = rs.getInt(3); // or rs.getInt("college");
				String s2 = rs.getString(4); // or rs.getInt("loc");
				
				System.out.println(i + "\t" + s1 + "\t" + j + "\t" + s2);			
				
				
			}
			
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
			try {
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
