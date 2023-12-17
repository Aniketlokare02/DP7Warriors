package com.staticKeyWord;

class Employee {
	
	private int eId;
	private String eName;
	private float salay;
	static String cName;
	static int count;
	
	static{
		cName="TCS";
		count=0;
	}
	
	{
		count++;
	}
	
	Employee(){
		
	}
	
	Employee(int eId, String eName, float salary){
		this.eId=eId;
		this.eName=eName;
		this.salay=salay;
	}
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}

	public float getSalay() {
		return salay;
	}
	public void setSalay(float salay) {
		this.salay = salay;
	}

	public static String getcName() {
		return cName;
	}
	public static void setcName(String cName) {
		Employee.cName = cName;
	}

	static void changeCompanyName(String comName) {
		cName=comName;
	}

	@Override
	public String toString() {
		return "Employee Id=" + eId + ", Employee Name=" + eName + ", Employee salay=" + salay+" Company Name="+cName;
	}

}

public class Company{
	public static void main(String[] args) {
		
		Employee e1=new Employee(101, "Aniket", 25000);
		Employee e2=new Employee(102, "Hrishikesh", 15000);
		Employee e3=new Employee(103, "Suraj", 20000);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println("Number Of Employee Working in Company:"+Employee.count);
		
		System.out.println("------------------------------------------");
		Employee.changeCompanyName("ThinkQuotient");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		
	}
}
