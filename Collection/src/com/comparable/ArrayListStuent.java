package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStuent {

	public static void main(String[] args) {
		
		ArrayList<Student> al=new ArrayList<>();
		al.add(new Student(1, "Aniket", 95.5f));
		al.add(new Student(2, "Hrishikesh", 85.5f));
		al.add(new Student(3, "Suraj", 92.6f));
		al.add(new Student(4, "Pralay", 87.5f));
		al.add(new Student(5, "Shivam", 89.5f));
		al.add(new Student(6, "Kailash", 75.5f));
		
		for (Student s : al) {
			System.out.println(s);
		}
		
		System.out.println("-------------------------------");
		
		Collections.sort(al);
		
		for (Student s : al) {
			System.out.println(s);
		}

	}

}
