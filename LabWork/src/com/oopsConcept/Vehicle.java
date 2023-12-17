package com.oopsConcept;

public class Vehicle {
	
	int id;
	String name;
	double price;
	
	Vehicle(){
		this(0, null, 0);
	}
	Vehicle(int id, String name, double price){
		this.id=id;
		this.name=name;
		this.price=price;
		//System.out.println(this);
	}
	
	void show() {
		display();
		System.out.println("Vehicle Id:"+this.id);
		System.out.println("Vehicle Name:"+this.name);
		System.out.println("Vehicle Price:"+this.price);
		System.out.println("-----------------------");
	}
	
	void display() {
		System.out.println("Details Of Vehicle.");
	}

	public static void main(String[] args) {
		Vehicle v1=new Vehicle(101, "Thar", 1800000);
		Vehicle v2=new Vehicle(102, "Innova", 2000000);
		Vehicle v3=new Vehicle();
		
		v1.show();
		v2.show();
		v3.show();
	}
}
