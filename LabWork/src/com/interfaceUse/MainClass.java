package com.interfaceUse;

interface Car{
	
	default void type() {
		System.out.println("Car is Running.");
	}
}

interface Thar extends Car{
	
	@Override
	default void type() {
		Car.super.type();
		System.out.println("Thar is Running.");
	}
}

interface Innova extends Car{
	
	@Override 
	default void type() {
		System.out.println("Innova is Running.");
	}
}

class CarType implements Thar, Innova{

	@Override
	public void type() {
		//Car.super.type()
		Thar.super.type();
		Innova.super.type();
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
		CarType c=new CarType();
		c.type();

	}

}
