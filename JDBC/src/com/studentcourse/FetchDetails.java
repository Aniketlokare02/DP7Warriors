package com.studentcourse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FetchDetails {

	static Connection con = null;
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	static Scanner ip = new Scanner(System.in);

	public FetchDetails() {
		con = DBConnect.getConnect();
		System.out.println("Connection done.....");
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

	public void fetchCourseDetails() {
		try {
			rs = st.executeQuery("select * from course");

			System.out.println("--------------Courses---------------------");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getInt(3) + "  " + rs.getFloat(4)
						+ "  " + rs.getInt(5));
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void insertCourse() {

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

		try {
			pst = con.prepareStatement("insert into course values(?,?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setInt(3, dur);
			pst.setInt(4, fees);
			pst.setInt(5, count);

			int noOfRowsInserted = pst.executeUpdate();

			if (noOfRowsInserted > 0) {
				System.out.println("Course Added..");
				fetchCourseDetails();
			} 
			else {
				System.out.println("Error in Course.");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Delete usiing prepared statement
	public void deleteCourse() {

		System.out.println("Enter The Course Id To Be Deleted:");
		int id = ip.nextInt();

		try {
			pst = con.prepareStatement("delete from course where cId=?");
			pst.setInt(1, id);

			int noOfRowsDeleted = pst.executeUpdate();
			if (noOfRowsDeleted > 0) {
				System.out.println("Course " + id + " is Deleted.");
				fetchCourseDetails();
			} 
			else {
				System.out.println("Error in deleting course.");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	//delete using statement
	public void deleteCourse2() {

		System.out.println("Enter The Course Id To Be Deleted:");
		int id = ip.nextInt();

		try {
			int noOfRowsDeleted = st.executeUpdate("delete from course where cId="+id);
			if (noOfRowsDeleted > 0) {
				System.out.println("Course " + id + " is Deleted.");
				fetchCourseDetails();
			} 
			else {
				System.out.println("Error in deleting course.");
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteCourseByName()
	{
		System.out.println("Enter the course name to be deleted:");
		String cname=ip.next();
		
		try
		{					
			int noOfRowsDeleted= st.executeUpdate("delete from course where cname='"+cname+"';");
			
			if(noOfRowsDeleted>0)
			{
				System.out.println("Course "+cname+ " is deleted");
				fetchCourseDetails();
			}
			else
			{
				System.out.println("Error in deleting course...");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
	
	public boolean searchCourseById(int id)
	{
		boolean isFound=false;
		try
		{
		   pst= con.prepareStatement("select * from course where cId=?");
		   pst.setInt(1, id);
		   
		   rs= pst.executeQuery();
		   
		   while(rs.next())
		   {
			   isFound=true;
			  System.out.println("Course id :"+rs.getInt(1));
			  System.out.println("Course name:"+rs.getString(2));
			  System.out.println("Duration:"+rs.getInt(3));
			  System.out.println("Fees:"+rs.getFloat(4));
			  System.out.println("Number of students:"+rs.getInt(5));
		   }
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return isFound;
	   
	}
	
	public void updateCourseFees()
	{
		System.out.println("Enter course id whose fees is to updated:");
		int id= ip.nextInt();
		
		if(searchCourseById(id))
		{
			System.out.println("Ente the new fees:");
			int fees= ip.nextInt();
			
			try
			{
			   pst= con.prepareStatement("update course set fees=? where cId=?");
			   pst.setFloat(1, fees);
			   pst.setInt(2, id);
			   
			   int noOfRowsUpdated= pst.executeUpdate();
			   if(noOfRowsUpdated>0)
			   {
				   System.out.println("Course updated .....");
				   System.out.println("---------------------");
				   searchCourseById(id);
			   }
			   else
			   {
				   System.out.println("Error in updating course.........");
			   }
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			
		}
		else
		{
			System.out.println("Course "+id+" not found..");
		}
		
		
	}

	public static void main(String[] args) {

		FetchDetails f1 = new FetchDetails();
		int choice;
		char ch;
		
		do {
			System.out.println("1.View All Courses.\n2.Insert Course\n3.Update Course By Fees\n4.Delete Course\n5.Search Course By Id\n6.Delete Course By Name\n7.Exit");
			System.out.println("Enter Your Choice.");
			choice=ip.nextInt();
			
			switch(choice) {
			case 1:f1.fetchCourseDetails();
				   break;
			case 2:f1.insertCourse();
			       break;
			case 3:f1.updateCourseFees();
			       break;
			case 4:f1.deleteCourse();
			       break;
			case 5:System.out.println("Enter Course Id:");
				   int id=ip.nextInt();
				   f1.searchCourseById(id);
			       break;
			case 6:f1.deleteCourseByName();
			       break;
			case 7:System.out.println("------Course is Closed------");
				   System.exit(0);
			       break;
			default:System.out.println("Wrong Input.");
			}
			System.out.println("Do You Want To Continue (y-yes/n-no)");
			ch=ip.next().charAt(0);
		}while(ch=='y'|| ch=='Y');
		
		//f1.fetchCourseDetails();
		//f1.insertCourse();
		//f1.deleteCourse();
		//f1.deleteCourse2();
		//f1.deleteCourseByName();
		//f1.updateCourseFees();

	}

}
