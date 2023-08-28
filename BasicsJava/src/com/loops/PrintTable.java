package com.loops;

import java.util.Scanner;

public class PrintTable {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter the Number to print table:");
		int num=ip.nextInt();
		
		for(int i=1;i<=10;i++) {
			System.out.println(num+" X "+i+" = "+(num*i));
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i==j) {
				System.out.println(" *");
			}}
			
		}

	}

}
