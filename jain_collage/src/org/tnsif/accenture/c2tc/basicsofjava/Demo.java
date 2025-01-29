package org.tnsif.accenture.c2tc.basicsofjava;
class Human
{
	private int age;
	private String name;
	
	public void setAge(int age) { //setAge(12);
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}	
}
public class Demo {
public static void main(String[] args) {
		Human obj=new Human();
		obj.setAge(12);
		obj.setName("Neha");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
		obj.setAge(33);
		obj.setName("Sushma");
		System.out.println(obj.getAge());
		System.out.println(obj.getName());
		
	}

}
