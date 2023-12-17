package com.synchronization;

class Message{
	
	public void processMessage(String msg) {
		
		System.out.println("Sending:"+msg);
		
		try {
			Thread.sleep(500);
		} 
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Recieved:"+msg);
	}
}

public class SynchronizedBolck {

	public static void main(String[] args) {
		
		Message m=new Message();
		
		Thread t1=new Thread()
				{
					public void run() {
						System.out.println(Thread.currentThread().getName());
						System.out.println("--------");
						System.out.println("Welcome : "+Thread.currentThread().getName());
						
						synchronized (m) {
							m.processMessage("Please Pay The Fees.");
						}
					}
				};
				
		Thread t2=new Thread()
				{
					public void run() {
						System.out.println(Thread.currentThread().getName());
						System.out.println("--------");
						System.out.println("Welcome : "+Thread.currentThread().getName());
						
						synchronized (m) {
							m.processMessage("Welcome To Cultural Fest.");
						}
					}
				};
				
		t1.start();
		t2.start();

	}

}