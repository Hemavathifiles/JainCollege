package org.tnsif.accenture.c2tc.oops;


class Animal3
{
	void makeSound()
	{
		System.out.println("Animal makes a sound");
	}
}

class Dog3 extends Animal3
{
	void makeSound()
	{
		System.out.println("Dog barks");
	}
}
class Cat3 extends Animal3
{
	void makeSound()
	{
		System.out.println("Cat meow");
	}
}

public class MethodOverrideDemo {

	public static void main(String[] args) {
		Animal3 animal=new Animal3();
		Dog3 dog=new Dog3();
		Cat3 cat=new Cat3();
		
		animal.makeSound();
		dog.makeSound();
		cat.makeSound();
	}

}
