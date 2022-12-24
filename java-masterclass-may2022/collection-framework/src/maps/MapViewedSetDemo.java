package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapViewedSetDemo {

	public static void main(String[] args) {
		Map<Integer, String> store = new HashMap<>();

		store.put(1, "one");
		store.put(1, "One");
		store.put(2, "Two");
		store.put(4, "Four");
		
		Set<Integer> keySet=  store.keySet();
		//backed object, modification in view reflect actual map also
		
		System.out.println(store);
		System.out.println(keySet);
		
		keySet.remove(1);
		
		System.out.println(store);
		System.out.println(keySet);
		
	}
}
