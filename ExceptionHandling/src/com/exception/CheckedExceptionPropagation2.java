package com.exception;

public class CheckedExceptionPropagation2 {
	
	void method1() throws ClassNotFoundException {
		throw new ClassNotFoundException("Class Error");
	}
	
	void method2() throws ClassNotFoundException {
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

	public static void main(String[] args)  {
		
		CheckedExceptionPropagation2 obj=new CheckedExceptionPropagation2();
		obj.method3();

	}

}
