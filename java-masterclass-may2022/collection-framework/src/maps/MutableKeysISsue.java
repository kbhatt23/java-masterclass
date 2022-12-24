package maps;

import java.util.HashMap;
import java.util.Map;

import lists.Book;


public class MutableKeysISsue {

	public static void main(String[] args) {
		Map<Book, Double> bookPriceMap = new HashMap<>();
		
		//if we have mutable key
		//any reference can modify that key and hence origina old value key object wont return the value;
		
		Book book1 = new Book("java", 100);
		Book book2 = new Book("c", 60);
		
		bookPriceMap.put(book1, book1.getPrice());
		bookPriceMap.put(book2, book2.getPrice());
		
		System.out.println(bookPriceMap); 
		
		Book key = new Book("c", 60);
		System.out.println(bookPriceMap.get(key));
		//sudden price change
		//see the reference object is same
		//hence key of map will also get updated
		book2.setPrice(61);
		
		System.out.println(bookPriceMap.get(key));
	}
}
