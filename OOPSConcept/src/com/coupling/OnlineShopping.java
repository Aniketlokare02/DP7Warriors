package com.coupling;

interface Payment{
	
	void doTranscation(int amt);
}

class CreditCard implements Payment{
	
	private int cardNo;
	private int cvv;
	private float limit;
	
	public CreditCard() {
		super();
		
	}

	public CreditCard(int cardNo, int cvv, float limit) {
		super();
		this.cardNo = cardNo;
		this.cvv = cvv;
		this.limit = limit;
	}

	public int getCardNo() {
		return cardNo;
	}

	public int getCvv() {
		return cvv;
	}

	public float getLimit() {
		return limit;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public void setCvv(int cvv) {
		this.cvv = cvv;
	}

	public void setLimit(float limit) {
		this.limit = limit;
	}

	@Override
	public void doTranscation(int amt) {
		if((this.limit-amt)>0) {
			System.out.println("Credit Card is Debited By:"+amt);
			this.limit-=amt;
		}
		else {
			System.out.println("Insufficient Balance.");
		}
		
	}
	
}

class DebitCard implements Payment{
	
	private int cardNo;
	private double balance;
	
	public DebitCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DebitCard(int cardNo, double balance) {
		super();
		this.cardNo = cardNo;
		this.balance = balance;
	}

	@Override
	public void doTranscation(int amt) {
		if((this.balance-amt)>=1000) {
			System.out.println("Debit Card is Debited By:"+amt);
			this.balance-=amt;
		}
		else {
			System.out.println("Insufficient Balance.");
		}
	}
	
}

public class OnlineShopping {
	
	String cName;
	long mNo;
	
	public OnlineShopping() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OnlineShopping(String cName, long mNo) {
		super();
		this.cName = cName;
		this.mNo = mNo;
	}

	public void payBill(Payment p, int amt) {
		p.doTranscation(amt);
	}
	public void payBill(Payment p, int amt, int discount) {
		amt=amt-((discount/100)*amt);
		p.doTranscation(amt);
	}

	public static void main(String[] args) {
		
		OnlineShopping obj=new OnlineShopping("Aniket", 9740943250l);
		
		CreditCard c=new CreditCard(12345,455,50000);
		obj.payBill(c, 45000);
		
		DebitCard d=new DebitCard(54213, 80000);
		obj.payBill(d, 40000);

	}

}
