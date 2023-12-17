package com.tightAndLooseCoupling;

interface Car1{
	
	void show();
}

class Maruti implements Car1{

	String bName;
	int price;
	
	Maruti(String bName, int price){
		this.bName=bName;
		this.price=price;
	}
	
	@Override
	public void show() {
		System.out.println("Brand Name:"+bName+" And Price:"+price);	
	}
	
}

class Kia implements Car1{

	String bName;
	int price;
	
	Kia(String bName, int price){
		this.bName=bName;
		this.price=price;
	}
	
	@Override
	public void show() {
		System.out.println("Brand Name:"+bName+" And Price:"+price);	
	}
	
}

public class LooseCoupling {

	public static void main(String[] args) {
		
		Car1 c;
		c=new Maruti("Maruti", 800000);
		c.show();
		
		c=new Kia("Kia", 1400000);
		c.show();

	}

}
