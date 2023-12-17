package com.oopsConcept;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Customer Id:");
		int id=ip.nextInt();
		System.out.print("Enter Customer Name:");
		String name=ip.next();
		System.out.print("Enter Customer Account No:");
		int accountno=ip.nextInt();
		
		Customer c=new Customer();
		c.setC_id(id);
		c.setC_name(name);
		c.setAccount_no(accountno);
		
		System.out.println(c);
		System.out.println("-----------------------------------------");
		
		System.out.println("You Want Credit Or Debit The Amount.");
		char t=ip.next().charAt(0);
		System.out.print("Enter Amount Want To Credit Or Debit:");
		double amount=ip.nextDouble();
		double balance;
		if(t=='C') {
			balance=c.getBalance();
			balance+=amount;
			c.setBalance(balance);
			System.out.println(amount+" is Credited To Your Account.");
			//System.out.println("Available Balance is:"+balance);
		}
		else {
			balance=c.getBalance();
			balance-=amount;
			c.setBalance(balance);
			System.out.println(amount+" is Debited From Your Account.");
			//System.out.println("Available Balance is:"+balance);
		}
		System.out.println("Available Balance is:"+balance);
		System.out.println(c.getBalance());

	}

}
