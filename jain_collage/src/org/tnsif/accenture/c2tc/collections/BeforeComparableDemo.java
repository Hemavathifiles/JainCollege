package org.tnsif.accenture.c2tc.collections;

class Person
{
	String name;
	int age;
	
	Person(String name ,int age)
	{
		this.name=name;
		this.age=age;
	}
	void displayInfo()
	{
		System.out.println("Name "+name+" Age "+age);
	}
}


public class BeforeComparableDemo {

	public static void main(String[] args) {
		Person person=new Person("baskar",27);
		Person person1=new Person("akash",26);
		
	
		//display
		
		person.displayInfo();
		person1.displayInfo();
	}

}
