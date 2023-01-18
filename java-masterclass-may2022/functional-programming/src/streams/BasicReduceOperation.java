package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class BasicReduceOperation {

	public static void main(String[] args) {
		//find min number
		
		List<Integer> numbers = Arrays.asList(4,5,2,5,1,7);
		
		
		Optional<Integer>  minOptional = numbers
					.stream()
					//.filter(i -> i > 10) // will return empty stream, hence optional is needed
					.reduce((identity,element) -> (identity > element ) ? element : identity);
	
		minOptional.ifPresent(min -> System.out.println("min is: "+min));
		
		//method 2: better
		Optional<Integer>  minOptional2 = numbers
				.stream()
				//.filter(i -> i > 10) // will return empty stream, hence optional is needed
				.reduce(Math :: min);
		
		minOptional2.ifPresent(min -> System.out.println("min is: "+min));
	}
}
