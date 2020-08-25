package statements;

import java.util.stream.IntStream;

public class SumOddNumber {

	public static void main(String[] args) {
		System.out.println(sumOdd(5, 35));
	}

	public static boolean isOdd(int number) {
		if (number <= 0) {
			return false;
		}
		if (!(number % 2 == 0)) {
			// number is odd
			return true;
		}
		return false;
	}

	public static int sumOdd(int start, int end) {
		if (end > 0 && start > 0 && end >= start) {
			int sum = 0;
			for (int i = start; i <= end; i++) {
				if (isOdd(i)) {
					sum += i;
				}
			}
			return sum;
		} else {
			return -1;
		}

	}
}
