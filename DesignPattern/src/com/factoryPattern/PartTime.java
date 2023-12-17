package com.factoryPattern;

public class PartTime extends Employee{

	public PartTime() {
	
	}

	public PartTime(String name) {
		super(name);
	}

	@Override
	void workingHours() {
		noOfHours=10;
	}
	
	@Override
	void paySalary() {
		salary=noOfHours*500;
	}

}
