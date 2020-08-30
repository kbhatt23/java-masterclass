package challenge;

import java.util.Scanner;

public class ScannerArrayUtil {

	public static int[] fetchNumberFromUser() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter numbers size \r");
		int numberIndex = 0;
		int size = 0;
		while (numberIndex < 1) {
			if (scanner.hasNextInt()) {
				size = scanner.nextInt();
				numberIndex++;
			} else {
				System.err.println("Please enter valid number");
			}
			scanner.nextLine();
		}
		System.out.println("Please enter " + size + " numbers \r");
		int[] numbers = new int[size];
		int index = 0;
		while (index < size) {
			if (scanner.hasNextInt()) {
				numbers[index] = scanner.nextInt();
				index++;
			} else {
				System.err.println("Please enter valid number");
			}
			scanner.nextLine();
		}
		scanner.close();
		return numbers;
	}
}
