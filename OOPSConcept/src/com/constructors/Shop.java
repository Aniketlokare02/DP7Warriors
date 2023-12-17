package com.constructors;

public class Shop {
	
	static void giveDiscount(Item i) {
		if(i.getPrice()>200) {
			double p=i.getPrice();
			p=p-(p*0.1);
			i.setPrice(p);
		}
	}

	public static void main(String[] args) {
		
		Item i1=new Item(101, "Tv", 500);
		Item i2=new Item(102, "Fridge", 100);
		Item i3=new Item(103, "WashinMachine", 400);
		Item i4=new Item(104, "Mobile", 200);
		Item i5=new Item();
		i5.setId(105);
		i5.setName("HomeTheater");
		i5.setPrice(150);
		
		System.out.println("-------------Before-----------");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);

		giveDiscount(i1);
		giveDiscount(i2);
		giveDiscount(i3);
		giveDiscount(i4);
		giveDiscount(i5);
		
		System.out.println("------------After-------------");
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
	}

}
