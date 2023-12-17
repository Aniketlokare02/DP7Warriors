package com.encapsulation;

import java.util.Scanner;

public class Details {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Employee Id:");
		int id=ip.nextInt();
		System.out.print("Enter Employee Name:");
		String name=ip.next();
		System.out.print("Enter Employee Slary:");
		float sal=ip.nextFloat();
		System.out.print("Enter Employee Department:");
		String dept=ip.next();
		
		Employee e=new Employee();
		
		e.setEmpId(id);
		e.setEmpName(name);
		e.setSalary(sal);
		e.setDept(dept);
		
		System.out.println("Employee Id:"+e.getEmpId());
		System.out.println("Employee Name:"+e.getEmpName());
		System.out.println("Employee Salary:"+e.getSalary());
		System.out.println("Employee Department:"+e.getDept());

	}

}
