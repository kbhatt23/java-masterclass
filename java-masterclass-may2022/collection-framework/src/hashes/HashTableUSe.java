package hashes;

import java.util.Hashtable;
import java.util.Map;

public class HashTableUSe {

	public static void main(String[] args) {
		//0 null key and 0 null values allowed
		//all methods are synchornized
		
		Map<Integer, String> storage = new Hashtable<>();
		
		storage.put(0, null);
		
		System.out.println(storage);
	}
}
