package com.assignments;

public class DepartMent {
	private int dId;
	private String dName;
	
	DepartMent(){
		
	}
	
	DepartMent(int dId, String dName){
		this.dId=dId;
		this.dName=dName;
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
		return "DepartMent Details \nId=" + dId + "\nName=" + dName;
	}
	
}
