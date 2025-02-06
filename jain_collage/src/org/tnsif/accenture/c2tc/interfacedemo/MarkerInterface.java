package org.tnsif.accenture.c2tc.interfacedemo;

public class MarkerInterface {

	public static void main(String[] args) {
	 
		Registrable s=new Student(101,"Neha",12000,"Java");
		Registrable s1=new Student(102,"Akash",14000,"Java");
		Object obj=new Object();
		
		if(s1 instanceof Registrable)
		{
			System.out.println("Student is registered for the course");
		}
		else
		{
			System.out.println("Student is not registered for the course");
		}
	}

}
