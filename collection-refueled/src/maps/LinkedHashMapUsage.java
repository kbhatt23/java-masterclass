package maps;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapUsage {
public static void main(String[] args) {
	//nuls usage in key and val
	//default is insertion order, and hence update put call wont change the iteration
	Map<Integer, String> mapTest = new LinkedHashMap<Integer, String>();
	mapTest.put(1, "one");
	mapTest.put(2, "two");
	mapTest.put(null, "null key wala");
	mapTest.put(null, "null key wala updated");
	mapTest.put(23, null);
	mapTest.put(null, "null key wala updated again");
	mapTest.put(33, null);
	
	System.out.println("size "+mapTest.size());
	System.out.println(mapTest);
} 

}
