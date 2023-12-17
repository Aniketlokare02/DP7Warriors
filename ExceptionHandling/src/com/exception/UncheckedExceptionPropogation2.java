package com.exception;

public class UncheckedExceptionPropogation2 {
	
	void method1() {
		int data=50/0;
	}
	
	void method2() {
		method1();
	}
	
	void method3() {
		
			method2();
	}

	public static void main(String[] args) {
		
		UncheckedExceptionPropogation2 obj=new UncheckedExceptionPropogation2();
		try {
		obj.method3();
		}
		catch (Exception e) {
			System.out.println("In Main:"+e);
		}

	}

}
