package com.containment;

class Engine{
	
	private String engineType;
	private int price;
	
	Engine(){
		
	}
	
	Engine(String engineType, int price){
		this.engineType=engineType;
		this.price=price;
	}

	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\nEngine Details\nEngineType=" + engineType + ", Price=" + price;
	}
	
}

class Machine{
	
	private String machineType;
	private Engine engine;
	
	Machine(){
		
	}
	
	Machine(String machineType, Engine engine){
		this.machineType=machineType;
		this.engine=engine;
	}

	public String getMachineType() {
		return machineType;
	}
	public void setMachineType(String machineType) {
		this.machineType = machineType;
	}

	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "\nMachine Details\nMachineType=" + machineType + engine;
	}
	
}

class Car{
	
	private int modelNo;
	private String carName;
	private Machine machine;
	
	Car(){
		
	}
	
	Car(int modelNo, String carName, Machine machine){
		this.modelNo=modelNo;
		this.carName=carName;
		this.machine=machine;
	}

	public int getModelNo() {
		return modelNo;
	}
	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
	}

	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}

	public Machine getMachine() {
		return machine;
	}
	public void setMachine(Machine machine) {
		this.machine = machine;
	}

	@Override
	public String toString() {
		return "Car Details\nModelNo=" + modelNo + ", CarName=" + carName + machine;
	}
	
}

public class CarDetails {

	public static void main(String[] args) {
		
		Car car=new Car();
		car.setModelNo(2023123);
		car.setCarName("Thar");
		car.setMachine(new Machine());
		car.getMachine().setMachineType("Mahindra");
		car.getMachine().setEngine(new Engine());
		car.getMachine().getEngine().setEngineType("DieselEngine");
		car.getMachine().getEngine().setPrice(2000000);
		
		System.out.println(car);
		System.out.println("--------------------------------------");
		
		Car car1=new Car();
		car1.setModelNo(2023456);
		car1.setCarName("Innova");
		car1.setMachine(new Machine());
		car1.getMachine().setMachineType("Toyota");
		car1.getMachine().setEngine(new Engine());
		car1.getMachine().getEngine().setEngineType("PetrolEngine");
		car1.getMachine().getEngine().setPrice(2400000);
		
		System.out.println(car1);

	}

}
