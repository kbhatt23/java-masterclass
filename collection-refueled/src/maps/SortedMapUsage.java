package maps;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapUsage {
public static void main(String[] args) {
	SortedMap<Integer, String> sortedMap1 = new TreeMap<Integer, String>();
	//tree map do not allow null as key as comparator will not work, hash code and euqal are not used for duplcaition logic here
	//class cast exception will occur
	//sortedMap1.put(null, "null");
	//class cast exception will occur
	sortedMap1.put(2, "two");
	sortedMap1.put(1, "one");
	sortedMap1.put(2, "two updated");
	//sort based on key , key wont update to new , but value will
	System.out.println(sortedMap1);
}
}
