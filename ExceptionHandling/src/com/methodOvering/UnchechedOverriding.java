package com.methodOvering;

import java.io.IOException;

class Parent1{
	
	int data=50;
	
	//throws unchecked exception
	void print() throws ArithmeticException{
		System.out.println(data);
	}
}

//child class : overriding: can throw unchecked exception
//                         sub class of unchecked exception, any other exception
// it cannot throw :  checked exception
class Child1 extends Parent1{
	
	int val=0;
	
	@Override
	void print() throws RuntimeException, ArrayIndexOutOfBoundsException{
		
		if(val==0)
			throw new RuntimeException();
		System.out.println(data/val);
		//throw new IOException();
	}
}

public class UnchechedOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
