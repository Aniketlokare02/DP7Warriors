package com.arrayOfObject;

import java.util.Scanner;

class Employee{
	
	private int eId;
	private String eName;
	private float salary;
	
	public Employee() {
		super();
	}
	
	public Employee(int eId, String eName, float salary) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
	}
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee Id=" + eId + ", Name=" + eName + ", salary=" + salary;
	}
	
}

public class EmployeeDetails {
	
	static void maxSalary(Employee[] arr) {
		
		Employee e=new Employee();
		float maxSal=Integer.MIN_VALUE;
		for (Employee em : arr) {
			if(em.getSalary()>maxSal) {
				maxSal=em.getSalary();
				e=em;
			}
		}
		System.out.println(e);
	}
	
	static void sortBySalary(Employee[] arr) {
		
		Employee em=new Employee();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].getSalary()<arr[j].getSalary()) {
					em=arr[i];
					arr[i]=arr[j];
					arr[j]=em;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		Employee[] arr=new Employee[3];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=new Employee();
			
			System.out.print("Enter Id:");
			arr[i].seteId(ip.nextInt());
			
			System.out.print("Enter Name:");
			arr[i].seteName(ip.next());
			
			System.out.print("Enter Salary:");
			arr[i].setSalary(ip.nextFloat());
		}
		
		System.out.println("---------------------------");
		
		for (Employee e : arr) {
			System.out.println(e);
		}
		
		System.out.println("---------------------------");
		System.out.println("Max Salary Employee.");
		maxSalary(arr);
		
		System.out.println("---------------------------");
		System.out.println("Salary Descending.");
		sortBySalary(arr);
		for (Employee e : arr) {
			System.out.println(e);
		}
	}

}
