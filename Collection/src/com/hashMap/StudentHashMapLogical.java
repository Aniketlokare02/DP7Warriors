package com.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class StudentHashMapLogical {
	
	public static void createCountStudent(HashMap<Student, String> hm) {
		
		HashMap<String, Integer> h1=new HashMap<>();
		
		//int count;
		
		for(Map.Entry<Student, String> e : hm.entrySet()) {
			
			String course=e.getValue();
			
			if(h1.containsKey(course)) {
				
				//count=h1.get(course);
				//count=count+1;
				//h1.put(course, count);
				h1.put(course, h1.get(course)+1);
			}
			else {
				h1.put(course, 1);
			}
		}
		
		for(Map.Entry<String, Integer> e : h1.entrySet()) {
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
	}
	
	public static void courseNameMap(HashMap<Student, String> hm) {
		
		HashMap<String, ArrayList<String>> h1=new HashMap<>();
		
		ArrayList<String> names;
		
		for(Map.Entry<Student, String> e : hm.entrySet()) {
			
			String course=e.getValue();
			
			if(h1.containsKey(course)) {
				names=h1.get(course);
//				names.add(e.getKey().getName());
//				h1.put(course, names);
			}
			else {
				names= new ArrayList<>();
//				names.add(e.getKey().getName());
//				h1.put(course, names);
			}
			names.add(e.getKey().getName());
			h1.put(course, names);
		}
		
		for(Map.Entry<String, ArrayList<String>> e : h1.entrySet()) {
			System.out.println("Course:"+e.getKey());
			System.out.println("-----");
			for(String s : e.getValue()) {
				System.out.println("Student:"+s);
			}
			System.out.println("--------------");
		}
	}
	
	public static void courseStudentMap(HashMap<Student, String> hm) {

		HashMap<String, ArrayList<Student>> h1 = new HashMap<>();

		ArrayList<Student> student;

		for (Map.Entry<Student, String> e : hm.entrySet()) {

			String course = e.getValue();

			if (h1.containsKey(course)) {
				student = h1.get(course);
//				student.add(e.getKey());
//				h1.put(course, student);
			} else {
				student = new ArrayList<>();
//				student.add(e.getKey());
//				h1.put(course, student);
			}
			student.add(e.getKey());
			h1.put(course, student);
		}

		for (Map.Entry<String, ArrayList<Student>> e : h1.entrySet()) {
			System.out.println("Course:" + e.getKey());
			System.out.println("-----");
			for (Student s : e.getValue()) {
				System.out.println("Student:" + s);
			}
			System.out.println("--------------");
		}
	}

	public static void main(String[] args) {
		
		HashMap<Student, String> shm=new HashMap<>();
		shm.put(new Student(201, "Aniket", 95.5), "Java");
		shm.put(new Student(202, "Hrishikesh", 85.6), "Python");
		shm.put(new Student(203, "Suraj", 75.4), ".Net");
		shm.put(new Student(204, "Pralay", 90.4), "C");
		shm.put(new Student(205, "Shivam", 89.4), "C++");
		shm.put(new Student(205, "Vishal", 89.4), "Angular");
		
		for(Entry<Student, String> e : shm.entrySet()) {
			System.out.println("Student Details:"+e.getKey());
			System.out.println("Course:"+e.getValue());
			System.out.println("--------------------------------");
		}
		
		createCountStudent(shm);
		
		System.out.println("---------------------------------");
		
		courseNameMap(shm);
		
		System.out.println("---------------------------------");
		
		courseStudentMap(shm);

	}

}
