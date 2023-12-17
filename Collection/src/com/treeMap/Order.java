package com.treeMap;

public class Order {
	
	private int orderId;
	private String pName;
	private double price;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Order(int orderId, String pName, double price) {
		super();
		this.orderId = orderId;
		this.pName = pName;
		this.price = price;
	}
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", pName=" + pName + ", price=" + price + "]";
	}

}
