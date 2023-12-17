package com.stack;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> name=new Stack<>();
		name.push("Aniket");
		name.push("Hrishikesh");
		name.push("Suraj");
		System.out.println(name.push("Pralay"));
		name.push("Shivam");
		
		System.out.println(name);
		
		System.out.println(name.pop());
		System.out.println(name);

	}

}
