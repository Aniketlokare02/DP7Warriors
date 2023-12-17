package com.bankProject;

public class Account {
	
	private String aacType;
	private float balance;
	private String status;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(String aacType, float balance) {
		super();
		this.aacType = aacType;
		this.balance = balance;
		this.status = "Activate";
	}

	public String getAacType() {
		return aacType;
	}
	public void setAacType(String aacType) {
		this.aacType = aacType;
	}

	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
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
		return " Account [ aacType=" + aacType + ", balance=" + balance + ", status=" + status + "]";
	}

}
