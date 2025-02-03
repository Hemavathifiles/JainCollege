package org.tnsif.accenture.c2tc.constructor;

class Myclass
{
	String color;
	int age;
	String Brand;
}
public class BeforeConstructor {

	public static void main(String[] args) {
		Myclass obj=new Myclass();
		obj.age=12;
		obj.color="pink";
		obj.Brand="Maruthi";
		System.out.println(obj.color + " "+obj.age+ " "+obj.Brand);

	}

}
