package com.constructors;

public class Student {
	
	private int id;
	private String name;
	private int age;
	
	
	Student() {
	
	}
	
	//parametrized constructor
	//if we create parametrized constructor JVM will not give default constructor
	//we need to create explicitly
	public Student(int id, String name, int age) {
		this.id=id;
		this.name=name;
		this.age=age;
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

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return " id=" + id + ", name=" + name + ", age=" + age;
	}
	
	public static void main(String[] args) {
		
		//early initialization
		Student s1=new Student(101, "Aniket", 23);
		Student s2=new Student(102, "Hrishikesh",25);
		Student s3=new Student(103, "Suraj", 27);
		
		//lazy initialization
		Student s4=new Student();
		s4.setId(104);
		s4.setName("Shivam");
		s4.setAge(29);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}
