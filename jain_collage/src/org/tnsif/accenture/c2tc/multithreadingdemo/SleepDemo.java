package org.tnsif.accenture.c2tc.multithreadingdemo;

class Eclipse2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Eclipse thread id is " + Thread.currentThread().getId());
			try
			{
				sleep(1000);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

public class SleepDemo {

	public static void main(String[] args) {
		Eclipse2 obj=new Eclipse2();
		obj.start();

	}

}
