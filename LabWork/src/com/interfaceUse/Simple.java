package com.interfaceUse;

interface A{
	
	void show();
}
  
interface B{
	
	void show();
}

public class Simple implements A, B{
	
	@Override
	public void show() {
		System.out.println("In Show Method.");
		
	}

	public static void main(String[] args) {
		A a=new Simple();
		a.show();
		
		B b=new Simple();
		b.show();

	}

	
}
