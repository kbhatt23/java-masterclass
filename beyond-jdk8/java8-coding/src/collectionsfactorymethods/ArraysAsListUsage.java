package collectionsfactorymethods;

import java.util.Arrays;
import java.util.List;

public class ArraysAsListUsage {

	public static void main(String[] args) {
		//rule1();
		rule2();
	}

	private static void rule1() {
		//Integer[] numbersArray = {1,3,5,7};

		//below will create List<int[]>
		int[] numbersArray = {1,3,5,7};
		
		List<int[]> numbersList =Arrays.asList(numbersArray);
		//List<Integer> numbersList = Arrays.asList(numbersArray);
		
		System.out.println(numbersList);
	}
	
	private static void rule2() {
		Integer[] numbersArray = {1,3,5,7};
		String stringOfArray = Arrays.toString(numbersArray);
		System.out.println("initial array: "+stringOfArray);
		//creates fixed size array
		//can modify certain index but can not add/remove elements
		List<Integer> numbersList =Arrays.asList(numbersArray);
		
		//numbersList.add(23);
		//numbersList.remove(0);
		
		numbersList.set(0, -1);
		numbersArray[1] = 99;
		
		System.out.println(numbersList);
		
		stringOfArray = Arrays.toString(numbersArray);
		System.out.println("final array: "+stringOfArray);
	}
}
