package boundedtypes;

import java.util.ArrayList;
import java.util.List;

public class RawTypesIssue {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(2);
		//numbers.add("kingla");
		
		manipulate(numbers);
		
		for(int k : numbers) {
			System.out.println(k);
		}
	}
	
	//raw is dangerous 
	//direct issue can occur at runtime and skips compile time safety
	public static void manipulate(List storage) {
		System.out.println(storage);
		storage.add("fake");
	}
}
