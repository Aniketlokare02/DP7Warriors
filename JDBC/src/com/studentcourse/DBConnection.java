package com.studentcourse;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	
	static Connection conn=null;
	
	public static Connection getConnect() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded..");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentcourse", "root", "root");
			System.out.println("Connection Done...");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return conn;
	}
	
	public static void main(String[] args) {
		
		getConnect();

	}

}
