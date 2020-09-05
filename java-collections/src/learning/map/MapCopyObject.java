package learning.map;

import java.util.HashMap;
import java.util.Map;

import com.base.BasicClassForCollection;

public class MapCopyObject {
public static void main(String[] args) {
	Map<String, BasicClassForCollection> mainMap = new HashMap<String, BasicClassForCollection>();
	mainMap.put("prop1", new BasicClassForCollection("value1"));
	mainMap.put("prop2", new BasicClassForCollection("value2"));
	mainMap.put("prop3", new BasicClassForCollection("value3"));
	mainMap.put("prop4", new BasicClassForCollection("value4"));
	
	Map<String, BasicClassForCollection> copyMap = new HashMap<String, BasicClassForCollection>(mainMap);
	copyMap.put("propp5", new BasicClassForCollection("value5"));
	copyMap.get("prop1").setName("jai shree ram");
	mainMap.entrySet().stream().forEach(e -> System.out.println(e.getKey()+" : "+e.getValue()));
	System.out.println("========================");
	copyMap.entrySet().stream().forEach(e -> System.out.println(e.getKey()+" : "+e.getValue()));

}
}
