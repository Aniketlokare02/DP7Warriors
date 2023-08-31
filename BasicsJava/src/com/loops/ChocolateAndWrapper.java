package com.loops;

import java.util.Scanner;

public class ChocolateAndWrapper {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter Rupees:");
		int rupee=ip.nextInt();
		int chocolate=0;
		int wrapper=chocolate;
		
		for(int i=1;i<=rupee;i++) {
			if(chocolate%3==0) {
				chocolate++;
				if(wrapper%3==0) {
					chocolate++;
				}
			}
		}
		System.out.println("Total Chocolate Brought:"+chocolate);

	}

}
