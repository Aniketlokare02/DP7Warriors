package com.customException;



class Account{
	
	private int accId;
	private String name;
	private double balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Account(int accId, String name, double balance) {
		super();
		this.accId = accId;
		this.name = name;
		this.balance = balance;
	}

	public int getAccId() {
		return accId;
	}
	public void setAccId(int accId) {
		this.accId = accId;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	void deposite(double amount) {
		balance+=amount;
		System.out.println("Deposited Amount:"+amount);
		System.out.println("New Balance:"+balance);
	}
	
	void withdrawn(double amount) {
		try {
			if ((this.balance - amount) < 0)
				throw new InsufficientBalanceException("Your Balance Is Too Low.");

			this.balance -= amount;
			System.out.println("Withdraw Amount:" + amount);
			System.out.println("New Balance:" + balance);
		} 
		catch (InsufficientBalanceException e) {
			System.out.println(e);
		}
	}
	
	@Override
	public String toString() {
		return "Account [accId=" + accId + ", name=" + name + ", balance=" + balance + "]";
	}
	
}

public class Bank {

	public static void main(String[] args) {
		
		Account a=new Account();
		a.setAccId(2002);
		a.setName("Aniket");
		a.setBalance(5000);
		
		a.deposite(500);
		
		a.withdrawn(5600);
		a.withdrawn(3000);

	}

}
