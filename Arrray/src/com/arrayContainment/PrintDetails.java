package com.arrayContainment;

public class PrintDetails {
	
	static void countOfEmployee(Employee[] emp, DepartMent[] dept) {
		int count;
		for (DepartMent d : dept) {
			count=0;
			for (Employee e : emp) {
				if(e.getDepartMent().equals(d)) {
					count++;
				}
			}
			System.out.println(d+" :"+count);
		}
	}
	
	static void printDetails(Employee[] emp, DepartMent[] dept) {
		for (DepartMent d : dept) {
			for (Employee e : emp) {
				if (e.getDepartMent().equals(d)) {
					System.out.println(d.getdName() + " : " + e.geteName());
				}
			}

		}
	}

	public static void main(String[] args) {
		
		DepartMent[] dept=new DepartMent[3];
		dept[0]=new DepartMent(101, "Developer");
		dept[1]=new DepartMent(102, "Tester");
		dept[2]=new DepartMent(102, "Analyt");
		
		Employee[] emp=new Employee[6];
		emp[0]=new Employee(1, "Aniket", 25000, dept[0]);
		emp[1]=new Employee(2, "Hrishi", 35000, dept[1]);
		emp[2]=new Employee(3, "Suraj", 45000, dept[2]);
		emp[3]=new Employee(4, "Pralay", 20000, dept[0]);
		emp[4]=new Employee(5, "Shivam", 30000, dept[1]);
		emp[5]=new Employee(6, "Vishal", 40000, dept[2]);
		
		countOfEmployee(emp, dept);
		System.out.println("--------------------------------");
		printDetails(emp, dept);

	}

}
