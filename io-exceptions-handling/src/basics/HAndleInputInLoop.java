package basics;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class HAndleInputInLoop {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			int x = getIntV2();
			int y = getIntV2();
			divide(x, y);
		} catch (NoSuchElementException e) {
			System.err.println("error occurred hence can not divide");
		}

	}

	private static void divide(int x, int y) {
		System.out.println("x value is " + x);
		System.out.println("y value is " + y);
		int result = x / y;
		System.out.println("result is " + result);
	}

	private static int getInt() {
		System.out.println("Please enter an integer");
		while (true) {
			if (scanner.hasNextInt()) {
				return scanner.nextInt();
			} else {
				System.out.println("kindly enter valid integer");
			}
			scanner.nextLine();
		}
	}

	private static int getIntV2() {
		System.out.println("Please enter an integer");
		while (true) {
			try {
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				System.err.println("Please enter valid integer");
				//even thoug we thro an expectionif type is runtime then no need to add throws, nor in calling method need to do try catch to make compiler happy
				//throw e;
			}
			scanner.nextLine();
		}
	}
}
