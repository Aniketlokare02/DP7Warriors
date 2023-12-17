package com.arrayOfObject;

import java.util.Scanner;

public class Student1UserInput {
	
static Scanner sc= new Scanner(System.in);
	
	static void enterDetails(Student1 s)
	{
		System.out.println("Enter student id:");
		s.setId(sc.nextInt());
		
		System.out.println("Enter student name:");
		s.setName(sc.next());
		
		float m[]= new float[5];
		System.out.println("Enter student marks of 5 subjects:");
		
		for(int i=0;i<m.length;i++)
		{	
			System.out.println("Subject "+(i+1)+":");	
			m[i]= sc.nextFloat();
		}
		
		s.setMarks(m);
		
	}
	
	static float calcPercentage(Student1 s)
	{
		float m[]= s.getMarks();
		float total=0;
		for(float m1:m)
		{
			total+=m1;
		}
		
		float per= (total/500)*100;
		return per;
	}
	

	public static void main(String[] args) {
		
		Student1[] stud= new Student1[3];
		for(int i=0;i<stud.length;i++)
		{
			stud[i]= new Student1();
			enterDetails(stud[i]);
		}
		for (Student1 s : stud) {
			System.out.println(s);
		}
		System.out.println("-----------------------------------");
		for(Student1 s:stud)
		{
			System.out.println(s.getId()+" "+s.getName()+" "+calcPercentage(s));
		}

	}

}
