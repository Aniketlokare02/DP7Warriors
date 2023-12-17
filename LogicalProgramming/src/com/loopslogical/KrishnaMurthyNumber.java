package com.loopslogical;

import java.util.Scanner;

public class KrishnaMurthyNumber {
	
	static int krishnaMurthyNumber(int num) {
		
		int rem=0;
		int sum=0;
		while(num!=0) {
			rem=num%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact*=i;
			}
			sum+=fact;
			num/=10;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter The Number:");
		int num=ip.nextInt();
		//int orignal=num;
		
		if(krishnaMurthyNumber(num)==num) {
			System.out.println(num+" is Krishnamurthy Number.");
		}
		else {
			System.out.println(num+" is Not KrishnaMurthy Number.");
		}

	}

}
