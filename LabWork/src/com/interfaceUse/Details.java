package com.interfaceUse;

interface Bank{
	
	void show();
	
	interface Locker{
		
		void showLocker();
	}
}

class HDFC implements Bank, Bank.Locker{

	@Override
	public void show() {
		System.out.println("Its HDFC Bank.");
	}

	@Override
	public void showLocker() {
		System.out.println("HDFC Bank Will Provide Lockers.");
	}
	
}

public class Details {

	public static void main(String[] args) {
		
		HDFC h=new HDFC();
		h.show();
		h.showLocker();

	}

}
