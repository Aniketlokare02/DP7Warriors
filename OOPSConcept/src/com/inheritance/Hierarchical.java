package com.inheritance;

class Student{
	
	private int sId;
	private String sName;
	
	Student(){
		
	}

	public Student(int sId, String sName) {
		this.sId = sId;
		this.sName = sName;
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

	@Override
	public String toString() {
		return "Student Details\nId=" + sId + ", Name=" + sName;
	}
	
}

class SchoolStudent extends Student{
	private String scName;
	private float fees;
	
	SchoolStudent(){
		super();
	}

	public SchoolStudent(int sId, String sName, String scName, float fees) {
		super(sId, sName);
		this.scName=scName;
		this.fees=fees;
	}

	public String getScName() {
		return scName;
	}
	public void setScName(String scName) {
		this.scName = scName;
	}

	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return super.toString()+"\nSchool Details\nscName=" + scName + ", fees=" + fees;
	}
	
}

class CollegeStudent extends Student{
	
	private String university;
	private float fees;
	private int sem;
	
	CollegeStudent(){
		super();
	}

	public CollegeStudent(int sId, String sName, String university, float fees, int sem) {
		super(sId, sName);
		this.university=university;
		this.fees=fees;
		this.sem=sem;
	}

	@Override
	public String toString() {
		return super.toString()+"\nCollege Details\nUniversity=" + university + ", Fees=" + fees + ", Sem=" + sem;
	}
	
}

public class Hierarchical {

	public static void main(String[] args) {
		
		SchoolStudent sc=new SchoolStudent(101, "Aniket", "SVS", 10000f);
		
		CollegeStudent collegeStudent=new CollegeStudent(201, "Hrishikesh", "VTU", 80000f, 5);
		
		System.out.println(sc);
		System.out.println();
		System.out.println(collegeStudent);

	}

}
