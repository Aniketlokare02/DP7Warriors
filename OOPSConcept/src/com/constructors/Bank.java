package com.constructors;

public class Bank {
	
	static void changeStatus(Account a) {
		if(a.getBalance()>0) {
			a.setStatus("Active");
		}
		else {
			a.setStatus("Deactive");
		}
	}

	public static void main(String[] args) {
		
		Account a1=new Account(101, "Aniket", 30000, "Unknown");
		Account a2=new Account(102, "Hrishikesh", 15000, "Unknown");
		Account a3=new Account(103, "Suraj", 0, "Unknown");
		
		System.out.println("-------------Before------------");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		changeStatus(a1);
		changeStatus(a2);
		changeStatus(a3);
		
		System.out.println("-------------After-------------");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

	}

}
