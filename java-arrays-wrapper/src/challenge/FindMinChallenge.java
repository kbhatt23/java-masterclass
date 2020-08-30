package challenge;

import java.util.Arrays;
import java.util.Scanner;

public class FindMinChallenge {
	public static void main(String[] args) {
		int[] fetchNumberFromUser = ScannerArrayUtil.fetchNumberFromUser();
		System.out.println("numbers entered " + Arrays.toString(fetchNumberFromUser));
		String smallesParts = Arrays.toString(findMinAndSecondMin(fetchNumberFromUser));
		System.out.println(smallesParts);
	}

	// find smallest and second smallest number
	// if we pass 3,4,5,3 - < it will return 3 and 3
	private static int[] findMinAndSecondMin(int[] numbers) {
		int[] smallestParts = new int[2];
		int smallest = numbers[0];
		int secondSmallest = numbers[1];
		for (int i = 0; i < numbers.length; i++) {
			int current = numbers[i];
			if (current < smallest) {
				secondSmallest = smallest;
				smallest = current;
			} else if (current < secondSmallest) {
				secondSmallest = current;
			}
		}
		smallestParts[0] = smallest;
		smallestParts[1] = secondSmallest;
		return smallestParts;
	}

}
