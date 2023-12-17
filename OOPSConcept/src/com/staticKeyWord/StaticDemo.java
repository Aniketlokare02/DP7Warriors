package com.staticKeyWord;

public class StaticDemo {
	
	int x=10;
	static int y=10;
	
	void show() {
		x++;
		System.out.println("x:"+x);
		y++;
		System.out.println("y:"+y);
		System.out.println("----");
	}
	
	void display() {
		int y=20;
		System.out.println("y:"+y); //Local variable
		System.out.println("y:"+StaticDemo.y); //Static variable
	}

	public static void main(String[] args) {
		
		StaticDemo s1=new StaticDemo();
		s1.show();
		
		StaticDemo s2=new StaticDemo();
		s2.display();

	}

}
