package com.polymorphism;

class Shape{
	
	void area(int side) {
		System.out.println("Area of Square is:"+(side*side));
	}
	
	void area(int len, int br) {
		System.out.println("Area of Rectangle is:"+(len*br));
	}
	
	void area(float radius) {
		System.out.println("Area of Circle is:"+(3.14*radius*radius));
	}
}

public class PolyDemo {

	public static void main(String[] args) {
		
		Shape square=new Shape();
		square.area(10);
		
		Shape rectangle=new Shape();
		rectangle.area(5, 6);
		
		Shape circle=new Shape();
		circle.area(5.6f);

	}

}
