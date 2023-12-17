package com.arrayContainment;

import java.util.Arrays;

public class StudentConstructor {

	public static void main(String[] args) {
		
		Course c1=new Course(101, "Java", 30000);
		Course c2=new Course(102, ".Net", 25000);
		
		Student[] arr=new Student[4];
		arr[0]=new Student(201, "Aniket", c1);
		arr[1]=new Student(202, "Hrishikesh", c1);
		arr[2]=new Student(203, "Suarj", c2);
		//arr[3]=new Student(204, "Pralay", c2);
		arr[3]=new Student();
		arr[3].setsId(204);
		arr[3].setsName("Pralay");
		arr[3].setCourse(c2);
		
		for (Student s : arr) {
			System.out.println(s);
		}
		
		System.out.println("----------------------------------------");
		
		System.out.println(Arrays.toString(arr));

	}

}
