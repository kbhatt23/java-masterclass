package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CollectionUtils {

	public static Set<String> fetchRandomSet(){
		 Set<String> setStrs = new HashSet<String>();
		 setStrs.add("random1");
		 setStrs.add("random2");
		 setStrs.add("random3");
		 return setStrs;
	}
	
	public static List<String> fetchStringArrayList() {
		List<String> strings  = new ArrayList<String>();
		strings.add("sita ram");
		strings.add("ramduta hanuman");
		strings.add("hanuman duta kannu");
		strings.add( "pyarelal");
		strings.add("kehsav");
		strings.add("madhav");
		return strings;
	}
}
