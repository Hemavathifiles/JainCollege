package org.tnsif.accenture.c2tc.oops;


class Animal2
{
	void eat()
	{
		System.out.println("Aninmal is eating");
	}
}

class Dog2 extends Animal2
{
	void bark()
	{
		System.out.println("dog is barking");
	}
}
class Cat extends Animal2
{
	void meow()
	{
		System.out.println("cat is meowing");
	}
}


public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		Dog2 dog=new Dog2();
		dog.eat();
		dog.bark();
		
		
		
		Cat cat=new Cat();
		cat.eat();
		cat.meow();
	}

}
