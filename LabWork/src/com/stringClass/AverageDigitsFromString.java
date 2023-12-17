package com.stringClass;

import java.util.Scanner;

public class AverageDigitsFromString {
	
	static void averageOfDigits(String s) {
		int count=0;
		float sum=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i])) {
				sum+=Character.getNumericValue(ch[i]);
				count++;
			}
		}
		float avg=sum/count;
		System.out.println("Average Of Digits:"+avg);
		System.out.println(count);
	}
	
	static void averageOfDigits1(String s) {
		int count=0;
		float sum=0;
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0' && ch[i]<='9') {
				sum+=ch[i]-48;
				count++;
			}
		}
		float avg=sum/count;
		System.out.println("Average Of Digits:"+avg);
		System.out.println(count);
	}

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=ip.next();
		
		averageOfDigits(s);
		averageOfDigits1(s);

	}

}
