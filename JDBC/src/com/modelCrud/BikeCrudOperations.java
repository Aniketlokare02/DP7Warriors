package com.modelCrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class BikeCrudOperations {
	
	Connection con=null;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	static Scanner ip=new Scanner(System.in);
	
	public BikeCrudOperations() {
		con=DBConnect.getConnect();
		try {
			st=con.createStatement();
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void fetchAllDetails() {
		
		try {
			rs=st.executeQuery("select * from model");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insertModel() {
		
		System.out.println("Enter Model Id:");
		int id=ip.nextInt();
		
		System.out.println("Enter Model Name:");
		String name=ip.next();
		
		System.out.println("Enter Price:");
		int price=ip.nextInt();
		
		try {
			ps=con.prepareStatement("insert into model values(?,?,?)");
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setInt(3, price);
			ps.execute();
			
			int noOfModel=ps.executeUpdate();
			
			if(noOfModel>0) {
				System.out.println("Model Added..");
			}
			else {
				System.out.println("Error in Model..");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void deleteModelById() {
		
		System.out.println("Enter Model Id To Be Deleted..");
		int id=ip.nextInt();
		
		try {
			ps=con.prepareStatement("delete from model where=?");
			ps.setInt(1, id);
			
			int noOfRowDeleted=ps.executeUpdate();
			
			if(noOfRowDeleted>0) {
				System.out.println("Model Deleted..");
			}
			else {
				System.out.println("Error In Model..");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateModel() {
		
		System.out.println("Enter Model Name To Be Updated:");
		String name=ip.next();
		
		try {
			ps=con.prepareStatement("update model set cost=cost+(cost*0.1) where model_name=?");
			ps.setString(1, name);
			
			int noOfRowUpdated=ps.executeUpdate();
			
			if(noOfRowUpdated>0) {
				System.out.println("Model Updated..");
			}
			else {
				System.out.println("Error in Model..");
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void searchByName() {
		
		System.out.println("Enter Model Name:");
		String name=ip.next();
		
		try {
			ps=con.prepareStatement("select * from model where model_name=?");
			ps.setString(1, name);
			
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println("Model Id:"+rs.getInt(1));
				System.out.println("Model Name:"+rs.getString(2));
				System.out.println("Model Price:"+rs.getInt(3));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		BikeCrudOperations b1=new BikeCrudOperations();
		
		int choice;
		char ch;
		
		do {
			
			System.out.println("1.View All Models\n2.Insert Model\n3.Delete Model\n4.Update Model\n5.Search Model By Name\n6.Exit");
			System.out.println("Enter Your Choice:");
			choice=ip.nextInt();
			switch(choice) {
			case 1:b1.fetchAllDetails();
			break;
			case 2:b1.insertModel();
			break;
			case 3:b1.deleteModelById();
			break;
			case 4:b1.updateModel();
			break;
			case 5:b1.searchByName();
			break;
			case 6:System.out.println("----Model Application is Cloesd----");
			       System.exit(0);
			       break;
			default:System.out.println("Wrong Input..");
			}
			System.out.println("Want To Continue Enter (y-yes/n-no)");
			ch=ip.next().charAt(0);
		}while(ch=='y' || ch=='Y');
		
		//b1.fetchAllDetails();
		//b1.insertModel();
		//b1.updateModel();
		//b1.searchByName();

	}

}
