package common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashTableVsHashMap {

	public static void main(String[] args) {
		//Map<Integer, String> table = new Hashtable<>();
		Map<Integer, String> table = new HashMap<>();
		table.put(null, "fake");
		
		//System.out.println(table.size());
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		Iterator<Integer> iterator = numbers.iterator();
		int index = 0;
		while(iterator.hasNext() && index++ < 2) {
			System.out.println(iterator.next());
		}
		
		System.out.println("=-=-=-=-=");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("=-=-=-=-=");
		iterator = numbers.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
