package org.tnsif.accenture.c2tc.basicsofjava;

public class KIA_Motors {
	
			String noCar;
			String model;
			int speed=100;
	
	
	void start()
	{
		System.out.println("vehical is started");
	}
	
	void stop()
	{
		System.out.println("vehical is stopped");
	}

	public static void main(String[] args) {
		KIA_Motors d1=new KIA_Motors();
		
		d1.noCar="KA1999";
		d1.model="KIA_sonet";
		System.out.println(d1.noCar);
		System.out.println(d1.model);
		System.out.println(d1.speed);
		d1.start();
		d1.stop();

	}

}
