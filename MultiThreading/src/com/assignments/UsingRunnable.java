package com.assignments;

//2.Create thread by implementing runnable interface.
public class UsingRunnable implements Runnable{
	
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+"-->"+i);
		}
		
	}

	public static void main(String[] args) {
		
		UsingRunnable obj=new UsingRunnable();
		
		Thread t=new Thread(obj);
		t.start();

	}

}
