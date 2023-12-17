package com.arrayOfObject;

//POJO - Plain Old Java Object
public class Student {
	
	private int sId;
	private String name;
	private float marks;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int sId, String name, float marks) {
		super();
		this.sId = sId;
		this.name = name;
		this.marks = marks;
	}

	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ", marks=" + marks + "]";
	}

}
