package sets;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import common.CollectionUtils;

public class HashSetBasics {
public static void main(String[] args) {
	//hashcode and equals of String class will be used 
	Set<String> basicSet = new HashSet<String>();
	basicSet.add("jai shree ram");
	basicSet.add("jai ramduta hanuman");
	//hash code and equals are same for thie entry
	basicSet.add("jai shree ram");
	
	System.out.println("size: "+basicSet.size());
	System.out.println(basicSet);
	//union
	basicSet.addAll(CollectionUtils.fetchRandomSet());
	
	System.out.println("does bsaic set conttains all random set "+basicSet.containsAll(CollectionUtils.fetchRandomSet()));
	//no duplicates allowed and hence skips all new entries
	basicSet.addAll(CollectionUtils.fetchRandomSet());
	System.out.println("size revisited: "+basicSet.size());
	
	//lets remove what we added
	basicSet.removeAll(CollectionUtils.fetchRandomSet());
	System.out.println("size after removeall: "+basicSet.size());
	
	//retian all keeps common thing and remove othes
	basicSet.addAll(CollectionUtils.fetchRandomSet());
	//basicSet.retainAll(CollectionUtils.fetchStringArrayList());
	basicSet.retainAll(CollectionUtils.fetchRandomSet());
	System.out.println("should remove all original item "+basicSet);
	
}
}
