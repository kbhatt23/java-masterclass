package basics;

import java.util.Scanner;

public class CheckIfStringIsInteger {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int numFound = getIntFromStringV1();
		System.out.println("final result v1 " + numFound);

		System.out.println("final result v2 " + getIntFromStringV2());
		scanner.close();
	}

//check before usage
	private static int getIntFromStringV1() {
		// will return before first space only
		String nextStr = scanner.next();
		System.out.println("getIntFromStringV1: str entered " + nextStr);
		boolean isValid = true;
		for (char c : nextStr.toCharArray()) {
			// if (!Character.isDigit(c)) {
			if (!(c >= 0 && c <= 9)) {
				// even a single char is not digit it can not be parsed
				isValid = false;
				System.out.println("checking");
				break;
			}
		}
		// if all charachters are digit that mean it can be parsed to int
		return (isValid) ? Integer.parseInt(nextStr) : -1;
	}

	// lazy style first do and then cy -> use cath block
	private static int getIntFromStringV2() {
		// will return before first space only
		String nextStr = scanner.next();
		System.out.println("getIntFromStringV1: str entered " + nextStr);
		// cry later
		try {
			return Integer.parseInt(nextStr);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			return -1;
		}
	}
}
