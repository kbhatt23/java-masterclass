package maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapViewedEntrySetDemo {

	public static void main(String[] args) {
		Map<Integer, String> store = new HashMap<>();

		store.put(1, "one");
		store.put(1, "One");
		store.put(2, "Two");
		store.put(4, "Four");
		
		Set<Entry<Integer,String>> entrySet=  store.entrySet();
		//backed object, modification in view reflect actual map also
		
		System.out.println(store);
		System.out.println(entrySet);
		
		Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
		while(iterator.hasNext()) {
			Entry<Integer, String> next = iterator.next();
			if(next.getKey() == 1) {
				iterator.remove();
				break;
			}
		}
		
		
		System.out.println(store);
		System.out.println(entrySet);
		
	}
}
