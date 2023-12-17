package com.staticKeyWord;

class Student{
	
	private int id;
	String name;
	float marks;
	static String scName; // first load
	static int count=0;
	
	{
		count++;
	}
	
	Student(){
		scName="SVS";
	}
	
	Student(int id, String name, float marks){
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

	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}

	public static String getScName() {
		return scName;
	}
	public static void setScName(String scName) {
		Student.scName = scName;
	}

	@Override
	public String toString() {
		return "Id=" + id + ", Name=" + name + ", Marks=" + marks;
	}
	
}

public class StudentTest {

	public static void main(String[] args) {
		
		Student s1=new Student();
		System.out.println(s1.scName);
		
		Student s2=new Student();
		System.out.println(s2.scName);
		System.out.println(Student.count);
		
	}

}
