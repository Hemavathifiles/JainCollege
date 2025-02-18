package org.tnsif.accenture.c2tc.collections;

import java.util.ArrayList;
import java.util.Collections;

class Person2 implements Comparable<Person2>
{
	
	String name;
	int age;
	
	public Person2(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

    void displayInfo()
    {
    }

	@Override
	public int compareTo(Person2 o) {
		
		return this.age-o.age;
	}
	
	
}


public class ComparableDemo {

	public static void main(String[] args) {
		ArrayList<Person2> people=new ArrayList<>();
		people.add(new Person2("John",10));
		people.add(new Person2("Akash",26));
		people.add(new Person2("Baskar",27));
		
		Collections.sort(people); //sorts by age
		
		for(Person2 person:people)
		{
			person.displayInfo();
		}

	}

}
