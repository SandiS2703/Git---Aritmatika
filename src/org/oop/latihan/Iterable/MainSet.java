package org.oop.latihan.Iterable;

import java.util.Set;
import java.util.LinkedHashSet;

public class MainSet {
	public static void main(String[] args) {
		Set<String> fruits = new LinkedHashSet<String>();
		fruits.add("Apple");
		fruits.add("Manggo");
		fruits.add("Banana");
		fruits.add("Orange");
		
		fruits.forEach(fruit -> System.out.println(fruit));
	}

}
