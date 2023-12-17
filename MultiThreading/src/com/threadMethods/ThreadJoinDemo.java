package com.threadMethods;

public class ThreadJoinDemo extends Thread {

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " :" + i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e);
			}

		}
		System.out.println(Thread.currentThread().getName() + " has finished..........");
	}

	public static void main(String[] args) throws InterruptedException {

		ThreadJoinDemo t1 = new ThreadJoinDemo();
		t1.setName("First");

		ThreadJoinDemo t2 = new ThreadJoinDemo();
		t2.setName("Second");

		ThreadJoinDemo t3 = new ThreadJoinDemo();
		t3.setName("Third");

		t1.start();
		//t2.interrupt();// throws exception when in waiting
		t1.join();//t2 waits till t1 compltes
		t2.start();
		t2.join(2000);//t3 waits till t2 compltes
		t3.start();

	}
}
