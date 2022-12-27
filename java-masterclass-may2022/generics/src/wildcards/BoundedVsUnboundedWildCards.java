package wildcards;

import java.util.Arrays;
import java.util.List;

public class BoundedVsUnboundedWildCards {

	public static void main(String[] args) {
		List<String> one = Arrays.asList("sita rama", "lakshman hanuman", "radhe krishna", "garuda chakra");
		
		List<String> two = Arrays.asList("sita rama", "lakshman hanuman");
		
		List<Integer> three = Arrays.asList(2,4,56,11);
		unboundedWildCard(one, two);
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		unboundedWildCard(two, three);
	}
	
	//bounded wildcards helps in 2 thing
	// we can cast to specific super type instead of object
	//use supertype methods instead of object type as now we can cast to specific supertype and not object
	// we can enforce more restriction on the client side
	//remember mutating method restriction still exist
	
	//we can pass List<String>, List<Object> , List<Integer> anything
	//but this method can cast to object and can use only object methods
	private static void unboundedWildCard(List<?> one , List<?> two) {
		
		//mutating methods not allowed
		//one.addAll(two); // wont work as this is using class level generic type
		
		System.out.println("contains:" +one.containsAll(two)); // works as contains is not using class level generic type
		
		//we can cast only to objects
		
		for(Object a : one) {
			System.out.println("one.element "+a);
		}
		for(Object a : two) {
			System.out.println("two.element "+a);
		}
	}
}
