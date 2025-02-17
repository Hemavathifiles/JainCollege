package org.tnsif.accenture.c2tc.collections;

import java.util.List;
import java.util.Vector;

public class VectorDemo2 {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> number=new Vector<>();
		
		//Thread 1 : adds elements to the vector
		Thread thread1=new Thread(()->{
		for(int i=1;i<5;i++)
		{
		number.add(i);
		System.out.println("Thread 1 added :" + i);
		}
	});

	
	//Thread 2 " Remove elements from the vector
		Thread thread2=new Thread(()->
		{
			for(int i=1;i<5;i++)
			   {
				   if(!number.isEmpty())
				   {
					   System.out.println("Thread 2 removed "+number.remove(0));
				   }
			   }
		});
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println("Numbers left in the vector " +number);
	}   
}
