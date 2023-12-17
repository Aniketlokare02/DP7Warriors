package com.arrayContainment;

public class Employee {
	
	private int eId;
	private String eName;
	private float salary;
	private DepartMent departMent;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int eId, String eName, float salary, DepartMent departMent) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.salary = salary;
		this.departMent = departMent;
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

	public DepartMent getDepartMent() {
		return departMent;
	}

	public void setDepartMent(DepartMent departMent) {
		this.departMent = departMent;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", salary=" + salary + ", departMent=" + departMent + "]";
	}
	
}
