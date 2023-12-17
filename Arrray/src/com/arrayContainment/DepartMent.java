package com.arrayContainment;

public class DepartMent {
	
	private int dId;
	private String dName;
	
	public DepartMent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DepartMent(int dId, String dName) {
		super();
		this.dId = dId;
		this.dName = dName;
	}

	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}

	@Override
	public String toString() {
		return "DepartMent [dId=" + dId + ", dName=" + dName + "]";
	}

}
