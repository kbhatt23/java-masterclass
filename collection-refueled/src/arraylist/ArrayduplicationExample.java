package arraylist;

import java.util.ArrayList;
import java.util.List;

import common.CollectionUtils;

public class ArrayduplicationExample {
public static void main(String[] args) {
	//it will copy set items in list
	List<String> strings  = new ArrayList<String>(CollectionUtils.fetchRandomSet());
	strings.add("sita ram");
	strings.add("ramduta hanuman");
	strings.add("hanuman duta kannu");
	strings.add( "pyarelal");
	strings.add("kehsav");
	strings.add("madhav");
	strings.add(6, "before pyarelal");
	//should come before pyaerlal
	strings.addAll(CollectionUtils.fetchRandomSet());
	//should be -1
	System.out.println("index of naklee "+strings.indexOf("naklee"));
	System.out.println("index of naklee "+strings.indexOf("madhav"));

	System.out.println("lastindex of random1 "+strings.lastIndexOf("random1"));
	System.out.println("index of random1 "+strings.indexOf("random1"));
	
	strings.replaceAll(a -> "jai "+a);
	//i think it shoud append jai before all the items
	
	//now size shud be 12 -> as each item of set will be repated twice
	//insertion order to be maitanied
	strings.forEach(System.out::println);
}
}
