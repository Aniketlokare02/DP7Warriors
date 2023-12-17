package com.companyDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

//1.WAP using JDBC to select and print all country names.
public class CountriesJDBC {
	
	static Connection con=null;
	PreparedStatement ps;
	ResultSet rs;
	static Scanner ip=new Scanner(System.in);
	
	public CountriesJDBC() {
		con=DBConnect.getConnect();
	}
	
	public void printAllCountries() {
		
		try {
			ps=con.prepareStatement("select * from countries");
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" -> "+rs.getString(2)+" -> "+rs.getInt(3));
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		CountriesJDBC c=new CountriesJDBC();
		c.printAllCountries();

	}

}
