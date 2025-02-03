package org.tnsif.accenture.c2tc.constructor;

class Myclass2
{
	String color;
	int age;
	String Brand;
	//Parameterized constuctor
	Myclass2(String color,int age,String Brand)
	{
		this.color=color;
		this.age=age;
		this.Brand=Brand;
	}	
}
public class ParameterizedConstructor {
	public static void main(String[] args) {
		Myclass2 obj=new Myclass2("White",2000,"BMW");
		Myclass2 obj1=new Myclass2("Black",3000,"Audi");
		
		System.out.println(obj.color + " "+obj.age +" "+obj.Brand);
		System.out.println(obj1.color + " "+obj1.age +" "+obj1.Brand);

	}

}
