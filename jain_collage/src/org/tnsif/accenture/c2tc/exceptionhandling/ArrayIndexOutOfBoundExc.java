package org.tnsif.accenture.c2tc.exceptionhandling;

public class ArrayIndexOutOfBoundExc {

	public static void main(String[] args) {
	  int[]  arr=new int[4]; //0 1 2 3
	  System.out.println("Welcome");
	  try
	  {
	  int i =arr[8];
	  System.out.println();
	}catch(ArrayIndexOutOfBoundsException e)
	  {
		System.out.println(e);
	  }
	  finally
	  {
		  System.out.println("this line will get printed always");
	  }

}
}