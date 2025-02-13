package org.tnsif.accenture.c2tc.multithreadingdemo;

class MyRunnable implements Runnable
{

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" is running");
		
	}
	
}

public class ThreadConstructor {

	public static void main(String[] args) {
		//using thread() constructor
		Thread thread1=new Thread();
		thread1.setName("Thread 1");
		thread1.start();
		System.out.println("Thread name : "+thread1.getName());
		
		//using thread(string name) constructor
		
		Thread thread2=new Thread("Thread 2");
		thread2.start();
		System.out.println("Thread name : "+thread2.getName());
		
		//using thread(Runnable r) constructor
		MyRunnable myrunnable =new MyRunnable();
		Thread thread3=new Thread(myrunnable);
		thread3.start();
		
		//using Thread(Runnable r ,String s)
		Thread thread4=new Thread(myrunnable , "Thread 4");
		thread4.start();
		
	}

}
