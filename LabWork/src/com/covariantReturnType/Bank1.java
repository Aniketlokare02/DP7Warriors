package com.covariantReturnType;

class Person {
	
	private int pId;
	private String pName;
	private float balance;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}

}

class Paytm {

	static Person details() {
		Person p = new Person();
		p.setpId(101);
		p.setpName("Aniket");
		p.setBalance(10000f);

		return p;

	}

}

public class Bank1 {

	public static void main(String[] args) {
		
		Person p=Paytm.details();
		
		System.out.println(p.getpId()+" "+p.getpName()+" "+p.getBalance());
		
		System.out.println("Person Purchased One Item Of Cost : 2000Rs");
		float b=p.getBalance()-2000;
		p.setBalance(b);
		System.out.println("Person's Current Balance is:"+p.getBalance());

	}

}
