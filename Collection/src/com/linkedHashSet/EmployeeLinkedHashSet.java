package com.linkedHashSet;

import java.util.LinkedHashSet;

public class EmployeeLinkedHashSet {

	public static void main(String[] args) {
		
		LinkedHashSet<Employee> emp=new LinkedHashSet<>();
		emp.add(new Employee(101, "Aniket", 10000f));
		emp.add(new Employee(102, "Hrishikesh", 9000f));
		emp.add(new Employee(103, "Suraj", 11000f));
		emp.add(new Employee(101, "Aniket", 10000f));
		
		// override equals and hashcode 
		for(Employee e : emp) {
			System.out.println(e);
		}

	}

}
