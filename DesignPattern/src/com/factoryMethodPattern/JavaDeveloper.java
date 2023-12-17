package com.factoryMethodPattern;

import java.util.Arrays;

public class JavaDeveloper extends Developer{
	
	public JavaDeveloper() {
		
	}
	
	public JavaDeveloper(String name) {
		super(name);
	}

	@Override
	public void salaryPaid() {
		salary=50000f;
		
	}

	@Override
	public void skillSet() {
		
		String[] skills= {"Java", "MySQL", "JDBC", "Hibernate"};
		System.out.println(Arrays.toString(skills));
		
	}

}
