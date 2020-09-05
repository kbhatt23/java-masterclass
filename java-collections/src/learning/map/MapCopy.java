package learning.map;

import java.util.HashMap;
import java.util.Map;

public class MapCopy {
public static void main(String[] args) {
	Map<String, String> mainMap = new HashMap<String, String>();
	mainMap.put("prop1", "value1");
	mainMap.put("prop2", "value2");
	mainMap.put("prop3", "value3");
	mainMap.put("prop4", "value4");
	
	Map<String, String> copyMap = new HashMap<String, String>(mainMap);
	mainMap.put("prop1", "value11");
	
	mainMap.entrySet().stream().forEach(e -> System.out.println(e.getKey()+" : "+e.getValue()));
	System.out.println("========================");
	copyMap.entrySet().stream().forEach(e -> System.out.println(e.getKey()+" : "+e.getValue()));
}
}
