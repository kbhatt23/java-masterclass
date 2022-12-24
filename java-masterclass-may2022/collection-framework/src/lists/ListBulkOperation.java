package lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListBulkOperation {

	public static void main(String[] args) {
		//for comparison all collections uses equals , except hash ones that uses hashcode and equals together
		//tree ones uses only compare method and equals hashcode are ignored
		
		List<Integer> numbers = new ArrayList<>();

		numbers.add(1);
		numbers.add(3);
		numbers.add(2);
		numbers.add(0);
		
		List<Integer> two = new ArrayList<>();
		two.add(1);
		two.add(9);
		
		System.out.println(numbers);
		numbers.addAll(two);
		System.out.println(numbers);
		
		numbers.removeAll(Arrays.asList(0,4));
		
		System.out.println(numbers);
		
		numbers.retainAll(Arrays.asList(3,4,2));
		System.out.println(numbers);
	}
}
