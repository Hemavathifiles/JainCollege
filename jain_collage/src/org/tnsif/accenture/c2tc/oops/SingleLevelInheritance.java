package org.tnsif.accenture.c2tc.oops;

class Animal
{
	String name="Animal";
	
	void eat()
	{
		System.out.println(name+" is eating");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println(name + "is barking");
	}
}



public class SingleLevelInheritance {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.eat();
		dog.bark();
	}

}
