package org.tnsif.accenture.c2tc.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetDemo {

	public static void main(String[] args) {
		Set<String> set=new LinkedHashSet<>();
		set.add("cheery");
		set.add("banana");
		set.add("apple");
		set.add(null);
		set.add("apple");
		
		System.out.println(" LinkedHashSet "+set);

	}

}
