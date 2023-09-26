package com.assignments;

public class StaticAndInstance {
	
	int a;
	static int b;

	void instanceMethod() {
		b=5;
		a=3;
	}
	
	static void staticMethod() {
		b=5;
		//a=3;
	}
	
	public static void main(String[] args) {
		
		StaticAndInstance a=new StaticAndInstance();
		System.out.println(a.a);
		System.out.println(b);

	}

}
