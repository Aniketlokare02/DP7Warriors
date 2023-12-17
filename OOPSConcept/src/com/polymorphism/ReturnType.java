package com.polymorphism;

class Shape2{
	
	int area(int side) {
		return (side*side);
	}
	
	int area(int len, int br) {
		return (len*br);
	}
	
	float area(float radius) {
		return (3.14f*radius*radius);
	}
}

public class ReturnType {

	public static void main(String[] args) {
		
		Shape2 square=new Shape2();
		System.out.println("Area of Square : "+square.area(10));
		
		Shape2 rectangle=new Shape2();
		System.out.println("Area of Rectangle : "+rectangle.area(5, 6));
		
		Shape2 circle=new Shape2();
		System.out.println("Area of Circle : "+circle.area(5.6f));

	}

}
