package learning.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.base.BasicClassForCollection;

public class UnmodifiableMap {
public static void main(String[] args) {
	Map<String, BasicClassForCollection> map = new HashMap<String, BasicClassForCollection>();
	map.put("ram", new BasicClassForCollection("ram"));
	
	Map<String, BasicClassForCollection> unmodifiableMap = Collections.unmodifiableMap(map);
	
	unmodifiableMap.get("ram").setName("raghav");
	map.put("lala", new BasicClassForCollection("lala"));
	
	map.entrySet().forEach(System.out::println);
	unmodifiableMap.entrySet().forEach(System.out::println);
}
}
