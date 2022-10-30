package com.masai.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {

	static Connection conn = null;
	
	public static Connection provideConnection() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		String url = "jdbc:mysql://localhost:3306/db1";
		
		try {
			conn = DriverManager.getConnection(url, "root", "mohit20");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
        return conn;   
	}
	
}
