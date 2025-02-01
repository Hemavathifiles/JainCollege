package org.tnsif.accenture.c2tc.oops;

class MethodOverload
{
	public int add(int a, int b)
	{
		return a+b;
	}
	public int add(int a,int b ,int c)
	{
		return a+b+c;
	}
	public double add(int a,double b)
	{
		return a+b;
	}
}

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		MethodOverload obj=new MethodOverload();
		System.out.println(obj.add(2, 3));
		System.out.println(obj.add(3, 3,3));
		System.out.println(obj.add(12,6.7));
	}

}
