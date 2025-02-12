package org.tnsif.accenture.c2tc.exceptionhandling;

public class ThrowDemo {

	void Validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("You are not eligible");
		}
		else
		{
			System.out.println("You are eligible");
		}
	}
	
	public static void main(String[] args) {
		ThrowDemo obj=new ThrowDemo ();
		obj.Validate(10);

	}

}
