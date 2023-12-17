package com.arrayContainment;

import java.util.Arrays;

public class StudentConstructor2 {
	
	static void findCountOfStudent(Student[] arr, Course[] co) {
		
		int count;
		for (Course c : co) {
			count=0;
			for (Student s : arr) {
				if(s.getCourse().equals(c)) {
					count++;
				}
			}
			System.out.println(c+" :"+count);
		}
	}
	
	static void printInfoOfStudent(Student[] arr, Course[] co) {

		for (Course c : co) {
			System.out.println(c);
			for (Student s : arr) {
				if (s.getCourse().equals(c)) {
					System.out.println(s);
				}
			}
			System.out.println("-----------------------------");
		}
	}

	public static void main(String[] args) {
		
		Course[] co=new Course[2];
		co[0]=new Course(101, "Java", 30000);
		co[1]=new Course(102, ".Net", 25000);
		
		Student[] arr=new Student[4];
		arr[0]=new Student(201, "Aniket", co[0]);
		arr[1]=new Student(202, "Hrishikesh", co[1]);
		arr[2]=new Student(203, "Suarj", co[1]);
		//arr[3]=new Student(204, "Pralay", c2);
		arr[3]=new Student();
		arr[3].setsId(204);
		arr[3].setsName("Pralay");
		arr[3].setCourse(co[0]);
		
		for (Student s : arr) {
			System.out.println(s);
		}
		
		System.out.println("----------------------------------------");
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("----------------------------------------");
		
		findCountOfStudent(arr, co);
		
		System.out.println("----------------------------------------");
		printInfoOfStudent(arr, co);
		
		

	}

}
