package com.constructorChaining;

//Calling one constructor from another constructor with respect to current object
//done through this().. within the same class
class Demo{
	
	int a;
	int b;
	String name;
	
//	Demo(){
//		a=10;
//		b=20;
//		name="Unknown";
//	}
//	
//	Demo(int a, int b){
//		this.a=a;
//		this.b=b;
//		name="Unknown";
//	}
	
	Demo(){
		this(10,20); //Alwaays has to first statement
		System.out.println("Default constructor");
	}
	
	Demo(int a, int b){
		System.out.println("Parameterized constructor1");
		this.a=a;
		this.b=b;
		this.name="Unknown";
	}
	
	Demo(int a, int b, String name){
		System.out.println("Parameterized constructor2");
		this.a=a;
		this.b=b;
		this.name=name;
	}

	@Override
	public String toString() {
		return "a=" + a + ", b=" + b + ", name=" + name;
	}
	
	
}

public class ConstructorChaining {

	public static void main(String[] args) {
		
		System.out.println("-------------------------");
		Demo d1=new Demo();
		System.out.println(d1);
		
		System.out.println("-------------------------");
		Demo d2=new Demo(30, 40);
		System.out.println(d2);
		
		System.out.println("-------------------------");
		Demo d3=new Demo(100, 200, "Aniket");
		System.out.println(d3);

		//uesd to assign the task that has to be done every time
	}

}
