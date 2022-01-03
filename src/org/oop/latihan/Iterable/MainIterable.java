package org.oop.latihan.Iterable;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainIterable {

	public static void main(String[] args) {
		Iterable<String> fruits = List.of("Apple", "Manggo", "Banana", "Orange");
		Iterable<String> animals = Arrays.asList("Cat", "Dog", "Tiger", "Lion");
		
		//Looping 1
		System.out.println("---------");
		for(String fruit : fruits) {
			System.out.println(fruit);
		}
		System.out.println("---------");
		
		//Looping 2
		Iterator<String> iterator = fruits.iterator();
		while(iterator.hasNext()) {
			String fruit = iterator.next();
			System.out.println(fruit);
		}
		System.out.println("---------");
		
		//Looping 3
		System.out.println("---------");
		animals.forEach(fruit -> System.out.println(fruit));
		System.out.println("---------");
	}

}
