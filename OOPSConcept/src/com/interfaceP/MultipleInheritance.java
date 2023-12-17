package com.interfaceP;

interface Showable{
	
	void dispaly();
}

interface PrintMe{
	
	void display();
}

class Demo implements Showable, PrintMe{

	@Override
	public void display() {
		System.out.println("WelCome.");
		
	}

	@Override
	public void dispaly() {
		System.out.println("WelCome");
		
	}
	
}

public class MultipleInheritance {

	public static void main(String[] args) {
	
		Demo d=new Demo();
		d.dispaly();

	}

}
