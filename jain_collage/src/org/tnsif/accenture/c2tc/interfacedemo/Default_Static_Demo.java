package org.tnsif.accenture.c2tc.interfacedemo;


interface Vehicle1
{
	public abstract void start();
	public abstract void stop();
	
	static final int Max_speed=120;
	
	default void repair()
	{
		System.out.println("Vehicle is being repaired");
	}
	static void checkMaintaince()
	{
		System.out.println("Vehicle Maintaince check complete ");
	}
}
class Car6 implements Vehicle1
{
	private String model;
	
	
	
	public Car6(String model) {
		super();
		this.model = model;
	}

	@Override
	public void start() {
		System.out.println("car "+model+" is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("car "+model+ " is stopped");
		
	}
	
}
public class Default_Static_Demo {

	public static void main(String[] args) {
		Vehicle1 car=new Car6("KIA");
		
		car.start();
		car.stop();
		System.out.println("Maximum speed of vehicle"+ Vehicle1.Max_speed);
		car.repair();
		Vehicle1.checkMaintaince();
		
		
	}

}
