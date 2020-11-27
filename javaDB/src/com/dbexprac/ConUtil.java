package com.dbexprac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConUtil {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException ce) {
			// TODO: handle exception
			ce.printStackTrace();
		}
	}
	
	static Connection getConnection() throws SQLException {
		
		return DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger");
		
	}
	

}
