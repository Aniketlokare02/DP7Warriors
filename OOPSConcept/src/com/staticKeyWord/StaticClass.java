package com.staticKeyWord;

public class StaticClass {
	
	int x=10;
	static int y=20;
	
	// we can use static and instance variables in instance methods
	void instanceMethod() {
		System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	
	// we cannot use instance variables in static methods
	// no need to create object
	static void staticMethod() {
		//System.out.println("x:"+x);
		System.out.println("y:"+y);
	}
	
	public static void main(String[] args) {
		
		StaticClass s1=new StaticClass();
		s1.instanceMethod();
		
		staticMethod();

	}

}
