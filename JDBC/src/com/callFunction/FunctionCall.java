package com.callFunction;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;


public class FunctionCall {
	
	Connection con;
	Statement st;
	CallableStatement cst;
	static Scanner ip=new Scanner(System.in);
	
	public FunctionCall(){
		
		con=DBConnect.getConnect();
		try {
			st=con.createStatement();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void calTotalSalaryDeptWise() {
		
		System.out.println("Enter the department id:");
		int id= ip.nextInt();
		
		try
		{
			cst= con.prepareCall("{ ?=  call totalSalaryDeptWise(?)}");
			cst.registerOutParameter(1, Types.INTEGER);
			cst.setInt(2, id);
			
			boolean status= cst.execute();
			if(!status)
			{
				System.out.println("Total salary of department "+id+" is:"+cst.getInt(1));
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		
		FunctionCall f1=new FunctionCall();
		f1.calTotalSalaryDeptWise();

	}

}
