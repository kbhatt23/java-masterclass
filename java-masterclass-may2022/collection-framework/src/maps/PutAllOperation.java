package maps;

import java.util.HashMap;
import java.util.Map;

public class PutAllOperation {

	public static void main(String[] args) {
		Map<Integer, String> store = new HashMap<>();
		
		store.put(1, "one");
		store.put(1, "One");
		store.put(2, "Two");
		store.put(4, "Four");
		
		//1:One
		//2:Two
		//4:Four
		
		Map<Integer, String> store1 = new HashMap<>();

		store1.put(1, "ONE");
		store1.put(5, "FIVE");
		//1:ONE
		//5:FIVE
				
		
		store.putAll(store1);
		
		System.out.println(store);
		System.out.println(store.size());
		//2:Two
		//4:Four
		//1:ONE
		//5:FIVE
		
	}

}
