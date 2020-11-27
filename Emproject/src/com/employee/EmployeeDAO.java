package com.employee;


/*
EmployeeDAO : 데이터 처리를 위한 클래스

로직에서 자료를 받아 데이터베이스에 입력과 조회를 수행한다.

DAO 클래스는 
사원 등록
사원 정보 조회
사원 번호를 입력 받아 정보조회
사원 이름을 입력 받아 정보조회를 목적으로 한다.

각 메소드로 구현됨.

메소드명 
getEmployeeregiste(), 
getEmployeeCheck(),
getEmployeeNo(),
getEmployeeName()
*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import java.util.ArrayList;

public class EmployeeDAO {
	
	// 작성되는 메소드들은 공통적으로 preparedStatement() 메소드를 호출하여 쿼리를 실행시켜 데이터베이스를
	// 조작할 preparedStatement 객체를 얻음
	
	
	// 신규 사용자 등록
	public EmployeeVO getEmployeeregiste(EmployeeVO evo) throws Exception {
		
		// 데이터 처리를 위한 쿼리문 작성
		// 개발자 몫
		String dml = "insert into employee(no, name, jobGrade, department, email) "
				+"values(employee_seq.nextval, ?, ?, ?, ?)";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		EmployeeVO retval = null;
		
		try {
			// DBUtil 클래스의 getConnection() 메소드로 데이터베이스와 연결
			con = DBUtil.getConnection();
			
			// 입력받은 사용자 정보를 처리하기 위한 쿼리문 생성
			pstmt = con.prepareStatement(dml);
			
			pstmt.setString(1, evo.getName());
			pstmt.setString(2, evo.getJobGrade());
			pstmt.setInt(3, evo.getDepartment());
			pstmt.setString(4, evo.getEmail());
			
			// sql 쿼리문 수행 후 처리 결과를 얻어옴
			int i = pstmt.executeUpdate();
			
			// sql 쿼리문 수행 후 수행 결과를 EmployeeVO()에 저장함
			retval = new EmployeeVO();
			
			retval.setStatus(i + " ");
			
			
		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(pstmt != null) {
					pstmt.close();
				}
				if(con != null) {
					con.close();
				}
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
		}
		
		return retval;
		
	}
	
	
	// 사원 번호와 이름을 입력받아 사원 정보 조회
	
	public EmployeeVO getEmployeeCheck(int no, String name) throws Exception {
		
		String dml = "select * form employee where no = ? and name = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;
		
		try {
			
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(dml);
			
			pstmt.setInt(1, no);
			pstmt.setString(2, name);
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3),
						rs.getInt(4), rs.getString(5));
			}
			
		} catch (SQLException se) {
			// TODO: handle exception
			System.out.println(se.getMessage());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(con != null) {
					con.close();
				}
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
		}
		
		return retval;
		
	}
	
	
	
	// 사원 번호를 입력받아 정보를 조회
	
	public EmployeeVO getEmployeeNo(int no) throws Exception {
		
		String dml = "select * from employee where no = ?";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;
		
		try {
			
			con = DBUtil.getConnection();
			
			pstmt = con.prepareStatement(dml);
			
			pstmt.setInt(1, no);
			
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				retval = new EmployeeVO(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getInt(4),
						rs.getString(5)
						);
			}
			
		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(con != null) {
					con.close();
				}
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
		}
		
		return retval;
		
	}
	
	
	public EmployeeVO getEmployeeName(String name) throws Exception {

		String dml = "select * from employee where name = ?";

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO retval = null;

		try {

			con = DBUtil.getConnection();

			pstmt = con.prepareStatement(dml);

			pstmt.setString(1, name);

			rs = pstmt.executeQuery();

			if (rs.next()) {
				retval = new EmployeeVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5));
			}

		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(con != null) {
					con.close();
				}
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
		}
		
		return retval;
	}
	
	// 전체 사원 조회
	
	public ArrayList<EmployeeVO> getEmployeetotal() {
		
		ArrayList<EmployeeVO> list = new ArrayList<EmployeeVO>();
		
		String dml = "select * from employee";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		EmployeeVO emVO = null;
		
		try {
			
			con = DBUtil.getConnection();

			pstmt = con.prepareStatement(dml);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				emVO = new EmployeeVO(
				
				rs.getInt(1),
				rs.getString(2),
				rs.getString(3),
				rs.getInt(4),
				rs.getString(5));
				
				list.add(emVO);
			}
			
		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(con != null) {
					con.close();
				}
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
			
		}
		
		return list;
		
	}
	
	public ArrayList<String> getColumnName() {
		
		ArrayList<String> columnName = new ArrayList<String>();
		
		String sql = "select * from employee";
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData rsmd = null;
		
		try {
			
			con = DBUtil.getConnection();
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			rsmd = rs.getMetaData();
			
			int cols = rsmd.getColumnCount();
			
			for(int i = 1; i <= cols; i++) {
				columnName.add(rsmd.getColumnName(i));
			}
			
		} catch (SQLException se) {
			// TODO: handle exception
			se.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(con != null) {
					con.close();
				}
			} catch (SQLException se) {
				// TODO: handle exception
				se.printStackTrace();
			}
		}
		
		return columnName;
		
	}
	

}
