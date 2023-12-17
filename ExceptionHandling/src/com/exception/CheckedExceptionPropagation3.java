package com.exception;

public class CheckedExceptionPropagation3 {
	
	void method1() throws ClassNotFoundException {
		throw new ClassNotFoundException("Class Error");
	}
	
	void method2() throws ClassNotFoundException {
		method1();
	}
	
	void method3() throws ClassNotFoundException {
		method2();
	}

	public static void main(String[] args)  {
		
		CheckedExceptionPropagation3 obj=new CheckedExceptionPropagation3();
		try {
		obj.method3();
		}
		catch (Exception e) {
			System.out.println("In Main:"+e);
		}

	}

}
