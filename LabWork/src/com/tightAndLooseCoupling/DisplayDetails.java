package com.tightAndLooseCoupling;

interface KeyBoard{
	
	String display();
}

class Dell implements KeyBoard{

	@Override
	public String display() {
		return "It's Dell KeyBoard";
	}
	
}

class HP implements KeyBoard{

	@Override
	public String display() {
		return "It's HP KeyBoard";
	}
	
}

class Key{
	
	void display(KeyBoard k) {
		System.out.println(k.display());
	}
}

public class DisplayDetails {

	public static void main(String[] args) {
		
		Key k=new Key();
		
		KeyBoard b;
		
		b=new Dell();
		k.display(b);
		
		b=new HP();
		k.display(b);

	}

}
