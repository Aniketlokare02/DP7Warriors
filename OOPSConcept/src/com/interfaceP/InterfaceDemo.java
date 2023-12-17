package com.interfaceP;

interface Bakery{
	
	String bName="BangaloreBakery";  // public, static, final
	
	void bake();  // public and abstract
}

class Cake implements Bakery{

	@Override
	public void bake() {
		System.out.println("We Bake Cakes: Chocolate, BlackBerry, HoneyCake.");
	}
	
}

class Biscuits implements Bakery{

	@Override
	public void bake() {
		System.out.println("We Bake Biscuits : Almond, ChocoChips..");	
	}
	
	void order() {
		System.out.println("Minmun Order is 250gms.");
	}
	
}

public class InterfaceDemo {

	public static void main(String[] args) {
		System.out.println("Bakery Name is:"+Bakery.bName);
		
		System.out.println("-------------------------");
		
		Cake c=new Cake();
		c.bake();
		
		System.out.println("-------------------------");
		
		Biscuits b=new Biscuits();
		b.bake();
		b.order();
		
		System.out.println("-------------------------");
		
		Bakery b1;
		b1=new Cake();
		b1.bake();
		
		System.out.println("-------------------------");
		
		b1=new Biscuits();
		b1.bake();
		//b1.order();

	}

}
