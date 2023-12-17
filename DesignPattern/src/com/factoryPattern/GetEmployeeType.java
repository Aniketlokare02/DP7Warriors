package com.factoryPattern;

public class GetEmployeeType {
	
	public Employee getEmployee(String type) {
		if(type==null)
			return null;
		else if(type.equalsIgnoreCase("FullTime"))
			return new FullTime();
		else if(type.equalsIgnoreCase("PartTime"))
			return new PartTime();
		return null;
	}

}
