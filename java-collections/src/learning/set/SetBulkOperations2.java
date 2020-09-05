package learning.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SetBulkOperations2 {
public static void main(String[] args) {
	Set<Integer> squares = new HashSet<Integer>(IntStream.rangeClosed(1, 100).map( i-> i*i).boxed().collect(Collectors.toList()));
	Set<Integer> cubes = new HashSet<Integer>(IntStream.rangeClosed(1, 100).map( i-> i*i*i).boxed().collect(Collectors.toList()));
	
	System.out.println("size of squares "+squares.size()+" and size of cubes "+cubes.size());
	
	//union -> all items will be added to same set and repeated items will be kept only onmce
	Set<Integer> union = new HashSet<Integer>(squares);
	union.addAll(cubes);
	System.out.println("union size "+union.size());
	
	//retain all gives only items whihc are common -> 
	Set<Integer> intersection = new HashSet<Integer>(squares);
	intersection.retainAll(cubes);
	System.out.println("intersections size "+intersection.size());
	
	intersection.forEach(e -> System.out.println("square root of "+e +" is: "+Math.sqrt(e)+ " and cube root is: "+Math.cbrt(e)));
}
}
