package com.linkedList;

public class Bike implements Comparable<Bike>{
	
	private int id;
	private String name;
	private float price;
	private int model;
	public Bike(int id, String name, float price, int model) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.model = model;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return "Bike [id=" + id + ", name=" + name + ", price=" + price + ", model=" + model + "]";
	}
	
	@Override
	public int compareTo(Bike b) {
		if(this.price==b.price) {
			return (this.name.compareTo(b.name));
		}
		else
			if(this.getPrice()>b.getPrice())
				return -1;
			else
				return 1;
	}

}
