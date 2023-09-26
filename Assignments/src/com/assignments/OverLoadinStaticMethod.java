package com.assignments;

public class OverLoadinStaticMethod {
	
	static void print(int a) {
		System.out.println(a);
	}
	
	static void print(int a, double b) {
		System.out.println(a+"  "+b);
	}
	
	void print(int a, long b) {
		System.out.println(a+"  "+b);
	}

	public static void main(String[] args) {
		
		print(10);
		System.out.println("----");
		print(10,5.0);
		System.out.println("---");
		
		OverLoadinStaticMethod o=new OverLoadinStaticMethod();
		o.print(5, 24);

	}

}
