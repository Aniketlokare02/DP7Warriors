package com.factoryPattern;

import java.util.Scanner;

public class HiredEmployee {

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter Employee Type(FullTime, PartTime):");
		String eType=ip.next();
		
		GetEmployeeType gemp=new GetEmployeeType();
		
		Employee emp=gemp.getEmployee(eType);
		
		if(emp==null) {
			System.out.println("Employee Not Found...");
		}
		else {
			System.out.println("--------------------");
			System.out.println("Enter Employee Name:");
			emp.setName(ip.next());
			
			System.out.println("====================");
			System.out.println("Welcome To ThinkQuotient : "+emp.getName());
			
			emp.workingHours();
			System.out.println("Working Hours of "+emp.getName()+" is : "+emp.noOfHours);
			
			emp.paySalary();
			System.out.println("Salary of "+emp.getName()+" is : "+emp.salary+"Rs/Day");
			
			System.out.println("====================");
		}

	}

}
