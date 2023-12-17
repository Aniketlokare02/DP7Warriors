package com.methodOverriding;

class Account {

	private int accountNo;
	private String name;
	protected float balance;
	protected float rateOfInterest;

	Account() {

	}

	public Account(int accountNo, String name, float balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getRateOfInterest() {
		rateOfInterest = 5f;
		return rateOfInterest;
	}

	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	void deposite(float amount) {
		balance += amount;
	}

	void withdraw(float amount) {
		if ((balance - amount) > 0) {
			balance -= amount;
		}
		else {
			System.out.println("Insificient Balance:"+balance);
		}
	}

}

class SavingAccount extends Account {

	private String panNumber;
	
	public SavingAccount() {
		super();
	}

	public SavingAccount(int accountNo, String name, float balance) {
		super(accountNo, name, balance);
	}

	public SavingAccount(int accountNo, String name, float balance, String panNumber) {
		super(accountNo, name, balance);
		this.panNumber = panNumber;
	}

	public String getPanNumber() {
		return panNumber;
	}
	public void setPanNumber(String panNumber) {
		this.panNumber = panNumber;
	}
	
	@Override
	public float getRateOfInterest() {
		rateOfInterest = 8.5f;
		return rateOfInterest;
	}
	
	@Override
	void deposite(float amount) {
		float b=balance+amount;
		if(b>50000) {
			if(panNumber != null) {
				balance=b;
			}
		}
		else {
			System.out.println("Please enter your pan number your balance is getting above 50000");
		}
	}
	
	@Override
	void withdraw(float amount) {
		if((balance-amount)>1000) {
			balance-=amount;
		}
		else {
			System.out.println("Insufficient Balance:"+balance);
		}
	}
}

public class Bank {

	public static void main(String[] args) {
		
		Account a1=new Account(101221, "Aniket", 1000);
		System.out.println("Account No:"+a1.getAccountNo()+" "+"Balance:"+a1.getBalance());
		
		System.out.println("Rate:"+a1.getRateOfInterest());
		
		a1.withdraw(900);
		System.out.println("Balance:"+a1.getBalance());
		
		a1.deposite(67000);
		System.out.println("Balance:"+a1.getBalance());
		
		System.out.println("-------------------------------------");
		
		SavingAccount s1= new SavingAccount(10211, "Neha", 20000);
		
        System.out.println("Account Details:"+s1.getAccountNo()+" Balance:"+s1.getBalance());
		
		System.out.println("Rate:"+s1.getRateOfInterest());
		
		s1.withdraw(19500);
		System.out.println("Balance:"+s1.getBalance());
		
		s1.deposite(67000);
		System.out.println("Balance:"+s1.getBalance());
		
		s1.setPanNumber("AC90GH67");
		s1.deposite(67000);
		System.out.println("Balance:"+s1.getBalance());
		

	}

}
