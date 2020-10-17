package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapKeyCaseInsensitiveComparator {
	public static void main(String[] args) {
		SortedMap<String, Integer> sortedMap1 = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
		//it uses compare method and completely ignore hashcode and equals 
		sortedMap1.put("messi", 10);
		sortedMap1.put("zidane", 10);
		//case insensitive comapreebale returns 0 menaing key is same, hence override the value in map
		
		sortedMap1.put("ZiDaNe", 101);
		System.out.println(sortedMap1);
		//comparable still returns 0 hene equal
		System.out.println(sortedMap1.containsKey("ziDaNE"));
		
		System.out.println("hash map comparaison");
		
		Map<String, Integer> sortedMap11 = new HashMap<>();
		//it uses compare method and completely ignore hashcode and equals 
		sortedMap11.put("messi", 10);
		sortedMap11.put("zidane", 10);
		//case insensitive comapreebale returns 0 menaing key is same, hence override the value in map
		
		sortedMap11.put("ZiDaNe", 101);
		System.out.println(sortedMap11);
		//comparable still returns 0 hene equal
		System.out.println(sortedMap11.containsKey("ziDaNE"));
		
	}

}
