package org.tnsif.accenture.c2tc.interfacedemo;

interface Vehicle
{
	 void start();
     void stop();
 
     int Max_Speed=100;
	
}

class Car5 implements Vehicle
{

	private String model;
	
	
	public Car5(String model) {
		super();
		this.model = model;
	}

	@Override
	public void start() {
		System.out.println("Car " +model + " is starting" );
		
	}

	@Override
	public void stop() {
		System.out.println("Car " +model + "  is stopping");
		
	}
	
}


public class InterfaceDemo {

	public static void main(String[] args) {
		Vehicle obj=new Car5("BMW");
		 obj.start();
		 obj.stop();
		
		 System.out.println("Maximum speed for vehicles "+Vehicle.Max_Speed );

	}

}
