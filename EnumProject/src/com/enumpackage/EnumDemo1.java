package com.enumpackage;

class ConstantDirec{
	
	static final String NORTH="NORTH";
	static final String SOUTH="SOUTH";
	static final String EAST="EAST";
	static final String WEST="WEST";
}

public class EnumDemo1 {
	
	public enum Direction{NORTH, SOUTH, EAST, WEST};

	public static void main(String[] args) {
		
		Direction d1=Direction.NORTH;
		System.out.println(d1);
		Direction d2=Direction.NORTH;
		
		if(d1.equals(d2))
			System.out.println("Equals");
		
		if(d1==d2)
		System.out.println("Equals");
		
		// value, valueOf, ordinal
		
		//iterate enum
		System.out.println("--------");
		
		for (Direction d : Direction.values()) {
			System.out.println(d);
		}
		
		System.out.println(Direction.valueOf("SOUTH"));
		
		System.out.println(Direction.SOUTH.ordinal());

	}

}
