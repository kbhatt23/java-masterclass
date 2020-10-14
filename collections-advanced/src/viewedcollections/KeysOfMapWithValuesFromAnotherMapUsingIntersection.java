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
public class KeysOfMapWithValuesFromAnotherMapUsingIntersection {
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
		//scenario looks like set intersection
		//we can do retainall on collection and it will remove all the uncommon entries
		//so we need to take copy of collections
		
		Map<Integer, String> map2Copy = new HashMap<Integer, String>(map2);
		//also to reduce number of entries value can be made to set
		Set<String> map1ValueSet = new HashSet<>(map1.values());
		//removes uncommon things from map2Copy
		map2Copy.values().retainAll(map1ValueSet);
		Set<Integer> keysetMapBFinal = map2Copy.keySet();
		PrintUtility.printJoinedStream(keysetMapBFinal.stream(), "key set of map1 common ");
	}

}
