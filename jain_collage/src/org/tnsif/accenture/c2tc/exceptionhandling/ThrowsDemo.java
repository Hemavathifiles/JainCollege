package org.tnsif.accenture.c2tc.exceptionhandling;

import java.io.IOException;

public class ThrowsDemo {

	//akash
	void m1()
	{
		System.out.println("NO exception in this method");
	}
	//Amulya
	void m2() throws IOException
	{
		throw new IOException ("IOException");
	}
	
	//navya
	void m3() throws ArithmeticException ,IOException ,ClassNotFoundException
	{
		System.out.println("Device error");
	}
	
	public static void main(String[] args) {
		ThrowsDemo obj=new ThrowsDemo ();
		obj.m1();
		
		try
		{
			obj.m2();
		}catch(IOException e)
		{
			System.out.println("Caught exception in m2 " + e.getMessage());
		}
		
		try
		{
			obj.m3();
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}catch(IOException e)
		{
			System.out.println(e);
		}catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		
	}

}
