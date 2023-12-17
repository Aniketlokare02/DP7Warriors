package com.coupling;

interface MessageS{
	
	void sendMessage(String msg);
	
}

class WhatsApp implements MessageS{
	
	String type;

	@Override
	public void sendMessage(String msg) {
		this.type="WhatsApp";
		System.out.println(type+":"+msg);
		
	}
	
}

class Telegram implements MessageS{
	
	String type;

	@Override
	public void sendMessage(String msg) {
		this.type="Telegram";
		System.out.println(type+":"+msg);
		
	}
	
}

public class LooselyCoupling {
	
	public void messageType(MessageS m) {
		
		m.sendMessage("Welcome");
		
	}

	public static void main(String[] args) {
		
		LooselyCoupling t=new LooselyCoupling();
		
		WhatsApp w=new WhatsApp();
		t.messageType(w);
		
		Telegram t1=new Telegram();
		t.messageType(t1);
		

	}

}
