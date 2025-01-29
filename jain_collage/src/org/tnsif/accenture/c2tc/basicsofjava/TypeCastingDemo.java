package org.tnsif.accenture.c2tc.basicsofjava;

public class TypeCastingDemo {

	public static void main(String[] args) {
		//implict casting
		
		 byte b=127;
		 int i=b;
		 System.out.println(i);
		 
		 float f1=22.14f;
		 double d1=f1;
		 System.out.println(d1);
		 
		 //explict casting
		 
		 double d2=10.53d;
		 long l = (long)d2;
		 System.out.println(l);
		 
		 float f2=34.56f;
         int li=(int)f2;
	     System.out.println(li);

	}

}
