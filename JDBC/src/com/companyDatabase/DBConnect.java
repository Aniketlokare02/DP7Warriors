package com.companyDatabase;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	public static final String JDBC_Driver="com.mysql.cj.jdbc.Driver";
	public static final String JDBC_URL="jdbc:mysql://localhost:3306/companydatabase";
	public static final String USERNAME="root";
	public static final String PASSWORD="root";
	
	static Connection conn=null;
	
	public static Connection getConnect() {
		
		try {
			Class.forName(JDBC_Driver);
			System.out.println("Driver Loaded..");
			conn=DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
			System.out.println("Connection Done...");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return conn;
	}

}
