package com.mgnrega.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static Connection provideConnection()
	{
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/unit_5_cwp_mgnrega", "root", "1310");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return conn;
		
	}

}
