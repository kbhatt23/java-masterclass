package learning.set;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class SubSetExample {
public static void main(String[] args) {
	NavigableSet<Integer> set = new TreeSet<>();
	//this sorts as well
	
	set.add(3);set.add(5);set.add(7);set.add(1); set.add(9);
	printElementsOfSet(set);
	
	SortedSet<Integer> subSet = set.subSet(3, 9);
	
	printElementsOfSet(subSet);
	System.out.println("after manipulation");
	//subSet.add(8);
	set.add(8);
	printElementsOfSet(set);
	printElementsOfSet(subSet);
	
}

private static void printElementsOfSet(SortedSet<Integer> set) {
	Iterator<Integer> iterator = set.iterator();
	System.out.println("all elements");
	while(iterator.hasNext()) {
		System.out.println(iterator.next());
	}
	System.out.println("all elements");
}

}
