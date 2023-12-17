package com.factoryMethodPattern;

import java.util.Arrays;

public class PythonDeveloper extends Developer{
	
	public PythonDeveloper() {
		
	}
	
	public PythonDeveloper(String name) {
		super(name);
	}

	@Override
	public void salaryPaid() {
		salary=75000f;
		
	}

	@Override
	public void skillSet() {
		
		String[] skills= {"Python", "MONGODB", "PANDAS"};
		System.out.println(Arrays.toString(skills));
		
	}

}
