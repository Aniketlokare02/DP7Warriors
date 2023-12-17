package com.oopsConcept;

import java.util.Scanner;

public class Person {
	
	int id;
	String name;
	
	Person(){
		this(101);
	}
	
	Person(int id){
		this("Aniket");
		this.id=id;
	}
	
	Person(String name){
		this.name=name;
	}

	@Override
	public String toString() {
		return "Person Id=" + id + ",Person Name=" + name;
	}
	
	public static void main(String[] args) {
		Person p1=new Person();
		System.out.println(p1);
	}
	
}
