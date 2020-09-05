package learning.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetbulkOperations {
public static void main(String[] args) {
	Set<Integer> set1 = new HashSet<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9));
	
	Set<Integer> set2 = new HashSet<Integer>(Arrays.asList(7,8,9,10,11,12));
	
	//creating new set as otherwise we will loose actual object from set1
	//since integer is immutable no need to use stream and amp -> create new integer object for eah iteration
	//union
	Set<Integer> union = new HashSet<Integer>(set1);
	union.addAll(set2);
	//all common objects will be inserted once only
	union.forEach(System.out::println);
	System.out.println("main set1 ");
	set1.forEach(System.out::println);
	
	System.out.println("main set2 ");
	set2.forEach(System.out::println);
	
	// retainall returns things whihc are purely common
	
	Set<Integer> retainSet = new HashSet<Integer>(set1);
	retainSet.retainAll(set2);
	System.out.println("retain objects");
	retainSet.forEach(System.out::println);
	
	
}
}
