package org.tnsif.accenture.c2tc.collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Set<String> set=new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("cherry");
		set.add(null);
		
		System.out.println("HashSet :" +set);

	}

}
