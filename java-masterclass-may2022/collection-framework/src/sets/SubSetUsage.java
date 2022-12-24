package sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class SubSetUsage {

	public static void main(String[] args) {
		SortedSet<Integer> sortedSet = new TreeSet<>();
		sortedSet.add(23);
		sortedSet.add(33);
		sortedSet.add(33);
		sortedSet.add(10);
		sortedSet.add(1);
		sortedSet.add(-1);
		
		System.out.println(sortedSet);
		
		SortedSet<Integer> subSet = sortedSet.subSet(1, 10);
		System.out.println(subSet);
		
		subSet.add(4);
		subSet.add(5);
		//subSet.add(10); //it is out of range hence gives exception
		//i subset can add only b/w 1 >=  and <=9
		System.out.println(subSet);
		System.out.println(sortedSet);
		
		subSet.add(7);// will reflect in sublist also
		
		subSet.add(10);//key out of range
		//just like arraylist sublist in main if we add anythng greater tha sublist/set range it give exception
		System.out.println(subSet);
		System.out.println(sortedSet);
	}
}
