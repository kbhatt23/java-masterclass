package statements;

import java.util.stream.IntStream;

public class CheckPrimeNumber {
	public static void main(String[] args) {
		int[] nako = new int[2];
		if (nako != null) {
			for (int na : nako) {
				System.out.println("na " + na);
			}
		}
		int count = 0;
		for (int i = 7; i < 50; i++) {
			if (count == 3) {
				break;
			}
			if (isPrime(i)) {
				System.out.println("jai shree ram from prime number " + i);
				count++;
			}
		}
		System.out.println("using stream");
		// using stream
		IntStream.rangeClosed(7, 50).filter(CheckPrimeNumber::isPrime).limit(3)
				.forEach(num -> System.out.println("jai shree ram from prime number " + num));
		;
	}

//prime number can only be divided by itslef or 1
	private static boolean isPrime(int number) {
		if (number <= 1) {
			// has to be greater than one
			return false;
		}
		boolean isPrime = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				isPrime = false;
			}
		}
		return isPrime;
	}
}
