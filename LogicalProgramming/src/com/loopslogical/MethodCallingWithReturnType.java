package com.loopslogical;

public class MethodCallingWithReturnType {
	
	static long factorialOfNumber(int n) {
		long fact=1;
		for(int i=1;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		long ans=factorialOfNumber(5);
		System.out.println("The Factorial Of 5 is : "+ans);
		
		ans=factorialOfNumber(7);
		System.out.println("The Factorial Of 7 is : "+ans);
		
		System.out.println("The Factorial of 9 is : "+factorialOfNumber(9));

	}

}
