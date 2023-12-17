package com.loopslogical;

public class CheckPrimeOrNotWithMethodCalling {

	static boolean primeNumber(int n) {
		boolean flag = true;
		if (n == 0 || n == 1) {
			flag = false;
		} 
		else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		
		boolean status;
		
		System.out.println("Prime Numbers From 1 to 50");
	
		for(int i=1;i<=50;i++) {
			 status=primeNumber(i);
			 if(status==true) {   // if(status)
					System.out.println(i);
				}
		}
		
	}

}
