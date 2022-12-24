package lists;

import java.util.ArrayList;
import java.util.List;

public class ListVsCollectionDemo {
	public static void main(String[] args) {
		//Collection<Integer> numbers = new ArrayList<>();
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		numbers.add(null);
		numbers.add(0);
		numbers.add(null);
		numbers.add(null);
		numbers.add(0);
		System.out.println(numbers);
		
		numbers.remove(0);
		
		System.out.println(numbers);
		numbers.set(0, -1);
		numbers.add(0,100);
		System.out.println(numbers);
	}
}
