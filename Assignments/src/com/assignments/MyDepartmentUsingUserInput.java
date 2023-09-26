package com.assignments;

import java.util.Scanner;

public class MyDepartmentUsingUserInput {

	static Scanner ip=new Scanner(System.in);
	
	void enterDetails(Student1 s) {
		System.out.println("Enter Student Id:");
		s.setRollNo(ip.nextInt());
		
		System.out.println("Enter Student Name:");
		s.setsName(ip.next());
		
		s.setDepartMent(new DepartMent());
		
		System.out.println("Enter Department Id:");
		s.getDepartMent().setdId(ip.nextInt());
		
		System.out.println("Enter Department Name:");
		s.getDepartMent().setdName(ip.next());
	}
	
	public static void main(String[] args) {
		MyDepartmentUsingUserInput dept=new MyDepartmentUsingUserInput();
		
		Student1 s1=new Student1();
		Student1 s2=new Student1();
		
		dept.enterDetails(s1);
		dept.enterDetails(s2);
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
