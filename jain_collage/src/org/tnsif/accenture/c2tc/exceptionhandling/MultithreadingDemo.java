package org.tnsif.accenture.c2tc.exceptionhandling;

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
		Chrome obj1=new Chrome();
		obj1.start();
		NoteBook obj2=new NoteBook();
		obj2.start();
		System.out.println("Main thread id is " +Thread.currentThread().getId());
	}

}
