package com.twoDArray;

import java.util.Scanner;

public class TransposeArray {
	
	static void transposeArray(int[][] arr, int row, int col) {
		
//		int[][] arr1=new int[col][row];
//		for(int i=0;i<col;i++) {
//			for(int j=0;j<row;j++) {
//				arr1[i][j]=arr[i][j];
//			}
//		}
		
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	static void maxMinOfEachColunm(int[][] arr, int row, int col) {
		int max=arr[0][0];
		int min=arr[0][0];
		for(int i=0;i<col;i++) {
			for(int j=0;j<row;j++) {
				if(arr[i][j]>max) {
					max=arr[i][j];
				}
				if(arr[i][j]<min) {
					min=arr[i][j];
				}
			}
			System.out.println("Maximum Element:"+max);
			System.out.println("Minimum Element:"+min);
		}
	}

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		
		int row=2;
		int col=3;
		int[][] arr=new int[row][col];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				arr[i][j]=ip.nextInt();
			}
		}
		
		transposeArray(arr, row, col);
		System.out.println("----------------");
		maxMinOfEachColunm(arr, row, col);

	}

}
