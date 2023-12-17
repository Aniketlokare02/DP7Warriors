package com.factoryPattern;

public abstract class Employee {
	
	String name;
	float salary;
	int noOfHours;
	
	Employee(){
		
	}
	
	Employee(String name){
		this.name=name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	abstract void workingHours();
	
	abstract void paySalary();

}
