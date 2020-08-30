package challenge;

import java.util.Arrays;

public class ReverseSameArray {
	public static void main(String[] args) {
		int[] fetchNumberFromUser = ScannerArrayUtil.fetchNumberFromUser();
		System.out.println("numbers entered " + Arrays.toString(fetchNumberFromUser));
		reverseArray(fetchNumberFromUser);
		System.out.println("revese array is "+Arrays.toString(fetchNumberFromUser));
	}

	private static void reverseArray(int[] numbers) {
		for(int i=0,j=numbers.length-1 ;  i < numbers.length/2 ; i++,j--) {
			int temp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = temp;
		}
	}
}
