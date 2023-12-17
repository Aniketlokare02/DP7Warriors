package com.oopsConcept;

public class EmployeeSal {

	public static void main(String[] args) {
		
		Employee e1=new Employee(101, "Aniket", "JavaDeveloper", 25000);
		
		e1.print();
		System.out.println("----------------------------");
		
		double sal=e1.getSalary();
		sal=sal+(sal*0.1);
		e1.salary=sal;
		e1.print();

	}

}
