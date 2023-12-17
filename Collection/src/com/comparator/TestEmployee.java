package com.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class TestEmployee {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> elist= new ArrayList<>();
		
		elist.add(new Employee(1,"Shivam",89000));
		elist.add(new Employee(7,"Gauri",89000));
		elist.add(new Employee(3,"Vishal",90000));
		elist.add(new Employee(6,"Aniket",99000));
		
		for(Employee e: elist)
		{
			System.out.println(e);
		}
		
		//Collections.sort(elist, new SortBySalary());
		
		Collections.sort(elist, new SortBySalaryName());
	
		System.out.println("-------------------------------------");
		for(Employee e: elist)
		{
			System.out.println(e);
		}
		
		
	}

}
