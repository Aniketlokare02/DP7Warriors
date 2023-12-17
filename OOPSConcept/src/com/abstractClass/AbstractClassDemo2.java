package com.abstractClass;

abstract class Account {
	long accNo;
	String name;
	float balance;

	Account() {

	}

	Account(long accNo, String name, float balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;

	}

	abstract void deposit(float amount);

	abstract void withdraw(float amount);

}

class SavingAccount extends Account {

	SavingAccount() {

	}

	SavingAccount(long accNo, String name, float balance) {
		super(accNo, name, balance);
	}

	@Override
	void deposit(float amount) {

		balance += amount;
		System.out.println("New balance is:" + balance);

	}

	@Override
	void withdraw(float amount) {

		if ((balance - amount) > 0) {
			balance-=amount;
			System.out.println("Withdraw successful:" + amount);
			System.out.println("New Balance:" + balance);
		}

		else {
			System.out.println("Insufficient Balance:" + balance);
		}

	}

	float getBalance() {
		return balance;
	}

}

class CurrentAccount extends Account {
	String panNo;
	
	CurrentAccount() {

	}

	CurrentAccount(long accNo, String name, float balance) {
		super(accNo, name, balance);
	}
	
	CurrentAccount(long accNo, String name, float balance, String panNo) {
		super(accNo, name, balance);
		this.panNo=panNo;
	}

	@Override
	void deposit(float amount) {

		if ((balance + amount) > 50000) {
			if (panNo != null) {
				balance += amount;
				System.out.println("New balance is:" + balance);
			}

			else {
				System.out.println("Please provide pan number");
			}
		} else {
			balance += amount;
			System.out.println("New balance is:" + balance);
		}

	}

	@Override
	void withdraw(float amount) {

		if ((balance - amount) >= 1000) {
			balance-=amount;
			System.out.println("Withdraw successful:" + amount);
			System.out.println("New Balance:" + balance);
		}

		else {
			System.out.println("Insufficient Balance:" + balance);
		}

	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

}

public class AbstractClassDemo2 {

	public static void main(String[] args) {

		Account a;
		a = new SavingAccount(123456,"Gauri",34000);
		
		a.deposit(90000);
		System.out.println("-----------------------------");
		a.withdraw(20000);
		
		CurrentAccount a1= new CurrentAccount(345066, "Aniket", 45000);
		
		System.out.println("-----------------------------");
		a1.deposit(67000);
		a1.setPanNo("JH67KJ00");
		
		a1.deposit(56000);
		System.out.println("-----------------------------");
		a1.withdraw(100000);
		
	}

}
