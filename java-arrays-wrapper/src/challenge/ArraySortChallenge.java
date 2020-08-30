package challenge;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArraySortChallenge {
	public static void main(String[] args) {
		int[] fake = new int[3];
		for(int i=0 ; i < fake.length ; i++) {
			System.out.println(fake[i]);
		}
		int[] oldarray = getArrayFromUser(6);
		// Arrays.sort(oldarray);
		// int[] sortArrayIntoNewArray = oldarray;
		int[] sortArrayIntoNewArray = sortArrayIntoNewArray(oldarray);
		printArray("old array ", oldarray);
		printArray("sorted array ", sortArrayIntoNewArray);
	}

	private static int[] sortArrayIntoNewArray(int[] array) {
		int[] copyArray = copyArray(array);
		for (int i = 0; i < copyArray.length; i++) {

			for (int j = i + 1; j < copyArray.length; j++) {
				int current = copyArray[i];
				int next = copyArray[j];
				if (next > current) {
					copyArray[i] = next;
					copyArray[j] = current;
				}
			}
		}
		return copyArray;
	}

	private static int[] copyArray(int[] array) {

		return Arrays.copyOf(array, array.length);
		// int[] copyArray = new int[array.length];
		// for (int i = 0; i < array.length; i++) {
		// copyArray[i] = array[i];
		// }
		// return copyArray;
	}

	private static int[] getArrayFromUser(int size) {
		System.out.println("Kindly enter " + size + " numbers\n");
		int[] insertedArray = new int[size];
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		while (i < size) {
			if (scanner.hasNextInt()) {
				insertedArray[i] = scanner.nextInt();
				i++;
			} else {
				System.err.println("Kindly insert a valid number again\n");
			}
			scanner.nextLine();
		}
		scanner.close();
		return insertedArray;

	}

	private static void printArray(String msg, int[] array) {
		String collectOld = Arrays.stream(array).mapToObj(String::valueOf).collect(Collectors.joining(","));
		System.out.println(msg + collectOld);
	}
}
