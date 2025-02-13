package org.tnsif.accenture.c2tc.multithreadingdemo;

class Eclispe1 implements Runnable
{

	@Override
	public void run() {
		for(int i=0;i<=5;i++)
		{
			System.out.println("Eclipse ID is "+Thread.currentThread().getId());
		}
		
	}
	
}


public class MulithreadingDemo2 {

	public static void main(String[] args) {
		Eclispe1 obj=new Eclispe1();
		Thread obj1=new Thread(obj);
		obj1.start();
	}

}
