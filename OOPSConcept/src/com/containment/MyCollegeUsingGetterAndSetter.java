package com.containment;

public class MyCollegeUsingGetterAndSetter {

	public static void main(String[] args) {
		// by using getter and setter giving values to instance variables
		Course c1=new Course();
		c1.setcId(101);
		c1.setcName("Full Stack");
		c1.setFees(25000f);
		
		Student s1=new Student();
		s1.setsId(1);
		s1.setsName("Aniket");
		s1.setCourse(c1);
		System.out.println(s1);
		
		// passing anonymous object inside student object
		// 2nd way
		Student s2=new Student();
		s2.setsId(2);
		s2.setsName("Hrishi");
		s2.setCourse(new Course());
		s2.getCourse().setcId(102);
		s2.getCourse().setcName("Java");
		s2.getCourse().setFees(30000f);
		System.out.println(s2);
		

	}

}
