package com.dbex;

import java.io.*;
import java.sql.*;

public class JdbcEx9 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * MataData : 데이터의 구성요소를 나타냄
		 * ResultSetMataData는 ResultSet을 구성하는 모든 요소를 알아낼 수 있는 메소드를 제공함
		 * 
		 */
		
		
		// 키보드와 연결된 스트림 얻기
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		System.out.print("sql 입력 : ");
		String sql = br.readLine();
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		
		try {
			
			con = ConnUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			// 쿼리 수행 결과 집합의 부가정보를 가지고 있는 ResultSetMetaData 얻기
			
			rsmd = rs.getMetaData();
			
			System.out.println("컬럼의 개수 : " + rsmd.getColumnCount());
			
			int colCnt = rsmd.getColumnCount();
			
			while(rs.next()) {
				for (int colNum = 1; colNum <= colCnt; colNum++) {
					
					int colType = rsmd.getColumnType(colNum);
					
					switch(colType) {
					
					case Types.NUMERIC :
						System.out.print(rs.getInt(colNum) + "\t");
						break;
					case Types.VARCHAR :
						System.out.print(rs.getString(colNum) + "\t");
						break;
					case Types.DATE :
						System.out.print(rs.getDate(colNum) + "\t");
						break;	
										
					}
					
				}
				
				System.out.println();
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
