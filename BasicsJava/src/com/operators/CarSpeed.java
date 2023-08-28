package com.operators;

import java.util.Scanner;

public class CarSpeed {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		
		System.out.println("Enter Distance Travelled by Car:");
		int distance=ip.nextInt();
		System.out.println("Enter Time take to Cover the Distance:");
		int time=ip.nextInt();
		
		double speed=distance/time;
		
		System.out.println("The Speed of Car is:"+speed+"km/hr");

	}

}
