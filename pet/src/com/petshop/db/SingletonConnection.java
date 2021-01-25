package com.petshop.db;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;


public class SingletonConnection {
	private static Connection conn = null;
	
	
	static {
		
		try {
			Properties props = new Properties();
			FileInputStream in = new FileInputStream("conf/database.properties");
			props.load(in);
			in.close();
	
			String driver = props.getProperty("jdbc.driver");
			String url = props.getProperty("jdbc.url");
			String dbName = props.getProperty("jdbc.db");
			String username = props.getProperty("jdbc.username");
			String password = props.getProperty("jdbc.password");
			
			Class.forName(driver);
	        conn = DriverManager.getConnection(url + dbName, username, password);
	
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
		
		

	public static Connection getConnection()   {
		return conn;
	}
	
	

}
