package com.arrayOfObject;

import java.util.Scanner;

public class StudentGetterSetter {

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		
		Student[] arr=new Student[3];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Student();
			
			System.out.print("Enter Student Id:");
			arr[i].setsId(ip.nextInt());
			
			System.out.print("Enter Student Name:");
			arr[i].setName(ip.next());
			
			System.out.print("Enter Student Marks:");
			arr[i].setMarks(ip.nextFloat());
		}
		
		System.out.println("-----------------------------------------");
		
		for (Student s : arr) {
			System.out.println(s);
		}

	}

}
