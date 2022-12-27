package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForcedGenericArgumentReason {

	public static void main(String[] args) {
		exampleUsingList();
	}

	private static void exampleUsingList() {
		//arrays vs list example
		Number[] numbers = new Number[2];
		numbers[0] = new Integer(23);
		numbers[1] = new Double(55.2d);
		
		System.out.println(Arrays.toString(numbers));
		
		//but below will give runtimeexception
		
		Number[] numbersa = new Integer[2];
		numbersa[0] = new Integer(23);
		//numbersa[1] = new Double(55.2d); // gives runtime exception here
		
		
		//List enforces this not to happen and support dev at compile time
		
		//List<Number> numbersList = new ArrayList<Double>();
		//List<Number> numbersList = new ArrayList<Integer>();
		List<Number> numbersList = new ArrayList<Number>();
		numbersList.add(new Integer(23));
		numbersList.add(new Double(55.2d));
		
		System.out.println(numbersList);
		for(int i = 0 ; i < numbersList.size() ; i++) {
			Number a = numbersList.get(i);
			System.out.println(a.getClass() + " : "+ a);
		}
	}
}
