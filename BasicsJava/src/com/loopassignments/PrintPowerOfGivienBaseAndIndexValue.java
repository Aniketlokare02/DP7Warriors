package com.loopassignments;

import java.util.Scanner;

public class PrintPowerOfGivienBaseAndIndexValue {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Base Value:");
		int base=ip.nextInt();
		
		System.out.print("Enter Power value:");
		int power=ip.nextInt();
		
		int value=0;
		for(int i=1;i<=power;i++) {
			value=base*i;
		}
		System.out.print("Power Value is:"+value);

	}

}
