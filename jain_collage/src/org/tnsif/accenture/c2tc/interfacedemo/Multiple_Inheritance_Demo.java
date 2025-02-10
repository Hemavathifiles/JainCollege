package org.tnsif.accenture.c2tc.interfacedemo;


interface Printer
{
	void print(String message);
}
interface Scanner
{
	void scan(String Document);
}
class MultiFunc implements Printer,Scanner
{

	@Override
	public void scan(String Document) {
		System.out.println("Scanning :"+Document);
		
	}

	@Override
	public void print(String message) {
		System.out.println("Printing :" +message);
		
	}
	
}

public class Multiple_Inheritance_Demo {

	public static void main(String[] args) {
		MultiFunc obj=new MultiFunc();
		obj.print("Hello world");
		obj.scan("Document.pdf");

	}

}
