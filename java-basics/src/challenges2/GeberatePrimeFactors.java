package challenges2;

import java.util.ArrayList;
import java.util.List;

public class GeberatePrimeFactors {
	public static void main(String[] args) {
		printFactorsWhichcompletesNumber(28);
		System.out.println(isPerfectNumber(28));
	}

	public static void printFactors(int number) {
		if (number < 1) {
			System.out.println("Invalid Value");
		}
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
	}

	// do not copy to test
	public static void printFactorsWhichcompletesNumber(int number) {
		if (number < 1) {
			System.out.println("Invalid Value");
		}
		int divider = 1;
		List<Integer> dividers = new ArrayList<Integer>();
		int numberCopy = number;
		while(number > 1 ) {
			if(number % divider == 0) {
				dividers.add(divider);
				number = number/divider;
			}
			if(number % divider != 0 || divider == 1) {
				divider++;
			}
		}

		System.out.println("combination of "+dividers+ " multplies to "+numberCopy);
	}
	
	public static boolean isPerfectNumber(int number) {
		if(number < 1) {
			return false;
		}

		if (number < 1) {
			System.out.println("Invalid Value");
		}
		int divider = 1;
		List<Integer> dividers = new ArrayList<Integer>();
		int numberCopy = number;
		while(number > 1 ) {
			if(number % divider == 0) {
				dividers.add(divider);
				number = number/divider;
			}
			if(number % divider != 0 || divider == 1) {
				divider++;
			}
		}
		int sum = 0;
		for(int a : dividers) {
			sum+=a;
		}
		return sum == numberCopy;
	}
	
	
}
