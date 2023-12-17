package com.methodOvering;

import java.io.IOException;

class Parent{
	
	int data=50;
	
	//not throwing any exception
	void print() {
		System.out.println(data);
	}
}

//child class : overriding: can throw unchecked exception

class Child extends Parent{
	
	int val=0;
	
	@Override
	void print() throws ArithmeticException{//IOException
		
		if(val==0)
			throw new ArithmeticException();
		System.out.println(data/val);
		//throw new IOException();
	}
}

public class CheckedOverriding {

	public static void main(String[] args) {
		

	}

}
