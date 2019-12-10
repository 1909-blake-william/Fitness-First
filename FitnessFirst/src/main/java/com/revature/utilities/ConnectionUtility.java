package com.revature.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static Connection getConnection() throws SQLException {
		String url = System.getenv("fitness_url");
		String username = System.getenv("fitness_username");
		String password = System.getenv("fitness_password");
		return DriverManager.getConnection(url, username, password);
	}
}
