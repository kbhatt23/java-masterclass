package challenges2;

import java.util.Scanner;

public class ScannerSumChallenge {
	public static void main(String[] args) {
		//finiteloopscanning();
		infiniteloopscanning();
	}

	private static void finiteloopscanning() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		boolean isSuccess = true;
		for (int i = 1; i <= 5; i++) {
			System.out.println("Kindly enter number# " + i);
			if (scanner.hasNextInt()) {
				sum += scanner.nextInt();
			} else {
				isSuccess = false;
				break;
			}
		}
		if (isSuccess) {
			System.out.println("Sum of numbers " + sum);
		} else {
			System.out.println("kindly enter valid number");
		}
		scanner.close();
	}

	private static void infiniteloopscanning() {
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		int i = 1;
		while (true) {
			if (i == 6)
				break;
			System.out.println("Kindly enter number# " + i);
			if (scanner.hasNextInt()) {
				sum += scanner.nextInt();
				i++;
			} else {
				System.err.println("invalid number entered, kindly try again");
			}
			scanner.nextLine();
		}
		System.out.println("Sum of numbers " + sum);
		scanner.close();
	}

}
