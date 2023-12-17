package com.enumpackage;

enum Season{SUMMER, WINTER, MONSOON};

public class EnumDemo2 {

	public static void main(String[] args) {
		
		Season s=Season.SUMMER;
		switch(s) {
		case SUMMER: System.out.println("Wear Cotton Clothes");
						break;
		case WINTER: System.out.println("Wear Wollen Clothes");
						break;
		case MONSOON: System.out.println("Carry Umbrella");
						break;
		default:System.out.println("Error");
		}
	}

}
