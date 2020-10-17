package sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetMethods {
public static void main(String[] args) {
	SortedSet<Integer> sortedSet = new TreeSet<Integer>();
	sortedSet.add(11);
	sortedSet.add(1);
	sortedSet.add(5);
	sortedSet.add(9);
	//compare method returns 0
	sortedSet.add(1);
	sortedSet.add(2);
	System.out.println("initial set "+sortedSet);
	
	//special methods
	//since sroted we cna get first, last,subset etc
	System.out.println("first: "+sortedSet.first());
	System.out.println("first: "+sortedSet.last());
	
	SortedSet<Integer> headSet = sortedSet.headSet(5);
	System.out.println(headSet);
	//it will be coupled
	//out of range and hence exception at runtime
	//headSet.add(5);
	//can add withing range and it adds to this subset as well as main set
	headSet.add(4);
	sortedSet.add(3);
	sortedSet.add(10);
	//changes in both the things will effect other subset
	System.out.println("final headset "+headSet);
	System.out.println("final main set "+sortedSet);
}
}
