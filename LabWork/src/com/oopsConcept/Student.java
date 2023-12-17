package com.oopsConcept;

import java.util.Scanner;

public class Student {
	
	private int sId;
	private String sName;
	private String sAddress;
	private String cName="TQ";
	
	Student(int sId, String sName, String sAddress){
		this.sId=sId;
		this.sName=sName;
		this.sAddress=sAddress;
		this.cName=cName;
	}
	
	Student(int sId, String sName, String sAddress, String cName){
		this.sId=sId;
		this.sName=sName;
		this.sAddress=sAddress;
		this.cName=cName;
	}

	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsAddress() {
		return sAddress;
	}
	public void setsAddress(String sAddress) {
		this.sAddress = sAddress;
	}

	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}

//	@Override
//	public String toString() {
//		return "Student Id=" + sId + ",Student Name=" + sName + ",Student Address=" + sAddress + ",College Name=" + cName;
//	}

}
