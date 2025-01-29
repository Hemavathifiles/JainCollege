package org.tnsif.accenture.c2tc.oops;

public class AbsDemo {

	public static void main(String[] args) {
		MaheshDemo obj=new SureshDemo();
		obj.calling();
		obj.AiIntegration();
		obj.SatelliteConn();
		obj.HealthMonitoring();

	}

}

abstract class MaheshDemo    //2023
{
	public void calling() //concrete method
	{
		System.out.println("calling");
	}
	public abstract void AiIntegration(); //abstract method
	public abstract void SatelliteConn();
	public abstract void HealthMonitoring();
}

abstract class  RameshDemo   extends  MaheshDemo     //2024
{
	public  void AiIntegration()
	{
		System.out.println("Phone is integrated with AI");
	}

	
}
class SureshDemo extends  RameshDemo  //2025
{

	@Override
	public void SatelliteConn() {
		System.out.println("Phone is connected with SatelliteConn ");
		
	}

	@Override
	public void HealthMonitoring() {
		
		System.out.println("Phone is integrated with  HealthMonitoring ");
	}
	
}