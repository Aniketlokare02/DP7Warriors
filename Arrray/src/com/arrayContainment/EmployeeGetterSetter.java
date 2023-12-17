package com.arrayContainment;

import java.util.Scanner;

public class EmployeeGetterSetter {
	
	static Scanner ip=new Scanner(System.in);
	
	static void enterDetails(Employee e) {
		
		System.out.println("Enter Employee Id:");
		e.seteId(ip.nextInt());
		
		System.out.println("Enter Employee Name:");
		e.seteName(ip.next());
		
		System.out.println("Enter Employee Salary:");
		e.setSalary(ip.nextFloat());
		
		e.setDepartMent(new DepartMent());
		System.out.println("Enter Department Id:");
		e.getDepartMent().setdId(ip.nextInt());
		
		System.out.println("Enter Department Name:");
		e.getDepartMent().setdName(ip.next());
	}

	public static void main(String[] args) {
		
		Employee[] emp=new Employee[2];
		
		for(int i=0;i<emp.length;i++) {
			emp[i]=new Employee();
			enterDetails(emp[i]);
			
		}
		
		for (Employee e : emp) {
			System.out.println(e);
		}

	}

}
