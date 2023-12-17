package com.resultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.studentcourse.DBConnect;

public class ResultSetDemo {

	Connection con = null;
	Statement st;
	ResultSet rs;
	static Scanner ip = new Scanner(System.in);

	ResultSetDemo() {
		con = DBConnect.getConnect();

		try {
			st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
			rs = st.executeQuery("select * from course");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fetchAllCourses() {

		try {
			rs.beforeFirst();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + "  " + rs.getFloat(4)
						+ "  " + rs.getInt(5));
			}
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void fetchAllCoursesRevrse() {

		try {
			rs.afterLast();
			while (rs.previous()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + "  " + rs.getFloat(4)
						+ "  " + rs.getInt(5));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertCourse() {
		
		try {
			rs.moveToInsertRow();
			
			System.out.println("Enter Course Id:");
			int id = ip.nextInt();

			System.out.println("Enter Course Name:");
			String name = ip.next();

			System.out.println("Enter Duration:");
			int dur = ip.nextInt();

			System.out.println("Enter Fees:");
			int fees = ip.nextInt();

			System.out.println("Enter Count:");
			int count = ip.nextInt();
			
			rs.updateInt(1, id);
			rs.updateString(2, name);
			rs.updateInt(3, dur);
			rs.updateInt(4, fees);
			rs.updateInt(5, count);
			rs.insertRow();
			System.out.println("Data Inserted.");
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteCourse()
	{
		System.out.println("Enter the course id to be deleted:");
		int id= ip.nextInt();
		
		try
		{
			rs.beforeFirst();
			while(rs.next())
			{
				if(rs.getInt(1)==id)
				{
					rs.deleteRow();
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public void updateCourseFees()
	{
		System.out.println("Enter the course name to be updated:");
		String cname=ip.next();
		
		try
		{
			rs.beforeFirst();
			while(rs.next())
			{
				if(rs.getString(2).equals(cname))
				{
					System.out.println("Old fees:"+rs.getInt(4));
					System.out.println("Enter new fees:");
					float fees= ip.nextInt();
					
					rs.updateFloat(4, fees);
					rs.updateRow();
					
				}
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public static void main(String[] args) {

		ResultSetDemo r1 = new ResultSetDemo();
		
		int choice;
		char ch;
		
		do {
			System.out.println("=========================================================");
			System.out.println("1. View all courses");
			System.out.println("2. View all courses Reverse");
			System.out.println("3. Add new Course");
			System.out.println("4. Delete Course ");
			System.out.println("5. Update Course fees");
			System.out.println("6. Exit");
			
			System.out.println("Enter your choice:");
			System.out.println("---------------------------------------------------");
			choice= ip.nextInt();
			
			switch(choice) {
			case 1:r1.fetchAllCourses();
				   break;
			case 2:r1.fetchAllCoursesRevrse();
			       break;
			case 3:r1.insertCourse();
			       break;
			case 4:r1.deleteCourse();
			       break;
			case 5:r1.updateCourseFees();
			       break;
			case 6:System.out.println("------Course is Closed------");
				   System.exit(0);
			       break;
			default:System.out.println("Wrong Input.");
			}
			System.out.println("Do You Want To Continue (y-yes/n-no)");
			ch=ip.next().charAt(0);
		}while(ch=='y'|| ch=='Y');
	
	}

}
