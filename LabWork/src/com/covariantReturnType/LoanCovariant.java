package com.covariantReturnType;

class Loan{
	String s="Loan is Provided";
}

class HomeLoan extends Loan{
	String s="Home Loan Provided";
}

class EducationLoan extends Loan{
	String s="Education Loan Provided";
}

class CarLoan extends Loan{
	String s="Car Loan Provided";
}

class Bank{
	
	Loan provideLoan() {
		return new Loan();
	}
}

class HDFCBank extends Bank{
	
	@Override
	CarLoan provideLoan() {
		
		return new CarLoan();
	}
}

class ICICIBank extends Bank{
	
	@Override
	HomeLoan provideLoan() {
		return new HomeLoan();
	}
}

class SBI extends Bank{
	
	@Override
	EducationLoan provideLoan() {
		return new EducationLoan();
	}
}

public class LoanCovariant {

	public static void main(String[] args) {
		
		Bank b1=new Bank();
		Loan l=b1.provideLoan();
		System.out.println(l.s);
		
		Bank b;
		
		b=new HDFCBank();
		CarLoan c=(CarLoan) b.provideLoan();
		System.out.println(c.s);
		
		b=new ICICIBank();
		HomeLoan h=(HomeLoan) b.provideLoan();
		System.out.println(h.s);
		
		b=new SBI();
		EducationLoan e=(EducationLoan) b.provideLoan();
		System.out.println(e.s);

	}

}
