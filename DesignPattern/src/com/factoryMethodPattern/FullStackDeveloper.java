package com.factoryMethodPattern;

import java.util.Arrays;

public class FullStackDeveloper extends Developer{
	
	public FullStackDeveloper() {
		
	}
	
	public FullStackDeveloper(String name) {
		super(name);
	}

	@Override
	public void salaryPaid() {
		salary=1050000f;
		
	}

	@Override
	public void skillSet() {
		
		String[] skills= {"Java", "MySQL", "JDBC", "Hibernate", "ReactJs", "HTML", "CSS", "Angular"};
		System.out.println(Arrays.toString(skills));
		
	}

}
