package com.containment;

public class Supplier {
	
	private int sId;
	private String sName;
	private Item item;
	
	Supplier(){
		
	}
	
	Supplier(int sId, String sName, Item item){
		this.sId=sId;
		this.sId=sId;
		this.item=item;
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

	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "\nSupplier Details\nId=" + sId + ",\nName=" + sName + item;
	}
	
}
