
package collectionutils;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SingletonCollections {

	public static void main(String[] args) {
		Set<String> singleton = Collections.singleton("narayan");
		System.out.println(singleton);
		//singleton.add("fake");//can not insert element
		//singleton collection means collection containing single entry
	
		List<String> singletonList = Collections.singletonList("narayan");
		System.out.println(singletonList);
		
		//singletonList.add("fake");
		
		Map<String, String> singletonMap = Collections.singletonMap("lakshmi", "narayan");
		System.out.println(singletonMap);
		
		//singletonMap.put("naklee", "fake");
	}
}
