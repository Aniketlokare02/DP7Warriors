package com.treeMap;

public class Customer{ //implements Comparable<Customer>{
	
	private int cId;
	private String name;
	private long mNo;
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Customer(int cId, String name, long mNo) {
		super();
		this.cId = cId;
		this.name = name;
		this.mNo = mNo;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getmNo() {
		return mNo;
	}

	public void setmNo(long mNo) {
		this.mNo = mNo;
	}

	@Override
	public String toString() {
		return "Customer [cId=" + cId + ", name=" + name + ", mNo=" + mNo + "]";
	}

//	@Override
//	public int compareTo(Customer o) {
//		return this.cId-o.cId;
//	}
	

}
