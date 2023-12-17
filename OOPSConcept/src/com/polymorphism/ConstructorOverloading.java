package com.polymorphism;

// constructor Overloading
class Room{
	
	int len;
	int br;
	
	Room(){
		System.out.println("Default");
		len=5;
		br=5;
	}
	
	Room(int len, int br){
		System.out.println("Rectangle");
		this.len=len;
		this.br=br;
	}
	
	Room(int len){
		System.out.println("Square");
		this.len=len;
		this.br=len;
	}
	
	void area() {
		System.out.println("Area Of Room : "+(len*br));
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		
		Room r1=new Room();
		r1.area();
		
		Room r2=new Room(10);
		r2.area();
		
		Room r3=new Room(5, 6);
		r3.area();

	}

}
