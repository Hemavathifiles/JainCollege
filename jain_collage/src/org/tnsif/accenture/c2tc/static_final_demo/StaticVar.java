package org.tnsif.accenture.c2tc.static_final_demo;

public class StaticVar {
	
	
	String name;//instance var
	double price;//instance var
	public static String category="Smart Phone"; //static var
	
	public StaticVar(String name,double price)
	{
		this.name=name;
		this.price=price;
	}

	public void displaydetails()
	{
		System.out.println("Name :"+name);
		System.out.println("Price :"+price);
		System.out.println("Category :"+category);
		System.out.println();
	}
	public static void main(String[] args) {
		StaticVar obj=new StaticVar("oppo",12000);
		StaticVar obj1=new StaticVar("samsung",19000);
		
		System.out.println("Mobile 1 Details");
		obj.displaydetails();
		
		System.out.println("Mobile 2 Details");
		obj1.displaydetails();
	}

}
