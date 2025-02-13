package org.tnsif.accenture.c2tc.multithreadingdemo;

class Eclipse extends Thread
{
	public void run()
	{
		System.out.println("Eclipse id is "+Thread.currentThread().getId());
	}
	
}
class Chrome extends Thread
{
	public void run()
	{
		System.out.println("Chrome id is " +Thread.currentThread().getId());
	}
	
}
class NoteBook  extends Thread
{
	
	public void run() {
		
		System.out.println("NoteBook id is " +Thread.currentThread().getId());
	}
}


public class MultithreadingDemo {

	public static void main(String[] args) {
		Eclipse obj=new Eclipse();
		obj.start();
		NoteBook obj1=new NoteBook();
		obj1.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Main thread id is " +Thread.currentThread().getId());
		}
		
	}

}
