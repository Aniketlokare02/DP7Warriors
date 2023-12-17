package com.interfaceP;

interface Message{
	
	void sendMessage();
}

class Text implements Message{

	@Override
	public void sendMessage() {
		System.out.println("It's a Text Message.");
	}
	
}


class WhatsApp implements Message{

	@Override
	public void sendMessage() {
		System.out.println("Its a WhatsApp Message.");
	}
	
}

class Instagram implements Message{

	@Override
	public void sendMessage() {
		System.out.println("Its a Instagram Message.");	
	}
	
}
public class MainClass1 {

	public static void main(String[] args) {
		
		Message m;
		m=new Text();
		m.sendMessage();
		System.out.println("--------------------------");
		
		m=new WhatsApp();
		m.sendMessage();
		System.out.println("--------------------------");
		
		m=new Instagram();
		m.sendMessage();

	}

}
