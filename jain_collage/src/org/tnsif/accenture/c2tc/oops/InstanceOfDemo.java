package org.tnsif.accenture.c2tc.oops;

class Person
{
	
}
class Employee extends Person
{
	
}

class Manager extends Employee
{
	
}
public class InstanceOfDemo {

	public static void main(String[] args) {
		Person person=new Person();
		Employee employee=new Employee();
		Manager manager=new Manager();
		System.out.println(employee instanceof Employee); //true
		System.out.println(employee instanceof Person); //true
		System.out.println(employee instanceof Manager); //false
		System.out.println(manager instanceof Manager); //true
		System.out.println(manager instanceof Employee); //true
		System.out.println(manager instanceof Person); //true
		System.out.println(person instanceof Person);//true
		System.out.println(person instanceof Employee); //false
		System.out.println(person instanceof Manager); //false
	}

}
