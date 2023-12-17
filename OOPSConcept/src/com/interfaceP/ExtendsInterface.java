package com.interfaceP;

interface Movable{
	
	void move();
}

interface Printable extends Movable{
	
	void printMe(String name);
}

class Car implements Printable{

	@Override
	public void move() {
		System.out.println("Car is Move With The Speed of : 100km/hr");
		
	}

	@Override
	public void printMe(String name) {
		System.out.println("My Car Name is : "+name);
		
	}
	
}

public class ExtendsInterface {

	public static void main(String[] args) {
		
		Car c=new Car();
		c.move();
		c.printMe("Thar");
		
		System.out.println("---------------------------");
		Movable m;
		m=new Car();
		m.move();
		
		System.out.println("---------------------------");
		Printable p;
		p=new Car();
		p.move();
		p.printMe("Innova");

	}

}
