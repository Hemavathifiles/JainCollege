package org.tnsif.accenture.c2tc.static_final_demo;

class MathUtils
{
	public static int square(int number)
	{
		return number * number;
	}
	public static int add(int a ,int b)
	{
		return a+b;
	}
}

public class StaticMethodDemo {

	public static void main(String[] args) {
	int	result1=MathUtils.square(5);
	int	result2=MathUtils.add(2,6);
	System.out.println("Square of 5 -"+result1);
	System.out.println("Sum of 2 & 6 -"+result2);
	}

}
