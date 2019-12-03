package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() throws SQLException{
		String database = System.getenv("Fitness_Database");
		String user = System.getenv("Fitness_User");
		String pass = System.getenv("Fitness_Pass");
		
		return DriverManager.getConnection(database, user, pass);
	}
	
	
}
