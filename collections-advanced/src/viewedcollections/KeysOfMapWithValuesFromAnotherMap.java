package viewedcollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import common.PrintUtility;

//problem statement is -> we have two map 
//we neede to find keys set of map b whose entries have value present in mapa
public class KeysOfMapWithValuesFromAnotherMap {
	public static void main(String[] args) {

		Map<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "one");
		map1.put(2, "two");
		map1.put(3, "three");
		map1.put(4, "four");
		map1.put(5, "five");

		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(11, "one");
		map2.put(77, "two");
		map2.put(8, "eight");
		map2.put(40, "four");
		map2.put(5, "five nine");
		// we need to find set of keyus in map2 whose vlaues are there as same value in
		// map1

		// bad appriach as time compleity of searching will be O(n)
		Collection<String> valuesCollection = map1.values();
		Set<Integer> keysetMapB = map2.entrySet().stream()/* .peek(e -> System.out.println("entered item " + e)) */
				.filter(entry -> valuesCollection.contains(entry.getValue()))
				/* .peek(e -> System.out.println("passed item " + e)) */.map(Entry::getKey).collect(Collectors.toSet());
		// entries are set

		PrintUtility.printJoinedStream(keysetMapB.stream(), "key set of map1 common ");
		
		//since values are same once for any entry -> we can convert values collection to set -> unique
		//this reduces the set items and also time complexity in hashset is O(1) to search item as compared to colection O(n)
		
		Set<String> valuesCollectionSet = new HashSet<String>(valuesCollection);
		Set<Integer> keysetMapBFinal = map2.entrySet().stream()/* .peek(e -> System.out.println("entered item " + e)) */
				.filter(entry -> valuesCollectionSet.contains(entry.getValue()))
				/* .peek(e -> System.out.println("passed item " + e)) */.map(Entry::getKey).collect(Collectors.toSet());
		// entries are set

		PrintUtility.printJoinedStream(keysetMapBFinal.stream(), "key set of map1 common ");
	}

}
