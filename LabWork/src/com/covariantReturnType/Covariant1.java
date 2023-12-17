package com.covariantReturnType;

class Covariant {
	
	Object show() {
		return new Object();
	}

}

class SubCovariant extends Covariant{
	
	Integer show() {
		return 10;
	}
	
}

class SubCovariant1 extends Covariant{
	
	String show() {
		return "Aniket";
	}
	
}

public class Covariant1{
	public static void main(String[] args) {
		
		Covariant c;
		c=new SubCovariant();
		System.out.println(c.show());
		c=new SubCovariant1();
		System.out.println(c.show());
	}
}