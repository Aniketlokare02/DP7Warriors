package com.coupling;

interface MessageSer{
	
	void sendMessage(String msg);
	
}

class WhatsApp1 implements MessageSer{
	
	String type;

	@Override
	public void sendMessage(String msg) {
		this.type="WhatsApp";
		System.out.println(type+":"+msg);
		
	}
	
}

class Telegram1 implements MessageSer{
	
	String type;

	@Override
	public void sendMessage(String msg) {
		this.type="Telegram";
		System.out.println(type+":"+msg);
		
	}
	
}

public class TightlyCoupling {
	
	public void messageType(WhatsApp w) {
		
		w.sendMessage("Welcome");
		
	}

	public static void main(String[] args) {
		
		TightlyCoupling t=new TightlyCoupling();
		
		WhatsApp w=new WhatsApp();
		t.messageType(w);
		
		Telegram t1=new Telegram();
		//t.messageType(t1);
		

	}

}
