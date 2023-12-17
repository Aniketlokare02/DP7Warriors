package com.arrayContainment;

import java.util.Scanner;

public class StudentGetterSetter {
	
	static Scanner ip=new Scanner(System.in);
	
	static void enterDetails(Student s) {
		
		System.out.println("Enter Id:");
		s.setsId(ip.nextInt());
		
		System.out.println("Enter Name:");
		s.setsName(ip.next());
		
		s.setCourse(new Course());
		
		System.out.println("Enter Course Id:");
		s.getCourse().setcId(ip.nextInt());
		
		System.out.println("Enter Course Name:");
		s.getCourse().setcName(ip.next());
		
		System.out.println("Enter Course Fees:");
		s.getCourse().setFess(ip.nextDouble());
		
	}
	
	static void printDetails(Student[] st) {
		
		for (Student s : st) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		
		Student[] st=new Student[3];
		
		for(int i=0;i<st.length;i++) {
			st[i]=new Student();
			enterDetails(st[i]);
		}
		
		printDetails(st);

	}

}
