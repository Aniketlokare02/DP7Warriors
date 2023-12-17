package com.arrayContainment;

public class Course {
	
	private int cId;
	private String cName;
	private double fess;
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int cId, String cName, double fess) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.fess = fess;
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

	public double getFess() {
		return fess;
	}
	public void setFess(double fess) {
		this.fess = fess;
	}

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", cName=" + cName + ", fess=" + fess + "]";
	}

}
