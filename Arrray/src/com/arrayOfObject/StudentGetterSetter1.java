package com.arrayOfObject;

import java.util.Scanner;

public class StudentGetterSetter1 {
	
	static Scanner ip=new Scanner(System.in);
	
	static void enterDetails(Student s) {
		System.out.print("Enter Student Id:");
		s.setsId(ip.nextInt());
		
		System.out.print("Enter Student Name:");
		s.setName(ip.next());
		
		System.out.print("Enter Student Marks:");
		s.setMarks(ip.nextFloat());
	}
	
	static void printDetails(Student[] arr) {
		for (Student s : arr) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		
		Student[] arr=new Student[3];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Student();
			enterDetails(arr[i]);
			
		}
		
		System.out.println("-----------------------------------------");
		
		printDetails(arr);

	}

}
