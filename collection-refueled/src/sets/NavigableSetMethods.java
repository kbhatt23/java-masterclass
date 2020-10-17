package sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetMethods {
	public static void main(String[] args) {
		NavigableSet<Integer> navigable = new TreeSet<Integer>();
		//no need of growing as tree is ever growing
		navigable.add(11);
		navigable.add(1);
		navigable.add(5);
		navigable.add(9);
		//compare method returns 0
		navigable.add(1);
		navigable.add(2);
		navigable.add(3);
		System.out.println("initial set "+navigable);
		System.out.println("floor val "+navigable.floor(3)); //-> since 3 prese it return 3
		System.out.println("lower val "+navigable.lower(3));// -> even though 3 present still retrun closest lowest
		
		System.out.println("floor again val "+navigable.floor(4)); //-> since 4 not  prese it return 3 closest lowest
		System.out.println("lower again val "+navigable.lower(4));
		
		System.out.println("floor val "+navigable.ceiling(3)); //-> since 3 prese it return 3
		System.out.println("lower val "+navigable.higher(3));// -> even though 3 present still retrun closest lowest
		
		System.out.println("floor again val "+navigable.ceiling(4)); //-> since 4 not  prese it return 3 closest lowest
		System.out.println("lower again val "+navigable.higher(4));
	}
}
