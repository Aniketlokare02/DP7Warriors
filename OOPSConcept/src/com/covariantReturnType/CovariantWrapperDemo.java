package com.covariantReturnType;

class First {
	Number value;

	Object displayValue() {
		return value;
	}

}

class Second extends First {

	Integer myVal;

	Integer displayValue() {
		myVal = 20;
		return myVal;
	}

}

class Third extends First {

	Character ch;

	Character displayValue() {
		ch = 'A';
		return ch;
	}

}

public class CovariantWrapperDemo {

	public static void main(String[] args) {

		First f = new First();
		f.value = 89;
		System.out.println("Value is:" + f.displayValue());

		Second s1 = new Second();
		System.out.println("Value is :" + ((int) (s1.displayValue()) + 10));

		Second s2 = new Second();
		System.out.println("Value is :" + (s2.displayValue() + 10));

	}
}
