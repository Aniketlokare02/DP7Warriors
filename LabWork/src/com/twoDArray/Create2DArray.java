package com.twoDArray;

import java.util.Scanner;

public class Create2DArray {

	public static void main(String[] args) {
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Rows:");
		int row=ip.nextInt();
		System.out.println("Enter Colunm:");
		int col=ip.nextInt();
		
		int[][] arr=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=ip.nextInt();
			}
		}
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
