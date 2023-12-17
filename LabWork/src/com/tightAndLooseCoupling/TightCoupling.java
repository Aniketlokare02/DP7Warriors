package com.tightAndLooseCoupling;

abstract class Car{
	
	String bName;
	int price;
	
	Car(String bName, int price){
		this.bName=bName;
		this.price=price;
	}

	@Override
	public String toString() {
		return "Car [bName=" + bName + ", price=" + price + "]";
	}
	
}

class Mahindra extends Car{

	Mahindra() {
		super("Mahindra", 2000000);
	}
	
}

class Toyota extends Car{

	Toyota() {
		super("Toyota", 2500000);
	}
	
}

public class TightCoupling {

	public static void main(String[] args) {
		
		Car c;
		c=new Mahindra();
		System.out.println(c);
		
		c=new Toyota();
		System.out.println(c);

	}

}
