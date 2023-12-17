package com.oopsConcept;

public class Employee {
	
	private int empId;
	private String empName;
	private String designation;
	double salary;
	
	Employee(int empId, String empName, String designation, double salary){
		this.empId=empId;
		this.empName=empName;
		this.designation=designation;
		this.salary=salary;
	}
	
	double getSalary() {
		return salary;
	}
	
	void print() {
		System.out.println("Employee Id:"+empId);
		System.out.println("Employee Name:"+empName);
		System.out.println("Employee Designation:"+designation);
		System.out.println("Employee Salary:"+salary);
	}

}
