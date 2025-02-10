package org.tnsif.accenture.c2tc.interfacedemo;

interface Vehicle2
{
	void start();
	void stop();
}
interface ElectricVehicle extends Vehicle2
{
	void chargeBattery();
}
class Telsa implements ElectricVehicle
{

	@Override
	public void start() {
		System.out.println("Telsa starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Telsa stopping");
		
	}

	@Override
	public void chargeBattery() {
		System.out.println("Battery is charging");
		
	}
	
}

public class Interface_To_Interface_Demo {

	public static void main(String[] args) {
		Telsa obj=new Telsa();
		obj.start();
		obj.stop();
		obj.chargeBattery();

	}

}
