package com.methodOverriding;

class Person{
	
	void display() {
		System.out.println("I am a Person.");
	}
}

class Employee extends Person{
	
	@Override
	void display() {
		System.out.println("I am a Employee.");
	}
}

class Celebrity extends Person{
	
	@Override
	void display() {
		System.out.println("I am a Celebrity.");
	}
}

public class MethodOverrinding {

	public static void main(String[] args) {
		
		Person p=new Person();
		p.display();
		
		Employee e=new Employee();
		e.display();
		
		Celebrity c=new Celebrity();
		c.display();

	}

}
