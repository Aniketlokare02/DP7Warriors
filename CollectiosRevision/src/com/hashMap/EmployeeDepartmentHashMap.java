package com.hashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EmployeeDepartmentHashMap {
	
	public static void createMap(HashMap<Employee, Department> hm) {
		
		HashMap<Department, ArrayList<Employee>> h1=new HashMap<>();
		
		ArrayList<Employee> emp;
		
		for(Map.Entry<Employee, Department> e : hm.entrySet()) {
			Department d=e.getValue();
			if(h1.containsKey(d)) {
				emp=h1.get(d);
				
			}
			else {
				emp=new ArrayList<>();
			}
			emp.add(e.getKey());
			h1.put(d, emp);
		}
		
		for(Map.Entry<Department, ArrayList<Employee>> e : h1.entrySet()) {
			System.out.println(e.getKey());
			System.out.println("--------");
			for(Employee ep : e.getValue()) {
				System.out.println(ep);
			}
			System.out.println("---------------------------------");
		}
	}
	
	public static void createCountMap(HashMap<Employee, Department> hm) {
		
		HashMap<Department, Integer> h1=new HashMap<>();
		
		for(Map.Entry<Employee, Department> e : hm.entrySet()) {
			Department d=e.getValue();
			if(h1.containsKey(d)) {
				h1.put(d, h1.get(d)+1);
			}
			else {
				h1.put(d, 1);
			}
		}
		
		for(Map.Entry<Department, Integer> e : h1.entrySet()) {
			System.out.println(e.getKey()+"-->"+e.getValue());
		}
	}

	public static void main(String[] args) {
		
		Department d1=new Department(201, "JavaDeveloper");
		Department d2=new Department(202, "FrontEndDeveloper");
		
		HashMap<Employee, Department> hm=new HashMap<>();
		hm.put(new Employee(101, "Aniket", 15000f), d1);
		hm.put(new Employee(102, "Hrishi", 25000f), d2);
		hm.put(new Employee(103, "Suraj", 20000f), d1);
		hm.put(new Employee(104, "Pralay", 35000f), d2);
		
		for(Map.Entry<Employee, Department> e : hm.entrySet()) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("--------------------------");
		}
		System.out.println("---------------------------------------------");
		
		Set<Employee> key=hm.keySet();
		for(Employee k : key) {
			System.out.println(k);
			System.out.println(hm.get(k));
			System.out.println("--------------------");
		}
		System.out.println("---------------------------------------------");
		
		Set<Entry<Employee, Department>> entries=hm.entrySet();
		for(Entry e : entries) {
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			System.out.println("--------------------");
		}
		System.out.println("---------------------------------------------");
		createMap(hm);
		System.out.println("---------------------------------------------");
		createCountMap(hm);

	}

}
