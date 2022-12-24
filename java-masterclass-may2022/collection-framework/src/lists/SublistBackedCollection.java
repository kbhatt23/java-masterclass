package lists;

import java.util.ArrayList;
import java.util.List;

public class SublistBackedCollection {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		numbers.add(0);
		numbers.add(9);
		System.out.println(numbers);
		
		List<Integer> sublist= numbers.subList(1, 3); // 3 2
		//System.out.println(sublist);
		
		sublist.set(0, 4);
		//System.out.println(sublist); // 4 2
		System.out.println(numbers); // 1 4 2 0 9
		sublist.add(23);
		System.out.println(numbers); // 1 4 2 23 0 9
		System.out.println(sublist); // 4 2 23
	}
}
