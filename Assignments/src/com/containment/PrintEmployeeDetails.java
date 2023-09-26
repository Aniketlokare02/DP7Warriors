package com.containment;

class Department{
	
	private int dId;
	private String dName;
	
	Department(){
		
	}
	
	Department(int dId, String dName){
		this.dId=dId;
		this.dName=dName;
	}
	
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "\nDepartment Details\nId=" + dId + ", dName=" + dName;
	}
	
}

class MyDate{
	
	private int day;
	private String month;
	private int year;
	
	MyDate() {
		
	}
	
	MyDate(int day, String month, int year){
		this.day=day;
		this.month=month;
		this.year=year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "\nDay=" + day + ", Month=" + month + ", Year=" + year;
	}
	
}

class Employee{
	
	private int eId;
	private String eName;
	private float salary;
	private Department department;
	private MyDate myDate;
	
	Employee(){
		
	}
	
	Employee(int eId, String eName, float salary, Department department, MyDate myDate){
		this.eId=eId;
		this.eName=eName;
		this.salary=salary;
		this.department=department;
		this.myDate=myDate;
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

	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}

	public MyDate getMyDate() {
		return myDate;
	}
	public void setMyDate(MyDate myDate) {
		this.myDate = myDate;
	}

	@Override
	public String toString() {
		return "Employee Details\nId=" + eId + ", Name=" + eName + ", Salary=" + salary +  department
				+ myDate;
	}
	
}

public class PrintEmployeeDetails {

	public static void main(String[] args) {
		
		

	}

}
