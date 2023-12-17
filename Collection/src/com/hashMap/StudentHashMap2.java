package com.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentHashMap2 {

	public static void main(String[] args) {
		
		HashMap<Student, String> shm=new HashMap<>();
		shm.put(new Student(201, "Aniket", 95.5), "Java");
		shm.put(new Student(202, "Hrishikesh", 85.6), "Python");
		shm.put(new Student(203, "Suraj", 75.4), ".Net");
		shm.put(new Student(204, "Pralay", 90.4), "C");
		shm.put(new Student(205, "Shivam", 89.4), "C++");
		System.out.println(shm.put(new Student(205, "Shivam", 89.4), "C++"));
		System.out.println("-------------");
		shm.put(new Student(205, "Vishal", 89.4), "Angular");
		
		for(Entry<Student, String> e : shm.entrySet()) {
			System.out.println("Student Details:"+e.getKey());
			System.out.println("Course:"+e.getValue());
			System.out.println("--------------------------------");
		}

	}

}
