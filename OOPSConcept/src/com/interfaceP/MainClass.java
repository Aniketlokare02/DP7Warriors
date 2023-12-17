package com.interfaceP;

interface Payment{
	
	void pay(int amount);
	
}

class Student implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("Student Need To Pay Fees of:"+amount);
	}
	
}

class Celebrity1 implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("Celebrity Need To Pay Tax of:"+amount);	
	}
	
}

class Employee1 implements Payment{

	@Override
	public void pay(int amount) {
		System.out.println("Employee Need To Pay Insurance of:"+amount);	
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
		Payment p;
		
		p=new Student();
		p.pay(10000);
		System.out.println("---------------------------------------");
		
		p=new Celebrity1();
		p.pay(100000);
		System.out.println("---------------------------------------");
		
		p=new Employee1();
		p.pay(20000);

	}

}
