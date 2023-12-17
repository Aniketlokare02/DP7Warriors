package com.interThreadComm;

class SharedR {

	public synchronized void methodOne() {

		System.out.println(Thread.currentThread().getName() + " has Locked Method One.");
		System.out.println(Thread.currentThread().getName() + " has Released Method One.");

		try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + " has Finished The Task.");
	}

	public synchronized void methodTwo() {

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		notify();

		System.out.println(Thread.currentThread().getName() + " has Notified.");
	}
}

public class InterThreadComm {

	public static void main(String[] args) {
		SharedR s=new SharedR();
		
		Thread t1=new Thread()
				{
					public void run() {
						s.methodOne();
					}
				};
				
		Thread t2=new Thread()
				{
					public void run() {
						s.methodTwo();
					}
				};
				
		t1.start();
		t2.start();

	}

}
