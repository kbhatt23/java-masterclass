package wildcards;

import java.util.ArrayList;
import java.util.List;

public class BoundedWildCards {

	public static void main(String[] args) {
		List<Number> numbers = new ArrayList<>();
		numbers.add(23d);
		numbers.add(14);
		utlize(numbers);
		
		List<Integer> integers= new ArrayList<>();
		integers.add(99);
		integers.add(101);
		//integers.add(99d);
		utlize(integers);
	}
	
	private static void utlize(List<? extends Number> numbers) {
		
		//wild card wont allow write with extends type
		//read works
		// here it is bounded wildcard and hence number or integer double etc can be passed
		
		//numbers.add(23);
		
		for(Number n : numbers) {
			System.out.println(n.getClass().getSimpleName()+" : "+n);
		}
		Number n = 99;
		numbers.remove(n);
	}
}
