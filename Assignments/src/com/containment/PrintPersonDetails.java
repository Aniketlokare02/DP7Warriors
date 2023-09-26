package com.containment;

class Address {
	
	private String city;
	private String state;
	private String country;
	
	Address(){
		
	}
	
	Address(String city, String state, String country){
		this.city=city;
		this.state=state;
		this.country=country;
	}

	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "\nCity=" + city + ", State=" + state + ", Country=" + country;
	}
	
}

class Person {
	
	private String name;
	private String gender;
	private int age;
	private Address address;
	
	Person(){
		
	}
	
	Person(String name, String gender, int age, Address address){
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.address=address;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person Details\nName=" + name + ", Gender=" + gender + ", Age=" + age + address;
	}

}

public class PrintPersonDetails{
	
	public static void main(String[] args) {
		
		Address a1=new Address("Manjariwadi", "Karnataka", "India");
		Address a2=new Address("Nashik", "Maharashtra", "India");
		
		Person p1=new Person("Aniket", "Male", 23, a1);
		Person p2=new Person("Hrishikesh", "Male", 23, a2);
		
		System.out.println(p1);
		System.out.println("------------------------------------------------");
		System.out.println(p2);
		System.out.println("------------------------------------------------");
		
		Person p3=new Person();
		p3.setName("Suraj");
		p3.setGender("Male");
		p3.setAge(23);
		p3.setAddress(new Address());
		p3.getAddress().setCity("Palus");
		p3.getAddress().setState("Maharashtra");
		p3.getAddress().setCountry("India");
		
		System.out.println(p3);
		
	}
	
}
