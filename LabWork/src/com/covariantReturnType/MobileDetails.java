package com.covariantReturnType;

class Mobile{
	
	String bName;
	Mobile display() {
		
		return new Mobile();
	}
}

class Samsung extends Mobile{
	
	Samsung display() {
		return new Samsung();
	}
}

public class MobileDetails {

	public static void main(String[] args) {
		
		Mobile m=new Samsung();
		m.bName="Samsung";
		System.out.println(m.bName);

	}

}
