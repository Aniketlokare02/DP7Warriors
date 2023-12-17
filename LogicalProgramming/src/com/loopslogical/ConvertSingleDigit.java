package com.loopslogical;

import java.util.Scanner;

public class ConvertSingleDigit {
	
	static int reduceNumber(int num) {
		int sum=0;
		while(num>0 || sum>9) {
			 
			if(num==0) {
				num=sum;
				sum=0;
			}
			sum+=num%10;
			num/=10;
		}
		return sum;
	}
	
	static int convertSingleDigit(int num) {
		int sum=0;
		while(num!=0) {
			int rem=num%10;
			sum+=rem;
			num/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		
		if(convertSingleDigit(num)==0 || convertSingleDigit(num)==9) {
			System.out.println(num+" is reduced to single digit as:"+convertSingleDigit(num));
		}
		else {
			int sum=convertSingleDigit(num);
			System.out.println(num+" is reduced to single digit as:"+convertSingleDigit(sum));
		}

		System.out.println(num+" is reduced to single digit as:"+reduceNumber(num));
		
	}

}
