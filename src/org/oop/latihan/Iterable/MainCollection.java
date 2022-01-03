package org.oop.latihan.Iterable;

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class MainCollection {
	public static void main(String[] args) {
		Collection<String> fruits = new ArrayList<String>();
		/*fruits.add("Apple");
		fruits.add("Manggo");
		fruits.add("Banana");
		fruits.add("Orange");*/
		fruits.addAll(List.of("Apple", "Manggo", "Banana", "Orange"));
		fruits.forEach(fruit -> System.out.println(fruit));
	}
}
