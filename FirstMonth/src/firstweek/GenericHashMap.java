package firstweek;

import java.util.*;


public class GenericHashMap {
	public static void main(String[] args) {
	
		
		Book b1 = new Book(101, "Let us C",  8);
		Book b2 = new Book(102, "Data Communications & Networking",  4);
		Book b3 = new Book(103, "Operating System",  6);
		Map<Integer, Book> map = new HashMap<Integer, Book>();
		// Adding Books to map
		map.put(1, b1);
		map.put(2, b2);
		map.put(3, b3);

	
		for (Map.Entry<Integer, Book> entry : map.entrySet()) {
			int key = entry.getKey();
			Book b = entry.getValue();
			System.out.println(key + " Details:");
			System.out.println(b.id + ":" + b.name +  ":" + b.quantity);
		}
	}
}