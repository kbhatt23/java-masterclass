package wildcards;

import java.util.Arrays;
import java.util.List;

public class InvarianceOptions {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(1,2,3,4,5);
		//problem(integers); // invariance wont allow compiling for type safety and restrictions
		
		///only way is 
		List<Number> numbers = Arrays.asList(1,2,3,4,5,7d);
		problem(numbers);
		
		System.out.println("option one using wildcards");
		
		option1(integers);
		option1(numbers);
	}
	
	private static void problem(List<Number> numbers) {
		//just printing
		//just calling methods that are safe, with arguments not used in java class level generic type
		for(Number n : numbers) {
			System.out.println(n.getClass().getSimpleName()+" : "+n);
		}
	}
	
	//more restrictive safer vovariance option
	private static void option1(List<? extends Number> numbers) {
		//just printing
		//just calling methods that are safe, with arguments not used in java class level generic type
		for(Number n : numbers) {
			System.out.println(n.getClass().getSimpleName()+" : "+n);
		}
		
		//numbers.add(23); // wont compile for wildcards
	}
	
	private static <T extends Number> void option2(List<T> numbers) {
		//just printing
		//just calling methods that are safe, with arguments not used in java class level generic type
		for(Number n : numbers) {
			System.out.println(n.getClass().getSimpleName()+" : "+n);
		}
		
	}
}
