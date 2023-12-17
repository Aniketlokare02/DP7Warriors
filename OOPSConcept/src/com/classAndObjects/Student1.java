package com.classAndObjects;

import java.util.Scanner;

public class Student1 {
	
	int id;
	String name;
	float mark1;
	float mark2;
	float mark3;
	float per;
	char grade;
	
	void calPercentange() {
		per=(mark1+mark2+mark3)/300;
	}
	
	void calGrade() {
		if(per>=90) 
			grade='A';
		else if(per>=75)
			grade='B';
		else if(per>=65)
			grade='C';
		else if(per>=45)
			grade='D';
		else
			grade='F';
	}
	
	void display() {
		System.out.println("Id:"+id+" Name:"+name+" Percentage:"+per);
		if(grade=='F') {
			System.out.println("You are Failed...Try Hard Next Time.");
		}
		else {
			System.out.println("Congrasulations!!! Your Grade is:"+grade);
		}
	}

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		
		Student1 s=new Student1();
		
		System.out.print("Enter Id:");
		s.id=ip.nextInt();
		System.out.print("Enter Name:");
		s.name=ip.next();
		System.out.print("Enter Marks Of Subject 1:");
		s.mark1=ip.nextFloat();
		System.out.print("Enter Marks Of Subject 2:");
		s.mark2=ip.nextFloat();
		System.out.print("Enter Marks Of Subject 3:");
		s.mark3=ip.nextFloat();
		
		System.out.println("------------------------");
		s.calPercentange();
		s.calGrade();
		s.display();

	}

}
