package com.classAndObjects;

public class Car {
	
	int carId;
	String brand;
	String carName;
	double price;
	
	void detailsOfCar() {
		System.out.println("Car Id:"+carId);
		System.out.println("Car Brand:"+brand);
		System.out.println("Car Name:"+carName);
		System.out.println("Car Price:"+price);
	}

	public static void main(String[] args) {
		
		Car c1=new Car();
		c1.carId=101;
		c1.brand="Toyota";
		c1.carName="Innova";
		c1.price=1800000;
		
		Car c2=new Car();
		c2.carId=102;
		c2.brand="Mahindra";
		c2.carName="Thar";
		c2.price=2000000;
		
		c1.detailsOfCar();
		System.out.println("-------------------");
		c2.detailsOfCar();

	}

}
