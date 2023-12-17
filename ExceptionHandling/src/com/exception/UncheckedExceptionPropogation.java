package com.exception;

public class UncheckedExceptionPropogation {
	
	void method1() {
		int data=50/0;
	}
	
	void method2() {
		method1();
	}
	
	void method3() {
		try {
			method2();
		}
		catch (Exception e) {
			System.out.println("In Method:3"+e);
		}
	}

	public static void main(String[] args) {
		
		UncheckedExceptionPropogation obj=new UncheckedExceptionPropogation();
		obj.method3();

	}

}
