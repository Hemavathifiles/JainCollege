package org.tnsif.accenture.c2tc.ExceptionHandling;

public class App {

	public static void main(String[] args) {
		int number_one =50/5;
		System.out.println(number_one); //10
		int number_two=50/10;
		System.out.println(number_two); //5
		try {
			int number_three=50/0;
			System.out.println(number_three); //exception 
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		 
		int number_four=50/25;
		System.out.println(number_four); //this part will not get exec

	}

}
