package com.arrayOfObject;

import java.util.Arrays;

public class Student1 {
	
	private int id;
	private String name;
	private float[] marks;
	
	Student1(){
		marks=new float[5];
	}
	
	Student1(int id, String name, float[] marks) {
		this();
		this.id=id;
		this.name=name;
		this.marks=marks;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float[] getMarks() {
		return marks;
	}
	public void setMarks(float[] marks) {
		this.marks=marks;
	}
	
	@Override
	public String toString() {
		return "Id:"+id+" Name:"+name+" Marks:"+Arrays.toString(marks);
	}

}
