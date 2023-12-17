package com.accessSpecifierAndModifier;

public class AccessSpecifierAndModifier {
	
	private int a;
	int b;
	protected int c;
	public int d;
	
	private void show() {
		System.out.println("Hello..");
	}
	
	void display() {
		System.out.println("Hi..");
	}
	
	protected void acting() {
		System.out.println("Welcome..");
	}
	
	public void test() {
		System.out.println("Bye..");
	}

	public static void main(String[] args) {
		
		AccessSpecifierAndModifier a=new AccessSpecifierAndModifier();
		
		a.a=10;
		a.b=20;
		a.c=30;
		a.d=40;
		
		a.show();
		a.display();
		a.acting();
		a.test();
	}

}
