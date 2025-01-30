package org.tnsif.accenture.c2tc.oops;

class Animal4
{
	void makeSound()
	{
		System.out.println("Animal makes a sound");
		System.out.println("welcome");
	}
}


class Dog4 extends Animal4
{
	void makeSound()
	
	{
		super.makeSound();
		System.out.println("Dog is barking");
	}
}

public class SuperMethodDemo {

	public static void main(String[] args) {
		Dog4  dog=new Dog4();
		dog.makeSound();

	}

}
