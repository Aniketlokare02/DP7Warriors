package com.inheritance;

class Vehicle {
	
	private int vId;
	private String wheeler;
	
	Vehicle(){
		
	}
	
	public Vehicle(int vId, String wheeler){
		this.vId=vId;
		this.wheeler=wheeler;
	}

	public int getvId() {
		return vId;
	}
	public void setvId(int vId) {
		this.vId = vId;
	}

	public String getWheeler() {
		return wheeler;
	}
	public void setWheeler(String wheeler) {
		this.wheeler = wheeler;
	}

	@Override
	public String toString() {
		return "VId=" + vId + ", Wheeler=" + wheeler;
	}
	
}

class Car extends Vehicle{
	
	private String cName;
	private float price;
	private String color;

	Car(){
		
	}
	
	public Car(int vId, String wheeler, String cName, float price, String color){
		super(vId, wheeler);
		this.cName=cName;
		this.price=price;
		this.color=color;
	}

	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}

	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return super.toString()+"Name=" + cName + ", Price=" + price + ", Color=" + color;
	}
	
}


public class SingleLevel {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setvId(123);
		car.setWheeler("Four Wheeler");
		car.setcName("Thar");
		car.setColor("Black");
		car.setPrice(1800000f);
		
		System.out.println(car);

	}

}
