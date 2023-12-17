package com.constructorChaining;

class Test{
	int a;
	int b;
	String name;
	
	Test(){
		System.out.println("Default constructor");
		this.a=10;
		this.b=20;
		this.name="Unknown";
		System.out.println("Task has to be done everytime");
	}
	
	Test(int a, int b){
		this();
		System.out.println("Param constructor1");
		this.a=a;
		this.b=b;
		this.name=name;
	}
	
	Test(int a, int b, String name){
		this();
		System.out.println("Param constructor2");
		this.a=a;
		this.b=b;
		this.name=name;
	}

	@Override
	public String toString() {
		return "a=" + a + ", b=" + b + ", name=" + name;
	}
	
	
}

public class ConstructorChaining2 {

	public static void main(String[] args) {
		
		System.out.println("--------------------------");
		Test t1=new Test();
		System.out.println(t1);
		
		System.out.println("--------------------------");
		Test t2=new Test(30,40);
		System.out.println(t2);
		
		System.out.println("--------------------------");
		Test t3=new Test(100, 200, "Aniket");
		System.out.println(t3);

	}

}
