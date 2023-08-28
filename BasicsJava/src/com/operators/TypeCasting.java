package com.operators;

public class TypeCasting {
	public static void main(String[] args) {
		// -128 to 127
		byte num1 = 70;
		byte num2 = 90;

		// all math operation returns min int
		// casting
		byte sum = (byte) (num1 + num2);

		short s1 = 50;
		short s2 = 60;
		short r = (short) (s1 + s2);

		System.out.println(sum);

		System.out.println(r);

		float n1 = 75.5f;
		float n2 = 45.6f;

		float res = n1 + n2;

		int a = 90;
		int b = 45;

		float ans = a + b;

		System.out.println(ans);

		int result = (int) (n1 + n2);
		System.out.println(result);

	}
}
