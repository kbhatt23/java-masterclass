package maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheExample {

	public static void main(String[] args) {
		//we know LRUcache is good usecase of Linkedhashmap
		// if accessorder is false it is based on insertion order
		//if set to true it is based on access order
		
		//traverseMap(new HashMap<>());
		
		//traverseMap(new LinkedHashMap<>());
		
		traverseMap(new LRUCache<>(3, 10, 0.75f)); 
		// a b c
		//b c a
		//b a c
		//a c d
		//c d e
	}
	
	//behavior of accessorder map vs non access order map is different even for linkedhashmap implementation
	//lets compare hashmap vs linkedhashmap vs LRU based linked hashmap
	private static void traverseMap(Map<String, String> storage) {
		storage.put("a", "A");
		storage.put("b", "B");
		storage.put("c", "C");
		System.out.println(storage); 
		
		//for normal linkedhashmap only thing matter is insertion order
		storage.get("a");
		
		System.out.println(storage);
		storage.get("c");
		System.out.println(storage);
		
		storage.put("d", "D");
		System.out.println(storage);
		
		storage.put("e", "E");
		System.out.println(storage);
		
	}
}
