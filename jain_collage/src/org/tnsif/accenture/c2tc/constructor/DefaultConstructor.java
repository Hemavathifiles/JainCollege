package org.tnsif.accenture.c2tc.constructor;

class Myclass1
{
	String color;
	int age;
	String Brand;
	
	Myclass1()
	{
		color="Green";
		age=23;
		Brand="Maruthi";
	}

}

public class DefaultConstructor {

	public static void main(String[] args) {
		Myclass1 obj=new Myclass1();
		Myclass1 obj1=new Myclass1();
		System.out.println(obj.color + " "+obj.age+ " "+obj.Brand);
		System.out.println(obj1.color + " "+obj1.age+ " "+obj1.Brand);
	}

}
