package com.covariantReturnType;

class Employee{
	
	int id;
	String name;
	float salary;
	
	Employee() {
		
	}
	
	Employee(int id, String name, float salary){
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	
	static Employee display() {
		Employee e=new Employee(101, "Aniket", 25000f);
		return e;
	}

	@Override
	public String toString() {
		return "Employee Id=" + id + ", Name=" + name + ", Salary=" + salary;
	}
	
	public static void main(String[] args) {
		
		//Employee e=new Employee();
		System.out.println(Employee.display());
	}
}


