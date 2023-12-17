package com.crudOfArray;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
		
		int choice;
		IEmployee bd=new EmployeeImplementation();
		
		do
		{
			System.out.println("1 Add Book");
			System.out.println("2 Update Book");
			System.out.println("3 Show Book Information");
			System.out.println("4 Delete Book");
			System.out.println("5 Search Book by Id");
			System.out.println("6 Exit");
			
			System.out.println("--------");
			
			System.out.println("Enter ur choice");
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:
				bd.addEmployee();
				break;
			case 2:
				bd.updateEmployee();
				break;
			case 3:
				bd.showEmployee();
				break;
				
			case 4:
				bd.deleteEmployee();
				break;
			case 5:
				bd.searchEmployee();
				break;
			
			case 6:
				System.exit(0);
			}
			
		}while(true);

	}

}
