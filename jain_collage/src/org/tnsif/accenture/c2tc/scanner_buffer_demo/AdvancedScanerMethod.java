package org.tnsif.accenture.c2tc.scanner_buffer_demo;
import java.util.Scanner;
public class AdvancedScanerMethod {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter some data( you can enter numbers or text)");
		while(scan.hasNext())
			if(scan.hasNextInt())
			{
				 int intvalue=scan.nextInt();
				 System.out.println("read an integer "+intvalue);
			}
			else if(scan.hasNextDouble())
			{
				double doublevalue=scan.nextDouble();
				System.out.println("read an double" +doublevalue );
			}
			else
			{
				String stringvalue=scan.next();
				System.out.println("unknown input" +stringvalue );
			}
		
	}

}
