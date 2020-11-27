package com.dbex;

import java.sql.*;

public class JdbcEx8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* transaction : 논리적인 작업단위
		 * 
		 * insert, delete, update 등의 작업들을 하나의 논리적인 작업단위로 묶어서 쿼리 실행시
		 * 모든 작업이 정상처리된 경우에는 commit을 실행해서 db에 반영하고,
		 * 쿼리 실행도중 하나라도 정상처리 되지 않는 경우 rollback을 실행해서 작업단위 내의 모든 작업을 취소함.
		 */
		
		StringBuffer sql1 = new StringBuffer();
		
		sql1.append("insert into department ");
		sql1.append("values(?, ?, ?, ? ) ");
		
		StringBuffer sql2 = new StringBuffer();
		
		sql2.append("update department ");
		sql2.append("set dname = ?, loc = ? ");
		sql2.append("where deptno = ? ");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		try {
			
			////////////////////////////// transaction 시작 /////////////////////////
			
			// 하나의 논리 작업단위 시작
			
			con = ConnUtil.getConnection();
			
			// autoCommit 기능 비활성화 시키기
			
			con.setAutoCommit(false);
			
			///////////////////////////// 1번 작업 시작 //////////////////////////////
			
			pstmt = con.prepareStatement(sql1.toString());
			
			pstmt.setInt(1, 255);
			pstmt.setString(2, "핵물리학과");
			pstmt.setInt(3, 300);
			pstmt.setString(4, "9호관");
			
			pstmt.executeUpdate();
			

			///////////////////////////// 1번 작업 종료 //////////////////////////////

			///////////////////////////// 2번 작업 시작 //////////////////////////////

			pstmt = con.prepareStatement(sql2.toString());

			pstmt.setString(1, "생명공학과");
			pstmt.setString(2, "8호관");
			pstmt.setInt(3, 255);

			pstmt.executeUpdate();

			///////////////////////////// 2번 작업 종료  //////////////////////////////
			
			// 쿼리가 정상적으로 실행된 경우에 db에 반영됨
			
			con.commit();
			System.out.println("db에 정상적으로 반영되었습니다.");

			
		} catch (SQLException se) {
			// TODO: handle exception
			
			try {
				con.rollback();
				System.out.println("db에 반영된 작업이 취소되었습니다.");
			} catch (SQLException ss) {
				// TODO: handle exception
				ss.printStackTrace();
			}
			
		}  finally {
			
			try {
				if(con != null) {
					con.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException se) {
				// TODO: handle exception
				
				se.printStackTrace();
				
			}

		}
		
		//////////////////////////////transaction 시작 /////////////////////////
		
	}

}
