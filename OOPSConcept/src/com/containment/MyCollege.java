package com.containment;

public class MyCollege {
	static int count=0;
	static void getCount(Student s) {
		int flag=0;
		if(s.getCourse().getcName().equals("Java")) {
			count++;
			
		}
	}

	public static void main(String[] args) {
		
		Course c1=new Course(101, "Java", 25000f);
		Course c2=new Course(102, "Python", 15000f);
		Course c3=new Course(103, ".Net", 20000f);

		Student s1=new Student(101, "Aniket", c1);
		Student s2=new Student(102, "Hrishikesh", c2);
		Student s3=new Student(103, "Suraj", c3);
		Student s4=new Student(104, "Pralay", c1);
		Student s5=new Student(105, "Shivam", c2);
		Student s6=new Student(106, "Anuj", c3);
		
		System.out.println(s1);
		System.out.println("------------");
		System.out.println(s2);
		System.out.println("------------");
		System.out.println(s3);
		System.out.println("------------");
		System.out.println(s4);
		System.out.println("------------");
		System.out.println(s5);
		System.out.println("------------");
		System.out.println(s6);
		
		System.out.println("--------");
		getCount(s1);
		getCount(s2);
		getCount(s3);
		getCount(s4);
		getCount(s5);
		getCount(s6);
		System.out.println(MyCollege.count);
	}

}
