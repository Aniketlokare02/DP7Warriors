package com.containment;

import java.util.Scanner;

public class MyCollegeUsingUserInput {
	
	static Scanner ip=new Scanner(System.in);
	
	void enterStudentDetails(Student s) {
		System.out.println("Enter Student Id:");
		s.setsId(ip.nextInt());
		
		System.out.println("Enter Name:");
		s.setsName(ip.next());
		
		s.setCourse(new Course());
		
		System.out.println("Enter Course Id:");
		s.getCourse().setcId(ip.nextInt());
		
		System.out.println("Enter Course Name:");
		s.getCourse().setcName(ip.next());
		
		System.out.println("Enter Fees:");
		s.getCourse().setFees(ip.nextFloat());
	}

	public static void main(String[] args) {
		
		MyCollegeUsingUserInput college=new MyCollegeUsingUserInput();
		
		Student s1=new Student();
		Student s2=new Student();
		
		college.enterStudentDetails(s1);
		college.enterStudentDetails(s2);
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
