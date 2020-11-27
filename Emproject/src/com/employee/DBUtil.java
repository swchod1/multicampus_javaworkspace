package com.employee;
/*
DBUtil : 데이터 베이스 연동
driver, url, connection
DriverManager(url, id, password)
*/
import java.sql.*;

public class DBUtil {
	
	static final String driver = "oracle.jdbc.driver.OracleDriver";
	static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
	
	static final String id = "scott";
	static final String pw = "tiger";
	
	public static Connection getConnection() throws Exception {
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, id, pw);
		
		return con;
	}

}
