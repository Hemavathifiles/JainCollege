package org.tnsif.accenture.c2tc.interfacedemo;

class GreetingImp implements InterfaceDemo2
{

	@Override
	public void sayHello(String name) {
		System.out.println("Hello "+name);
		
	}
	
}

public class FunctionalInterface {

	public static void main(String[] args) {
		InterfaceDemo2 obj=new GreetingImp();
		obj.sayHello("Alice");

	}

}
