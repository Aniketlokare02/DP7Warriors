package com.interfaceAdvance;

interface Calculation{
	
	void area();
	
	//Java8 Version
	//to make interface mutable and provide backward compatability
	default void volume() {
		System.out.println("In Volume Method.");
		show();
	}
	
	//Java8 Version
	//to provide common implementation
	//belongs to interface
	static void info() {
		System.out.println("Geometry Shapes");
		display();
	}
	
	//to make confidential information which cannot be accessed directly
	//any sensitive code of agreement
	//Java 9 private:
	//If this private is instance : accessed in default method
	//private method : static : accessed in static method
	private void show() {
		System.out.println("Made By:Aniket");
	}
	
	private static void display() {
		System.out.println("Pan No:APGPL0029B");
	}
}

class Square implements Calculation{
	
	int side;

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Square(int side) {
		super();
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("Area Of Square is:"+(side*side));
	}
	
}

class Cube implements Calculation{
	
	int side;

	public Cube() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cube(int side) {
		super();
		this.side = side;
	}

	@Override
	public void area() {
		System.out.println("Area of Cube is:"+(6*side*side));
	}
	
	public void volume() {
		System.out.println("Volume of Cube is:"+(side*side*side));
	}
}

public class DefaultMethodInInteface {

	public static void main(String[] args) {
		
		Calculation c;
		
		c=new Square(10);
		c.area();
		c.volume();
		
		c=new Cube(5);
		c.area();
		c.volume();
		
		Calculation.info();

	}

}
