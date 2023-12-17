package com.companyDatabase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//2.WAP using JDBC to select and print employee names along with their manager names.
public class ShowEmployeeManager {
	
	static Connection con=null;
	PreparedStatement ps;
	ResultSet rs;
	
	public ShowEmployeeManager(){
		con=DBConnect.getConnect();
	}
	
	public void printEmpManager() {
		
		try {
			ps=con.prepareStatement("select e1.employee_id, e1.first_name, e2.employee_id, e2.first_name"
					+ " from employees e1 join employees e2"
					+ " on e1.manager_id=e2.employee_id");
			rs=ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
			}
		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		ShowEmployeeManager s=new ShowEmployeeManager();
		s.printEmpManager();

	}

}
