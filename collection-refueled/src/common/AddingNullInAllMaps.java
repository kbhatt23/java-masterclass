package common;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AddingNullInAllMaps {
	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<String, String>();
		populateNullsInMap(hashMap);
		
		System.out.println("===============");
		Map<String, String> linkedhashMap = new LinkedHashMap<String, String>();
		populateNullsInMap(linkedhashMap);
		
		System.out.println("===============");
		//can not inser null key or value in hashtable
		//Map<String, String> hashTable = new Hashtable<String, String>();
		//populateNullsInMap(hashTable);
		
		
		System.out.println("===============");
		//can not insert null key in tree set with default comparator
		//if comparator supports null entries then fine 
		//otherwise -> nullpointerexception in comparator
		
		//Map<String, String> treeMap = new TreeMap<String, String>();
		//below will allows null, but only once
		Map<String, String> treeMap = new TreeMap<String, String>(Comparator.nullsFirst(Comparator.naturalOrder()));
		populateNullsInMap(treeMap);
	}

	private static void populateNullsInMap(Map<String, String> map) {
		map.put("jai shree ram", "jai shree ram");
		map.put("null value wala 1", null);
		map.put("null value wala 2", null);
		map.put(null, null);
		map.put(null, null);
		PrintUtility.printJoinedStream(map.entrySet().stream(),map.getClass().getSimpleName() + " with null items: ");
	}
}
