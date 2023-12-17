package com.methodOverriding;

class Person{
	
	protected void display() {
		System.out.println("Person is Working.");
	}  
}

class Employee extends Person{
	
	@Override
	public void display() {
		super.display();
		System.out.println("Employee is Working.");
	}
}

public class Show {

	public static void main(String[] args) {
		Person p1=new Employee();
		p1.display();

	}

}
