package com.polymorphism;

class Shape1{
	
	static void area(int side) {
		System.out.println("Area of Square is : "+(side*side));
	}
	
	static void area(int len, int br) {
		System.out.println("Area of Rectangle is : "+(len*br));
	}
	
	static void area(float radius) {
		System.out.println("Area of Circle is : "+(3.14*radius*radius));
	}
}

public class StaticMethodOverLoading {

	public static void main(String[] args) {
		
		Shape1 square=new Shape1();
		square.area(10);
		
		Shape1 rectangle=new Shape1();
		rectangle.area(5, 6);
		
		Shape1 circle=new Shape1();
		circle.area(5.6f);

	}

}
