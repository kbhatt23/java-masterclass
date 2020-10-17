package maps;

import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapUsage {
public static void main(String[] args) {
	NavigableMap<Integer, String> map = new TreeMap<Integer, String>();
	
	map.put(23, "jai shree ram");
	map.put(10, "jai shree ganesh");
	map.put(40, "jai radha madhav");
	map.put(33, "jai ramnath uma shankar");

	System.out.println(map.floorKey(33));
	System.out.println(map.lowerKey(33));
	
	System.out.println(map.floorEntry(33));
	System.out.println(map.lowerEntry(33));
	
	System.out.println(map.ceilingKey(33));
	System.out.println(map.higherKey(33));
	
	System.out.println(map.ceilingEntry(33));
	System.out.println(map.higherEntry(33));
}

}
