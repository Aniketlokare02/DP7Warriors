package com.containment;

public class Student {
	
	private int sId;
	private String sName;
	private Course course;
	
	Student(){
		
	}
	
	Student(int sId, String sName, Course course){
		this.sId=sId;
		this.sName=sName;
		this.course=course;
	}

	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student Details \nId=" + sId + ", \nName=" + sName + ", \ncourse=" + course;
	}
	
}
