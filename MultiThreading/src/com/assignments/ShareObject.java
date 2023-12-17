package com.assignments;

//3.Show example in which two threads share same object.
class Student{
	
	int id;
	String name;
	
	
	public Student(int id, String name) {
		this.id=id;
		this.name=name;
	}
	
	public void print() {
		System.out.println(Thread.currentThread().getName());
		System.out.println("Student Id:"+id+" Name:"+name);
	}
}

public class ShareObject {

	public static void main(String[] args) {
		
		Student s1=new Student(101, "Aniket");
		
		Thread t1=new Thread()
				{
					public void run() {
						s1.print();
					}
				};
				
		Thread t2=new Thread()
				{
					public void run() {
						s1.print();
					}
				};
				
		t1.start();
		t2.start();

	}

}
