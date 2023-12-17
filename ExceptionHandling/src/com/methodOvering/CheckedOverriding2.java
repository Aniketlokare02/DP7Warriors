package com.methodOvering;

import java.io.IOException;

class Parent3{
	
	int data=50;
	
	//throw checked exception
	void print() throws IOException{
		System.out.println(data);
	}
}

// child class : overriding: can throw unchecked exception                         
// it can throw :  same checked exception, sub type
                     // not super type

class Child3 extends Parent3{
	
	int val=0;
	
	@Override
	void print() throws ArithmeticException, IOException{
		
		if(val==0)
			throw new ArithmeticException();
		System.out.println(data/val);
		//throw new IOException();
	}
}

public class CheckedOverriding2 {

	public static void main(String[] args) {
		

	}

}
