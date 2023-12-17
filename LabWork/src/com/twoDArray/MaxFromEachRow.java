package com.twoDArray;

import java.util.Scanner;

public class MaxFromEachRow {
	
	static void maxMinFromEachRow(int[][] arr, int row, int col) {
		int max=arr[0][0];
		int min=arr[0][0];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
			}
			System.out.println("Max Element:"+max);
			System.out.println("Min Element:"+min);
		}
		//System.out.println("Max Element:"+max);
		//System.out.println("Min Element:"+min);
	}

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		System.out.println("Enter Rows:");
		int row=ip.nextInt();
		System.out.println("Enter Colunm:");
		int col=ip.nextInt();
		
		int[][] arr=new int[row][col];
		System.out.println("Enter Array Element:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=ip.nextInt();
			}
		}
		
		maxMinFromEachRow(arr, row, col);

	}

}
