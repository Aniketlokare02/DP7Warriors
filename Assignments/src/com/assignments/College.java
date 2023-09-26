package com.assignments;

public class College {

	public static void main(String[] args) {
		
		DepartMent d1=new DepartMent(101, "Mechanical");
		DepartMent d2=new DepartMent(102, "ComputerScience");
		DepartMent d3=new DepartMent(103, "Electrical");
		
		Student1 s1=new Student1(201, "Aniket", d1);
		Student1 s2=new Student1(202, "Suarj", d2);
		Student1 s3=new Student1(203, "Hrishikesh", d3);
		Student1 s4=new Student1(204, "Vishal", d1);
		Student1 s5=new Student1(205, "Pralay", d2);
		Student1 s6=new Student1(206, "Shivam", d3);
		
		System.out.println(s1);
		System.out.println("----------------------");
		System.out.println(s2);
		System.out.println("----------------------");
		System.out.println(s3);
		System.out.println("----------------------");
		System.out.println(s4);
		System.out.println("----------------------");
		System.out.println(s5);
		System.out.println("----------------------");
		System.out.println(s6);

	}

}
