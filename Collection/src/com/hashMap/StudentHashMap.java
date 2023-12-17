package com.hashMap;

import java.util.HashMap;
import java.util.Map;

public class StudentHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer, Student> shm=new HashMap<>();
		shm.put(101, new Student(201, "Aniket", 95.5));
		shm.put(102, new Student(202, "Hrishikesh", 85.6));
		shm.put(103, new Student(203, "Suraj", 75.4));
		shm.put(104, new Student(204, "Pralay", 90.4));
		shm.put(105, new Student(205, "Shivam", 89.4));
		shm.put(105, new Student(205, "Vishal", 89.4));
		
//		for(Map.Entry<Integer, Student> e : shm.entrySet()) {
//			System.out.println("Id:"+e.getKey());
//			System.out.println("Student Details:"+e.getValue());
//			System.out.println("------------------------------");
//		}
		
		for(Map.Entry<Integer, Student> e : shm.entrySet()) {
			System.out.println("Id:"+e.getKey());
			Student s=e.getValue();
			//System.out.println("Student Details:"+s);
			System.out.println(e.getValue().getName()+" "+e.getValue().getMarks());
			System.out.println("------------------------------");
		}

	}

}
