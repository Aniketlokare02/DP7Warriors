package com.constructorChaining;

public class Account {
	
	int id;
	String name;
	float balance;
	
	Account() {
		this(1, "Unknown");
	}
	
	public Account(int id, String name) {
		this.id=id;
		this.name=name;
		this.balance=10000;
	}
	
	public Account(int id, String name, float balance) {
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	void display() {
		int balance=5000;
		System.out.println("Local:"+balance);
		System.out.println("Instance:"+this.balance);
	}
	
	Account checkBalance() {
		return this;
	}

	@Override
	public String toString() {
		return "Id=" + id + ", Name=" + name + ", Balance=" + balance;
	}

	public static void main(String[] args) {
		 
		Account a1=new Account(101, "Aniket");
		System.out.println(a1);
		
		Account a2=new Account(102, "Hrishikesh", 15000);
		System.out.println(a2);
		
		Account a3=new Account();
		System.out.println(a3);
		
		Account a4=new Account(103, "Suraj", 20000);
		a4.display();
		
		Account a5=new Account(104, "Pralay", 25000);
		System.out.println(a5.checkBalance());

	}

}
