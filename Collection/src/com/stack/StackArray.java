package com.stack;

class MyStack{
	
	int top;
	int size;
	int[] stk;
	
	public MyStack() {
		
	}
	
	public MyStack(int size) {
		top=-1;
		this.size=size;
		stk=new int[size];
	}
	
	void push(int data) {
		if(top<size-1) {
			top++;
			stk[top]=data;
			System.out.println("Element is Inserted.");
		}
		else {
			System.out.println("Stack is Full.");
		}
	}
	
	void pop() {
		if(top!=-1) {
			System.out.println("Element is Deleted:"+stk[top]);
			top--;
		}
		else {
			System.out.println("Stack is Empty.");
		}
	}
	
	void display() {
		if(top!=-1) {
			System.out.print("[");
			for(int i=0;i<stk.length;i++) {
				System.out.print(stk[i]+",");
			}
			System.out.println("]");
		}
		else {
			System.out.println("Stack is Empty.");
		}
	}
}

public class StackArray {

	public static void main(String[] args) {
		
		MyStack s=new MyStack(5);
		
		s.pop();
		
		s.push(5);
		s.push(15);
		s.push(25);
		s.push(35);
		s.push(45);
		
		s.display();
		s.push(55);
		
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		
		s.display();

	}

}
