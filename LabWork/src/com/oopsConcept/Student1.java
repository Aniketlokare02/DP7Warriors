package com.oopsConcept;

import java.util.Scanner;

public class Student1 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter Your Choice 1 Or 0:");
		int choice = ip.nextInt();

		if (choice == 1) {
			Student s1 = new Student(101, "Aniket", "Manjariwadi");
			System.out.println("Student Id:"+s1.getsId());
			System.out.println("Student Name:"+s1.getsName());
			System.out.println("Student Address:"+s1.getsAddress());
			System.out.println("Student College Name:"+s1.getcName());
		} 
		else if (choice == 0) {
			System.out.print("Enter The College Name:");
			String cName=ip.next();
			Student s1 = new Student(102, "Hrishikesh", "Nashik", cName);
			//s1.setcName(cName);
			System.out.println("Student Id:"+s1.getsId());
			System.out.println("Student Name:"+s1.getsName());
			System.out.println("Student Address:"+s1.getsAddress());
			System.out.println("Student College Name:"+s1.getcName());
		} 
		else {
			System.out.println("Wrong Input.");
		}

	}

}
