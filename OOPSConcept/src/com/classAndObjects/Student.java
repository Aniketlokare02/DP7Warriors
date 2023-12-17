package com.classAndObjects;

public class Student {
	
	int s_id;
	String s_name;
	float s_marks;
	
	void dispaly() {
		System.out.println(s_id+" "+s_name+" "+s_marks);
	}

	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.s_id=1;
		s1.s_name="Aniket";
		s1.s_marks=90;
		
		Student s2=new Student();
		s2.s_id=2;
		s2.s_name="Suraj";
		s2.s_marks=95;
		
		s1.dispaly();
		System.out.println("------------");
		s2.dispaly();

	}

}
