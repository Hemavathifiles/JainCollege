package org.tnsif.accenture.c2tc.scanner_buffer_demo;
import java.util.Scanner;
public class ScannerAllMethods {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=scan.nextLine();
		
		System.out.println("Enter your age");
		int age=scan.nextInt();
		
		System.out.println("Enter your Height");
		float height=scan.nextFloat();
		
		System.out.println("Are you a Student");
		boolean isstudent=scan.nextBoolean();
		
		System.out.println("Enter your aadhar number");
		long aadhar=scan.nextLong();
		
		
		System.out.println("Enter your favorite teacher");
		String teacher=scan.nextLine();
		scan.nextLine();
		
		System.out.println("Enter your CGPA");
		double cgpa=scan.nextDouble();
		
		System.out.println("Enter your daily reading time in minutes");
		byte readingtime=scan.nextByte();
		
		System.out.println("Enter no of siblings you have");
		short siblings=scan.nextShort();
		
		
		System.out.println("Student information");
		System.out.println("name "+ name);
		System.out.println("age "+ age);
		System.out.println("Height "+ height);
		System.out.println("isstudent " + isstudent);
		System.out.println("aadhar " + aadhar);
		System.out.println("teacher " + teacher);
		System.out.println("cgpa " +cgpa);
		System.out.println("readingtime "+ readingtime);
		System.out.println("siblings "+ siblings);
		scan.close();
	}

}
