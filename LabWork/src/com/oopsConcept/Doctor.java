package com.oopsConcept;

import java.util.Date;

class Patient{
	int id;
	String pName;
	static String dName;
	static int count=0;
	
	{
		count++;
	}
	
	static {
		dName="Dr.Patil";
	}
	
	Patient(int id, String pName){
		this.id=id;
		this.pName=pName;
	}

	@Override
	public String toString() {
		return "Patient Id=" + id + ", Patient Name=" + pName +", Doctor Name="+dName;
	}
	
}

public class Doctor {

	public static void main(String[] args) {
		
		Patient p1=new Patient(101, "Aniket");
		System.out.println(p1);
		System.out.println("----------------------------");
		Patient p2=new Patient(102, "Hrishi");
		System.out.println(p2);
		System.out.println("----------------------------");
		
		Date d=new Date();
		System.out.println(d);
		System.out.println("Number Of Patient Visited:"+Patient.count);

	}

}
