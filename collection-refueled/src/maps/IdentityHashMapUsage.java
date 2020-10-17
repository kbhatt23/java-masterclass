package maps;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

import common.HashCodeFather;

public class IdentityHashMapUsage {
public static void main(String[] args) {
	//uses == instead of equals
	//still uses hashcode first before checking equals
	Map<HashCodeFather, String> map = new IdentityHashMap<HashCodeFather, String>();
	HashCodeFather obj1 = new HashCodeFather("one");
	HashCodeFather obj2 = new HashCodeFather("two");
	HashCodeFather obj3 = new HashCodeFather("three");
	map.put(obj1, "first");
	map.put(obj2, "second");
	map.put(obj3, "third");
	map.put(obj1, "first updated");
	System.out.println("logical equals val "+map.get( new HashCodeFather("one")));
	System.out.println("logical equals val "+map.get(obj1));
	System.out.println("ovearll map "+map);
	
	System.out.println("========integer example============");
	
	Integer a = 10;
	//both object is same == will return true
	Integer b = 10;
	Map<Integer, String> intMap = new HashMap<Integer, String>();
	intMap.put(a, "sita ram");
	intMap.put(b, "radha madhav");
	System.out.println(intMap);
	
	Integer a1 = 128;
	//both object are differnet but hashcode and equals are same
	Integer b1 = 128;
	Map<Integer, String> intMap1 = new HashMap<Integer, String>();
	intMap1.put(a1, "sita ram");
	intMap1.put(b1, "radha madhav");
	System.out.println(intMap1);
	
	Integer a2 = 10;
	//both object are differnet but hashcode and equals are same
	Integer b2 = 10;
	Map<Integer, String> intMap3 = new HashMap<Integer, String>();
	intMap3.put(a2, "sita ram");
	intMap3.put(b2, "radha madhav");
	System.out.println(intMap3);
	
	Integer a3 = 10;
	//both object is same == will return true
	Integer b3 = 10;
	Map<Integer, String> intMap4 = new IdentityHashMap<Integer, String>();
	intMap4.put(a3, "sita ram");
	intMap4.put(b3, "radha madhav");
	System.out.println(intMap4);
	
	Integer a4 = 128;
	//both object are differnet but hashcode and equals are same
	Integer b4 = 128;
	Map<Integer, String> intMap5 = new IdentityHashMap<Integer, String>();
	intMap5.put(a4, "sita ram");
	intMap5.put(b4, "radha madhav");
	System.out.println(intMap5);
	
	
	
	
}
}
