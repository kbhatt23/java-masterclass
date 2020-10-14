package viewedcollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import common.PrintUtility;

import java.util.Set;

public class MapEntrySet {
public static void main(String[] args) {
	Map<Integer, String> numsMap = new HashMap<Integer, String>();
	numsMap.put(1, "one");
	numsMap.put(2,"two");
	numsMap.put(3, "three");
	numsMap.put(4, "four");
	numsMap.put(5, "five");
	
	//creating a veiw from entry set -> unique keys and random iteration of set -> unique entries key and value pair
	Set<Entry<Integer, String>> entrySet = numsMap.entrySet();
	PrintUtility.printJoinedStream(numsMap.entrySet().stream(), "Inital map ");
	PrintUtility.printJoinedStream(entrySet.stream(), "Inital entry set ");	
	
	Set<Integer> keySet = numsMap.keySet();
	
	//addition can not be done as it is fixed size from view
	//keySet.add(99);
	
	//lets modify the view and underlying D.S -> map
	//can remove from main map -> general rul modifyin viewed collection update the underlying D.S
	keySet.remove(1);
	//-> it will remove from main D.S -> map 
	
	
	PrintUtility.printJoinedStream(numsMap.entrySet().stream(), "final map ");
	PrintUtility.printJoinedStream(entrySet.stream(), "final entry set ");	
}
}
