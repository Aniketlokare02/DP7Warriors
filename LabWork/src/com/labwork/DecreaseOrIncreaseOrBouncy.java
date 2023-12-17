package com.labwork;

import java.util.Scanner;

//public class IncreasingOrDecreasing {
//	
//	static void increasingOrDecreasing(int num) {
//		int num1=num;
//		int num2=num;
//		int digit=0;
//		int digit1=9;
//		int count=0;
//		int count1=0;
//		int count2=0;
//		while(num1!=0) {
//			num1/=10;
//			count2++;
//		}
//		while(num!=0) {
//			int rem=num%10;
//			if(rem>digit) {
//				digit=rem;
//				count++;
//			}
//			else if(digit1>rem) {
//				digit1=rem;
//				count1++;
//			}
//		}
//		if(count==(count2-1)) {
//			System.out.println(num2+" is Increasing Number.");
//		}
//		else if(count1==(count2-1)) {
//			System.out.println(num+" is Decreasing Number.");
//		}
//		else {
//			System.out.println(num+" is Bouncy Number.");
//		}
//	}
//
//	public static void main(String[] args) {
//		Scanner ip=new Scanner(System.in);
//		System.out.print("Enter The Number:");
//		int num=ip.nextInt();
//		
//		increasingOrDecreasing(num);
////		int num1=num;
////		
////		int count=0;
////		while(num!=0) {
////			num/=10;
////			count++;
////		}
////		//System.out.println(count);
////		
////		int count1=0;
////		int digit=0;
////		while(num1!=0) {
////			int rem=num1%10;
////			if(digit-1==rem) {
////				count1++;
////			}
////			digit=rem;
////			//System.out.println(digit);
////			num1/=10;
////		}
////		//System.out.println(count1);
////		if((count-1)==count1) {
////			System.out.println("Number in Increasing Order.");
////		}
////		else {
////			System.out.println("Number is Bounce.");
////		}
//
//	}
//
//}


public class DecreaseOrIncreaseOrBouncy {

	// To check if a number is increasing
	 static boolean Inreasing(int num) {
		int rem1 = num % 10;
		num /= 10;

		while (num > 0) {
			int rem2 = num % 10;
			if (rem2 >= rem1) {
				return false;
			}
			rem1 = rem2;
			num /= 10;
		}
		return true;
	}

	// To check if a number is decreasing
	 static boolean Decresing(int num) {
		int rem1 = num % 10;
		num /= 10;

		while (num > 0) {
			int rem2 = num % 10;
			if (rem2 <= rem1) {
				return false;
			}
			rem1 = rem2;
			num /= 10;
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		if (Inreasing(num)) {
			System.out.println(num + " is an increasing number.");
		} else if (Decresing(num)) {
			System.out.println(num + " is a decreasing number.");
		} else {
			System.out.println(num + " is a bouncy number.");
		}
		sc.close();
	}
}
