package com.containment;

public class Course {
	
	private int cId;
	private String cName;
	private float fees;
	
	Course(){
		
	}
	
	Course(int cId, String cName, float fees){
		this.cId=cId;
		this.cName=cName;
		this.fees=fees;
	}
	
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	
	@Override
	public String toString() {
		return "Course Deatails\nId=" + cId + ", \nName=" + cName + ", \nFees=" + fees;
	}

}
