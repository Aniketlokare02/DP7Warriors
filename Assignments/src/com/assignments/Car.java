package com.assignments;

public class Car {
	
	static int totalCarSold;
	String model="2023";

	public static void main(String[] args) {
		
		Car.totalCarSold=5;
		System.out.println(totalCarSold);
		System.out.println("-----");
		
		Car car=new Car();
		car.totalCarSold=10;
		Car car2=new Car();
		System.out.println(car2.model+"  "+totalCarSold);
		System.out.println("-----");

	}

}
