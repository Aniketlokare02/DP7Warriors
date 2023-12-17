package com.hashMap;

import java.util.HashMap;
import java.util.Map;

public class StudentCourseHashMap {

	public static void main(String[] args) {
		
		Course c1=new Course(201, "Java", 35000f);
		Course c2=new Course(202, "Python", 45000f);

		HashMap<Student, Course> schm=new HashMap<>();
		schm.put(new Student(101, "Aniket", 95.4), c1);
		schm.put(new Student(102, "Hrishikesh", 85.6), c2);
		schm.put(new Student(103, "Suraj", 80.2), c1);
		schm.put(new Student(104, "Pralay", 92.3), c2);
		schm.put(new Student(105, "Shivam", 75.2),c1);
		schm.put(new Student(106, "Kailash", 87.4), c2);
		
		for(Map.Entry<Student, Course> e : schm.entrySet()) {
			System.out.println("Student Details:"+e.getKey());
			System.out.println("Course Details:"+e.getValue());
			System.out.println("-----------------------------");
		}

	}

}
