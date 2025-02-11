package org.tnsif.accenture.c2tc.Scanner_Buffer_Demo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException{
		try
		{
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\hemav\\OneDrive\\Desktop\\Java training Notes\\demo1.txt"));
			String data="";
			while((data=br.readLine())!=null)
			{
				System.out.println(data);
			}
		}catch(Exception e)
		{
			System.out.println(e);
		
		}
		

	}

}
