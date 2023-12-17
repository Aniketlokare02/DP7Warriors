package com.encapsulation;

import java.util.Scanner;

import com.constructors.Student;

class Person{
	
	private int id;
	private String name;
	private int age;
	
	Person(int id, String name, int age){
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
		return "id=" + id + ", name=" + name + ", age=" + age;
	}
	
}
public class VotingEligibility {
	
	static void checkVoting(Person p) {
		if(p.getAge()>=18) {
			System.out.println("Person is Eligible for Vote.");
			System.out.println(p);
		}
		else {
			System.out.println("Person is Not Eligible for Vote.");
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		Person p1=new Person(ip.nextInt(), ip.next(), ip.nextInt());
		
		Person p2=new Person(ip.nextInt(), ip.next(), ip.nextInt());
		
		checkVoting(p1);
		System.out.println("---------------------------");
		checkVoting(p2);

	}

}
