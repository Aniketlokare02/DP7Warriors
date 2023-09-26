package com.assignments;

public class MyDepartmentGettreSetter {

	public static void main(String[] args) {
		
		Student1 s1=new Student1();
		s1.setRollNo(101);
		s1.setsName("Aniket");
		s1.setDepartMent(new DepartMent());
		s1.getDepartMent().setdId(201);
		s1.getDepartMent().setdName("Mechanical");
		
		Student1 s2=new Student1();
		s2.setRollNo(102);
		s2.setsName("Hrishikesh");
		s2.setDepartMent(new DepartMent());
		s2.getDepartMent().setdId(202);
		s2.getDepartMent().setdName("Electrical");
		
		System.out.println(s1);
		System.out.println(s2);

	}

}