package com.constructorChaining;

class MyClass{
	
	int a;
	int b;
	
	MyClass(){
		this(10,20);//Constructor Chaining
	}
	
	MyClass(int a, int b){//in parameterized constructor to diffrentiate b/w local and instance variable
		this.a=a;
		this.b=b;
	}
	
	void display() {
		int a;
		a=99;
		System.out.println("Local:"+a);//local variable
		System.out.println("Instance:"+this.a);//instance variable
		this.addition(this);//4)to call one method from another method
		//addition(this);
		
		MyClass obj=new MyClass(4, 5);
		this.addition(obj);
		//this.addition(this);
	}	
	
	void addition(MyClass c) { // 3) to pass one object to another
		this.a=this.a+c.a;
		this.b=this.b+c.b;
	}
}

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
