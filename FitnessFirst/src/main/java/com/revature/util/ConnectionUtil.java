package com.revature.util;

import java.sql.Connection;
import java.sql.SQLException;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionUtil {
	 private static HikariConfig config = new HikariConfig();
	    private static HikariDataSource ds;
	 
	    static {
	        config.setJdbcUrl(System.getenv("Fitness_Database"));
	        config.setUsername( System.getenv("Fitness_User") );
	        config.setPassword(System.getenv("Fitness_Pass"));
	        config.addDataSourceProperty("cachePrepStmts" , "true");
	        config.addDataSourceProperty("prepStmtCacheSize" , "20");
	        config.addDataSourceProperty("prepStmtCacheSqlLimit" , "2048");
	        ds = new HikariDataSource( config );
	    }
	 
	   
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	 private ConnectionUtil() {}
	 
	 public static Connection getConnection() throws SQLException {
	       return ds.getConnection();
	 }
	
	
}
