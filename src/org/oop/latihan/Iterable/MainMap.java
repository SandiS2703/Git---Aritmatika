package org.oop.latihan.Iterable;
import java.util.Map;
import java.util.HashMap;

public class MainMap {

	public static void main(String[] args) {
		Map<Integer, String> religions = new HashMap<>();
		
		religions.put(1, "Islam");
		religions.put(2, "Kristen");
		religions.put(3, "Katholik");
		religions.put(4, "Hindu");
		religions.put(5, "Budha");
		
		for(Map.Entry<Integer, String> religion : religions.entrySet()) {
			System.out.println(religion.getKey() + " : " + religion.getValue());
		}
	}

}
