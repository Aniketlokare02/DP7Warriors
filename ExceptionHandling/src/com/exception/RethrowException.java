package com.exception;

public class RethrowException {
	
	static void method1() {
		
		try {
			String s=null;
			System.out.println(s.length());
		}
		catch (NullPointerException e) {
			System.out.println("In Catch Block Of Method1.");
			throw e;
		}
	}

	public static void main(String[] args) {
		
		try {
			method1();
		}
		catch (NullPointerException e) {
			System.out.println("In Main"+e);
		}

	}

}
