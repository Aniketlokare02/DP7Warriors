package com.polymorphism;

class Calci{
	
	void calculate(int num) {
		System.out.println("Square of Number:"+(num*num));
	}
	
	void calculate(int num1, int num2) {
		System.out.println("Addition of Numbers:"+(num1+num2));
	}
	
	void calculate(float num1, float num2) {
		System.out.println("Multiplication of Numbers:"+(num1*num2));
	}
}

public class Calculater {

	public static void main(String[] args) {
		
		Calci c1=new Calci();
		c1.calculate(10);
		
		Calci c2=new Calci();
		c2.calculate(10, 20);
		
		Calci c3=new Calci();
		c3.calculate(5f, 4f);

	}

}
