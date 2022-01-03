package org.oop.latihan.Iterable;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class MainImmutableList2 {

	public static void main(String[] args) {
		//List<String> one = Collections.singletonList("Satu");
		//List<String> empty = Collections.emptyList();
		
		List<String> mutable = new ArrayList<String>();
		mutable.add("Apple");
		mutable.add("Manggo");
		List<String> immutable = Collections.unmodifiableList(mutable);
		immutable.add("Banana");
		
		List<String> elements = List.of("Orange", "Strawberry");
		elements.add("Banana");
		
	}

}
