package org.tnsif.accenture.c2tc.multithreadingdemo;

class Eclipse4 extends Thread
{
	public void run()
	{
		System.out.println("Eclipse id is "+Thread.currentThread().getId());
	}
	
}
class Chrome4 extends Thread
{
	public void run()
	{
		System.out.println("Chrome id is " +Thread.currentThread().getId());
	}
	
}
class NoteBook4  extends Thread
{
	
	public void run() {
		
		System.out.println("NoteBook id is " +Thread.currentThread().getId());
	}
}


public class ThreadPriorityDemo {

	public static void main(String[] args) {
		Eclipse obj=new Eclipse();
		obj.setPriority(Thread.MIN_PRIORITY);
		obj.start();
		Chrome4 obj1=new Chrome4();
		obj1.setPriority(Thread.NORM_PRIORITY);
		obj1.start();
		NoteBook obj2=new NoteBook();
		obj2.setPriority(Thread.MAX_PRIORITY);
		obj2.start();
		

		
	}

}
