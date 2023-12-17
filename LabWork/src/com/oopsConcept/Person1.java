package com.oopsConcept;

public class Person1 {
	
	void activity(String name, String role) {
		System.out.println(name+" is in Home.");
		System.out.println(name+" is a "+role+".");
	}
	
	void activity(int salary) {
		System.out.println("Person is Calculating his Anual Salary.");
		System.out.println("Person's Anual Salary is "+(salary*12));
	}
	
	String activity(String activity) {
		return "Person is "+activity+" with his friends.";
	}

	public static void main(String[] args) {
		
		Person1 p1=new Person1();
		p1.activity(20000);
		System.out.println("---------------------------------------");
		Person1 p2=new Person1();
		System.out.println(p2.activity("chilling"));
		System.out.println("------------------------------------");
		Person1 p3=new Person1();
		p3.activity("Suresh", "Father");
		

	}

}
