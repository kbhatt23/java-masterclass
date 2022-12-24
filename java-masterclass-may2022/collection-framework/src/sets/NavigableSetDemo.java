package sets;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		NavigableSet<Integer> navigableSet = new TreeSet<>();
		navigableSet.add(23);
		navigableSet.add(33);
		navigableSet.add(33);
		navigableSet.add(10);
		navigableSet.add(1);
		navigableSet.add(-1);
		
		System.out.println(navigableSet);
		
		lowerRangeMethods(navigableSet);
		System.out.println("=================================================");
		higherRangeMethods(navigableSet);
	}

	private static void higherRangeMethods(NavigableSet<Integer> navigableSet) {
		System.out.println(navigableSet.ceiling(33));
		
		System.out.println(navigableSet.higher(33));
		
		System.out.println(navigableSet.ceiling(34));
		System.out.println(navigableSet.higher(33));
		System.out.println(navigableSet.higher(34));
		
		System.out.println(navigableSet.ceiling(-1));
		System.out.println(navigableSet.higher(-1));
	}

	private static void lowerRangeMethods(NavigableSet<Integer> navigableSet) {
		System.out.println(navigableSet.floor(33)); // <= value passed
		
		System.out.println(navigableSet.floor(34)); // <= value passed
		
		//should be null
		System.out.println(navigableSet.floor(-2)); // <= value passed
		
		System.out.println(navigableSet.lower(33)); // < value passed
		
		System.out.println(navigableSet.lower(23)); // < value passed
		
		System.out.println(navigableSet.lower(-1)); // < value passed
		System.out.println(navigableSet.lower(-2)); // < value passed
	}
}
