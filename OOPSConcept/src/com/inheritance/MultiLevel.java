package com.inheritance;

class Vehicle1 {
	
	private int vId;
	private String wheeler;
	
	Vehicle1(){
		
	}
	
	public Vehicle1(int vId, String wheeler){
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

class Car1 extends Vehicle{
	
	private String cName;
	private float price;
	private String color;

	Car1(){
		
	}
	
	public Car1(int vId, String wheeler, String cName, float price, String color){
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
		return super.toString()+"\nName=" + cName + ", Price=" + price + ", Color=" + color;
	}
	
}

class BMWCar extends Car{
	
	private String bName;
	private float milage;
	
	public BMWCar() {
		super();
	}
	
	public BMWCar(int vId, String wheeler, String cName, float price, String color, String bName, float milage) {
		super(vId, wheeler, cName, price, color);
		this.bName=bName;
		this.milage=milage;
	}

	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}

	public float getMilage() {
		return milage;
	}
	public void setMilage(float milage) {
		this.milage = milage;
	}

	@Override
	public String toString() {
		return super.toString()+"\nbName=" + bName + ", milage=" + milage + "]";
	}
	
}

public class MultiLevel {

	public static void main(String[] args) {
		
		BMWCar bmwCar=new BMWCar(101, "Four", "BMWX1", 5000000, "White", "BMW", 20);
		System.out.println(bmwCar);

	}

}
