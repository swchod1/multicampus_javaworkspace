package com.dbexprac;

import java.sql.*;
import java.util.*;

import com.dbex.ConnUtil;

public class JdbcEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("sql 입력 : ");
		String sql = sc.nextLine();
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		
		try {
			
			con = ConnUtil.getConnection();
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			rsmd = rs.getMetaData();
			
			int colCnt = rsmd.getColumnCount();
			
			System.out.println("컬럼의 개수 : " + colCnt);
			
			while(rs.next()) {
				
				for(int colNum = 1; colNum <= colCnt; colNum++) {
					
					int colTypes = rsmd.getColumnType(colNum);
					
					switch (colTypes) {
					case Types.NUMERIC :
						System.out.print(rs.getInt(colNum) + "   ");
						break;
					case Types.VARCHAR :
						System.out.print(rs.getString(colNum) + "   ");
						break;
					case Types.DATE :
						System.out.print(rs.getDate(colNum) + "   ");
					
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
				if(stmt != null) {
					stmt.close();
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
