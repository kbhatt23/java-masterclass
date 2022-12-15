package streamexceptionhandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StreamExceptionalHandlingBad {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5);
		
		//this wont work
		//try {
		numbers.stream()
		    .map(transform(StreamExceptionalHandlingBad :: doubleOdds))
		    .forEach(num -> System.out.println("output recieved "+num));
		
//	}catch (Exception e) {
//			System.err.println("excpetion occurred "+e);
//		}
	}
	
	static int doubleOdds(int input) throws Exception{
		
		if(input % 2 == 0)
			throw new IllegalArgumentException("number passed is even: "+input);

		return 2 * input;
	}
	
	static <T,R> Function<T, R> transform(FunctionWithException<T, R> funcEx){
		return input -> {
			try {
				return funcEx.apply(input);
			}catch (Exception e) {
				throw new RuntimeException("runtime exception occurred: "+e);
			}
		};
	}
}
