package learning.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetAllBulkOperations {
public static void main(String[] args) {
	Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7));
	
	Set<Integer> set2= new HashSet<Integer>(Arrays.asList(5,6,7,8,9,10,11));
	printSet(set1,"Printing set1 ");printSet(set2, "Printing set2 ");
	
	//operations -> union
	//taking copy so that older objects do not get corrupted and can be used ofr iddferent operations
	Set<Integer> union = new HashSet<Integer>(set1);
	union.addAll(set2);
	printSet(union, "Printing union set");
	
	Set<Integer> intersection = new HashSet<Integer>(set1);
	//keep only common and emove uncomonon ellements
	intersection.retainAll(set2);
	printSet(intersection, "Printing intersection set");
	System.out.println("logical addition retursn "+ ((intersection.size()+union.size()) == (set1.size()+set2.size())));
	
	//operations -> removeall
	//removes all the common things
	Set<Integer> remove1Set = new HashSet<Integer>(set1);
	remove1Set.removeAll(set2);
	printSet(remove1Set, "printing removal set1 ");
	
	System.out.println("logical condition set 2 "+ ((remove1Set.size()+intersection.size()) == (set1.size())));
	
	Set<Integer> remove2Set = new HashSet<Integer>(set2);
	remove2Set.removeAll(set1);
	printSet(remove2Set, "printing removal set1 ");
	
	System.out.println("logical condition set 2  "+ ((2*intersection.size()+remove2Set.size()+remove1Set.size()) == (set1.size()+set2.size())));
	
}

private static void printSet(Set<?> anySet,String msg) {
	System.out.println(msg);
	//? means ? extends object ,can take any kind of set but cna not modify it
	//anySet.add(23);
	anySet.stream().forEach(e -> System.out.print(e+" "));
	System.out.println();
}
}
