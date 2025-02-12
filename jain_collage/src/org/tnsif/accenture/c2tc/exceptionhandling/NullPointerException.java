package org.tnsif.accenture.c2tc.exceptionhandling;

public class NullPointerException {

	public static void main(String[] args) {
	String str="welcome";
	try
	{
		System.out.println(str.length());
	}
	catch(Exception e)
	{
		System.out.println("NullPointerException caught");
	}
	finally
	{
		System.out.println("This line always gets executed");
	}
	}

}
