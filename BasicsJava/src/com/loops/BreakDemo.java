package com.loops;

public class BreakDemo {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			if(i==5)
				break;//comes out of loop
		}
		System.out.println("=======");
		for(int i=0;i<10;i++) {
			if(i==5)
				break;
			System.out.println(i);
		}

	}

}
