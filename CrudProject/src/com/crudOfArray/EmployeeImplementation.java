package com.crudOfArray;

import java.util.Scanner;

public class EmployeeImplementation implements IEmployee{
	
	Scanner ip=new Scanner(System.in);
	Employee[] emp=new Employee[10];
	int id;
	String name;
	float salary;
	int count=0;
	
	@Override
	public void addEmployee() {
		System.out.println("Add Employee.");

		System.out.println("Enter number of Employees you want to add");
		int a = ip.nextInt();

		for (int i = 0; i < a; i++) {
			System.out.println("Enter Employee Id");
			id = ip.nextInt();
			System.out.println("Enter Employee Name");
			name = ip.next();
			System.out.println("Enter Employee Salary");
			salary = ip.nextFloat();
			
			emp[count] = new Employee(id, name, salary);
			count++;
		}
		System.out.println("Employee Added Sucessfully");

	}
	@Override
	public void updateEmployee() {
		System.out.println("Update Employee");
		  System.out.println("Enter the Employee id you want to Update");
		  int id=ip.nextInt();
		  for(int i=0;i<count;i++)
			{
		         if(id==emp[i].geteId() && emp[i]!=null)
		         {
		        	 System.out.println("Enter Employee name");
		        	 name=ip.next();
		        	 emp[i].seteName(name);
		        	 System.out.println("Enter Employee Salary");
		        	 salary=ip.nextFloat();
		        	 emp[i].setSalary(salary);
		         }
			}
		  System.out.println("Employee Updated Sucessfully");
		
	}
	@Override
	public void showEmployee() {
		for(int i=0;i<count;i++)
		{
			if(emp[i]!=null)
			{
			System.out.println(emp[i]);
			}
			
		}
		
	}
	@Override
	public void deleteEmployee() {
		System.out.println("Delete Employee");
		  System.out.println("Enter the Employee id you want to delete");
		  int id=ip.nextInt();
		  for(int i=0;i<count;i++)
			{
		         if(id==emp[i].geteId())
		         {
		        	 emp[i]=null;
		         }
		         
			}
		  System.out.println("Employee Deleted Sucessfully");
		
	}
	@Override
	public void searchEmployee() {
		System.out.println("Search Book");
		  System.out.println("Enter the book id you want to search");
		  int id=ip.nextInt();
		  int flag=0;
		  int i;
		  for( i=0;i<count;i++)
			{
		         if(id==emp[i].geteId() && emp[i]!=null)
		         {
		        	 flag=1;
		        	 break;
		
	              }

            }
		  if(flag==1)
		  {
			  System.out.println("Given book Available");
			  System.out.println(emp[i]);
		  }
		  else
			  System.out.println("Given Book not available");
		
	}

}
