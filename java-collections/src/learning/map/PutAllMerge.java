package learning.map;

import java.util.HashMap;
import java.util.Map;

public class PutAllMerge {

	public static void main(String[] args) {

		Map<String, String> old = new HashMap<>();
		old.put("1", "one");
		old.put("2", "two");
		
		Map<String, String> newMap = new HashMap<>();
		newMap.put("3", "three");
		newMap.put("1", "oneA");
		
		newMap.putAll(old);
		
		System.out.println(newMap);
		
		
		
	}
}
