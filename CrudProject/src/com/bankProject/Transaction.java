package com.bankProject;

public class Transaction {
	
	private String transactionType;
	private long accNo;
	private String status;
	private float tAmount;
	
	public Transaction() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Transaction(String transactionType, long accNo, String status, float tAmount) {
		super();
		this.transactionType = transactionType;
		this.accNo = accNo;
		this.status = status;
		this.tAmount = tAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public float gettAmount() {
		return tAmount;
	}
	public void settAmount(float tAmount) {
		this.tAmount = tAmount;
	}

	@Override
	public String toString() {
		return "Transaction [transactionType=" + transactionType + ", accNo=" + accNo + ", status=" + status
				+ ", tAmount=" + tAmount + "]";
	}

}
