package com.dbex;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcEx5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// preparedStatement 인터페이스를 사용
		// ?는 디비에서 sql 실행시에 실제값으로 대체됨
		
		StringBuffer sql = new StringBuffer();
		sql.append("insert into professor ");
		sql.append("values(?, ?, ?, ?, ?, sysdate, ?, ?)");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			con = ConnUtil.getConnection();
			
			// PreparedStatement 객체 얻기
			pstmt = con.prepareStatement(sql.toString());
			
			// 파라미터 값 세팅
			// 쿼리의 ?(바인딩 변수) 실제 디비값 으로 대체값
			
			pstmt.setInt(1, 9920);
			pstmt.setString(2, "홍길동");
			pstmt.setString(3, "gildong");
			pstmt.setString(4, "전임교수");
			pstmt.setInt(5, 450);
			// 위에 sysdate 로 처리 되고 여기 숫자는 ? 표만 됨
			pstmt.setInt(6, 40);
			pstmt.setInt(7, 203);
			
			// 쿼리 실행
			
			int i = pstmt.executeUpdate();
			
			System.out.println(i + "개의 행이 추가되었습니다.");
			
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
