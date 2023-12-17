package com.labwork;

import java.util.Scanner;

public class PrimeDigitFromNumber {

	static void primeDigit(long num) {
		while (num != 0) {
			long rem = num % 10;
			if (rem == 0 || rem == 1) {
				break;
			}
			else {
				boolean flag = true;
				for (int i = 2; i <= rem / 2; i++) {
					if (rem % i == 0) {
						flag = false;
					}
				}
				if (flag == true) {
					System.out.println(rem + " is Prime Digit.");
				}
			}
			num /= 10;
		}
	}

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter The Number:");
		long num = ip.nextLong();

		primeDigit(num);

	}

}
