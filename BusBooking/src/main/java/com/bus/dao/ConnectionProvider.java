package com.bus.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {
	
	private static Connection con;
	//private DBConnection() {}
	
	static {
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/bus-service";
			String uname = "root";
			String pwd = "root";
              con = DriverManager.getConnection(url,uname,pwd);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static Connection getConnection() {
		
		return con;
	}
}
