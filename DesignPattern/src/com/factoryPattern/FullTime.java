package com.factoryPattern;

public class FullTime extends Employee{
	
	public FullTime() {

	}

	public FullTime(String name) {
		super(name);
	}

	@Override
	void workingHours() {
		noOfHours=8;
	}
	
	@Override
	void paySalary() {
		salary=noOfHours*1000;
	}

}
