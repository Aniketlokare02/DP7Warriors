package com.arrayOfObject;

public class School1 {
	
	static float calcPercentage(Student1 s)
	{
		float m[]= s.getMarks();
		float total=0;
		for(float m1:m)
		{
			total+=m1;
		}
		
		float per= (total/500)*100;
		return per;
	}

	public static void main(String[] args) {
		
		Student1[] arr=new Student1[3];
		
		float m1[]={67.4f,89.5f,90.6f};
		arr[0]= new Student1(101, "Aniket",m1);
		
		float m2[]={78.4f,80.5f,99.6f};
		arr[1]= new Student1(102, "Hrishikesh",m2);
		
		float m3[]={77.4f,85.5f,93.6f};
		arr[2]= new Student1();
		arr[2].setId(103);
		arr[2].setName("Suraj");
		arr[2].setMarks(m3);
		for (Student1 s : arr) {
			System.out.println(s);
		}
		System.out.println("------------------------------");
		for(Student1 s:arr)
		{
			System.out.println(s.getId()+" "+s.getName()+" "+calcPercentage(s));
		}

	}

}
