package com.inheritance;

class Father{
	
	int flat=4;
	void show() {
		System.out.println("Father Has "+flat+" Flats.");
	}
	
}

class Son extends Father{
	
	String name="Son";
	void display() {
		System.out.println(name+" got "+flat+" Flats.");
	}
}

public class Show {

	public static void main(String[] args) {
		
		Son s=new Son();
		s.show();
		s.display();
	}
	
}
