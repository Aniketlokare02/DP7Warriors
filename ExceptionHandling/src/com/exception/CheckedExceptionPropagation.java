package com.exception;

public class CheckedExceptionPropagation {
	
	void method1() throws ClassNotFoundException {
		throw new ClassNotFoundException("Class Error");
	}
	
	void method2() throws ClassNotFoundException {
		method1();
	}
	
	void method3() throws ClassNotFoundException {
		method2();
	}

	public static void main(String[] args) throws ClassNotFoundException {
		
		CheckedExceptionPropagation obj=new CheckedExceptionPropagation();
		obj.method3();

	}

}
