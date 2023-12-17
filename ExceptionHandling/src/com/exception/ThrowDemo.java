package com.exception;

import java.util.Scanner;

public class ThrowDemo {
	
	static Scanner ip=new Scanner(System.in);
	
	static void enterDetails() {
		
		System.out.print("Enter Name:");
		String name=ip.next();
		
		System.out.print("Enter Marks:");
		int marks=ip.nextInt();
		
		if(marks<0) {
			throw new RuntimeException("Marks Should Be Greater Than 0.");
		}
		else {
			if(marks>=40) {
				System.out.println(name+" Has Cleared The Exam.");
			}
			else {
				System.out.println(name+" Has Failed In Exam.");
			}
		}
	}

	public static void main(String[] args) {
		
		enterDetails();

	}

}
