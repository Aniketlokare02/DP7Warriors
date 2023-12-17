package com.singleTon;

public class MySingleTon {
	
	private static MySingleTon obj=new MySingleTon();
	
	String msg;
	
	private MySingleTon() {
		
	}
	
	public static MySingleTon getObject() {
		return obj;
	}
	
	public static void main(String[] args) {
		
		MySingleTon ms1=MySingleTon.getObject();
		ms1.msg="Java";
		MySingleTon ms2=MySingleTon.getObject();
		ms2.msg="Angular";
		MySingleTon ms3=MySingleTon.getObject();
		ms3.msg="JavaScript";
		
		System.out.println(ms2.msg);
		
	}

}
