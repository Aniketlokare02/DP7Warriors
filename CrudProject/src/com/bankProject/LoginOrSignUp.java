package com.bankProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LoginOrSignUp {

	public static void main(String[] args) {
		
		Scanner ip=new Scanner(System.in);
		Integer accNo;

		Map<Integer, User> user=new HashMap<>();
		user.put(1234567890, new User("AniketLokare", 555674167216l, "APGPL2603B", "aniketlokare02@gmail.com", 9740943250l, "Manjariwadi-Karnataka", new Account("Savings", 10000f)));
		user.put(231456788, new User("Hrishikesh", 254532542365l, "BGSG5201L", "hrishikokate@gmail.com", 9854214523l, "Nashik-Maharashtra", new Account("Savings", 15000f)));
		
		while(true) {
			
			System.out.println("1.SignUp\n2.LogIn");
			int choice=ip.nextInt();
			switch(choice) {
			case 1: System.out.print("Enter User Name:");
					String uName=ip.next();
					
					System.out.print("Enter Adhar No:");
					long adharNo=ip.nextLong();
					
					System.out.print("Enter Pan Number:");
					String panNo=ip.next();
					
					System.out.print("Enter Email Address:");
					String email=ip.next();
					
					System.out.print("Enter Mobile Number:");
					long phoneNo=ip.nextLong();
					
					System.out.print("Enter Address:");
					String address=ip.next();
					
					System.out.print("Enter Account Type:");
					String accType=ip.next();
					
					System.out.println("Enter Amount Want to Deposite:");
					float balance=ip.nextFloat();
					
					System.out.print("Enter Account Number:");
					accNo=ip.nextInt();
					
					user.put(accNo, new User(uName, adharNo, panNo, email, phoneNo, address, new Account(accType, balance)));
				break;
				
			case 2: System.out.print("Enter Account Number:");
					accNo=ip.nextInt();
					
					System.out.print("Enter User Name:");
					String name=ip.next();
					
					for(Map.Entry<Integer, User> e : user.entrySet()) {
						
						if(e.getKey()==accNo && e.getValue().getUserName().equals(name)) {
							System.out.println();
							System.out.println("Account No:"+e.getKey());
							System.out.println("User Details:"+e.getValue());
							System.out.println();
						}
					}
			}
		}
		
	}
}
