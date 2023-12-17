package com.bankProject;

public class User {
	
	private String userName;
	private long adharNo;
	private String panNo;
	private String email;
	private long phoneNo;
	private String address;
	private Account account;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public User(String userName, long adharNo, String panNo, String email, long phoneNo, String address,
			Account account) {
		super();
		this.userName = userName;
		this.adharNo = adharNo;
		this.panNo = panNo;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
		this.account = account;
	}

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	
	public String getPanNo() {
		return panNo;
	}
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return " [userName=" + userName + ", adharNo=" + adharNo + ", panNo=" + panNo + ", email=" + email
				+ ", phoneNo=" + phoneNo + ", address=" + address + account + "]";
	}

}
