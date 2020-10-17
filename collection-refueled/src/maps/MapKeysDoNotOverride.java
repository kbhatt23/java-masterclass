package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import common.HashCodeFather;

public class MapKeysDoNotOverride {
public static void main(String[] args) {
	Map<HashCodeFather, String> map = new HashMap<HashCodeFather, String>();
	HashCodeFather obj1  = new HashCodeFather("one");
	HashCodeFather obj2  = new HashCodeFather("two");
	HashCodeFather obj1Copy  = new HashCodeFather("one");
	map.put(obj1,"one");
	map.put(obj2,"two");
	//hashcode and equals is smae -> logically equa  ut object is differnet
	//ignore update of key and updates the value
	map.put(obj1Copy,"one-copy");
	
	System.out.println(map);
	
	for(HashCodeFather key : map.keySet()) {
		System.out.println("current key "+key + " is it equal to copy obj1-copy: " + (obj1Copy == key));
		System.out.println("current key "+key + " is it equal to copy obj1: " + (obj1 == key));
	}
}
}
