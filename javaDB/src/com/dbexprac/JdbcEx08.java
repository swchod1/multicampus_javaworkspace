package com.dbexprac;

import java.sql.*;
import java.io.*;
import java.util.*;

import com.dbex.ConnUtil;

public class JdbcEx08 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties pt = new Properties();
		
		pt.load(new FileInputStream("src/department.properties"));
		
		Connection con= null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			
			con = ConnUtil.getConnection();
			// 1
			/*
			pstmt = con.prepareStatement(pt.getProperty("department_insert"));
			
			pstmt.setInt(1, 200);
			pstmt.setString(2, "기계공학과");
			pstmt.setInt(3, 100);
			pstmt.setString(4, "10호관");
			*/
			// 1
			
			//2
			/*
			pstmt = con.prepareStatement(pt.getProperty("department_select"));
			
			pstmt.setInt(1, 200);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getInt(1) + "   ");
				System.out.print(rs.getString(2) + "   ");
				System.out.print(rs.getInt(3) + "   ");
				System.out.print(rs.getString(4) + "   ");
			}
			
			System.out.println();
			*/
			// 2
			
			// 3
			/*
			pstmt = con.prepareStatement(pt.getProperty("department_update"));
			
			pstmt.setString(1, "1호관");
			pstmt.setInt(2, 200);
			
			*/
			// 3
			
			// 4
			
			pstmt = con.prepareStatement(pt.getProperty("department_delete"));
			
			pstmt.setInt(1, 200);
			
			// 4
			
			
			pstmt.executeUpdate();
			System.out.println("실행되었습니다.");
			
			
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
