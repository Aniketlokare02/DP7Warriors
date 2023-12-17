package com.constructors;

public class Account {
	
	private int id;
	private String name;
	private double balance;
	private String status;
	
	Account(){
		
	}
	
	Account(int id, String name, double balance, String status){
		this.id=id;
		this.name=name;
		this.balance=balance;
		this.status=status;
	}

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", balance=" + balance + ", status=" + status;
	}
	
	
}
