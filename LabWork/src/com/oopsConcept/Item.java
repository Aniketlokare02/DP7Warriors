package com.oopsConcept;

public class Item {
	
	int itemId;
	String itemName;
	float price;
	
	void display(int itemId, String itemName, float price) {
		System.out.println("Item Id:"+itemId);
		System.out.println("Item Name:"+itemName);
		System.out.println("Item Price:");
	}

}
