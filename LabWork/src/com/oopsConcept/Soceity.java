package com.oopsConcept;

class Building{
	int id;
	int flatNo;
	int noOfMember;
	int floor;
	char wing;
	static String societyName="GokulDham";
	
	static {
		societyName="GokulDhamPrivateLTD.";
	}
	
	public Building(int id, int flatNo, int noOfMember, int floor, char wing) {
		this.id=id;
		this.flatNo=flatNo;
		this.noOfMember=noOfMember;
		this.floor=floor;
		this.wing=wing;
	}
	
	static void playArea() {
		System.out.println("Play Area Belongs To "+societyName);
	}
	
	static void swimmingPool() {
		System.out.println("Swimming Pool Belongs To "+societyName);
	}

	@Override
	public String toString() {
		return "Building Id=" + id + ", FlatNo=" + flatNo + ", No.Of Member=" + noOfMember + ", Floor=" + floor
				+ ", Wing=" + wing;
	}
	
}

public class Soceity {

	public static void main(String[] args) {
		Building.playArea();
		Building.swimmingPool();
		Building b1=new Building(1, 101, 5, 1, 'A');
		Building b2=new Building(2, 201, 4, 2, 'B');
		System.out.println(b1);
		System.out.println("-----------------------");
		System.out.println(b2);

	}

}
