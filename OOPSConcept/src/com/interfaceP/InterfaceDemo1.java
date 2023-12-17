package com.interfaceP;

interface TaxPay{
	
	String cName="India";
	
	void taxAmount();
}

class Celebrity implements TaxPay{
	
	String celeName;
	float income;
	
	Celebrity(){
		
	}
	
	Celebrity(String celeName, float income){
		super();
		this.celeName=celeName;
		this.income=income;
	}

	@Override
	public void taxAmount() {
		System.out.println("Celebrity's Tax Amount is:"+(0.2*income));
		
	}
}

class Employee implements TaxPay{
	
	String eName;
	float salary;
	
	Employee(){
		
	}
	
	Employee(String eName, float salary){
		super();
		this.eName=eName;
		this.salary=salary;
	}

	@Override
	public void taxAmount() {
		if(salary>500000) {
			System.out.println("Employee's Amount of Tax is:"+(0.1*salary));
		}
		else {
			System.out.println("Tax Free.");
		}
		
	}
}

public class InterfaceDemo1 {

	public static void main(String[] args) {
		Celebrity c1=new Celebrity("HritikRoshan", 5000000);
		c1.taxAmount();
		
		System.out.println("--------------------------");
		
		Employee e1=new Employee("Aniket", 1000000);
		e1.taxAmount();

	}

}
