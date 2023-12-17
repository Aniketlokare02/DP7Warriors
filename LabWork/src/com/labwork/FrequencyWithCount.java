package com.labwork;

import java.util.Scanner;

public class FrequencyWithCount {

	static void countRepeatedDigit(int num) {
		int num1=num;
		while(num!=0) {
			int count=0;
			int rem=num%10;
			while(num1!=0) {
				int rem1=num1%10;
				if(rem==rem1) {
					count++;
				}
				num1/=10;
			}
			System.out.println(rem+" is Repeated:"+count);
			num/=10;
			num1=num;
		}
	}
	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		countRepeatedDigit(num);

	}

}
