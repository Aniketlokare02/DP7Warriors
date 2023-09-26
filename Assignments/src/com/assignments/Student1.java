package com.assignments;

public class Student1 {
	
	private int rollNo;
	private String sName;
	private DepartMent departMent;
	
	Student1(){
		
	}
	
	Student1(int rollNo, String sName, DepartMent departMent){
		this.rollNo=rollNo;
		this.sName=sName;
		this.departMent=departMent;
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}

	public DepartMent getDepartMent() {
		return departMent;
	}
	public void setDepartMent(DepartMent departMent) {
		this.departMent = departMent;
	}

	@Override
	public String toString() {
		return "Student Details \nRollNo=" + rollNo + "\nName=" + sName + "\n" + departMent;
	}
	
}
