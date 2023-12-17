package com.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeArrayList {

	public static void main(String[] args) {
		
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(101, "Aniket", 25000));
		al.add(new Employee(102, "Hrishikesh", 30000));
		al.add(new Employee(103, "Suraj", 25000));
		al.add(new Employee(104, "Pralay", 20000));
		al.add(new Employee(105, "Shivam", 35000));
		al.add(new Employee(106, "Vishal", 40000));
		
		for (Employee e : al) {
			System.out.println(e);
		}
		System.out.println("------------------");
		//Collections.sort(al);
		Collections.sort(al, Collections.reverseOrder());
		for (Employee e : al) {
			System.out.println(e);
		}
		

	}

}
