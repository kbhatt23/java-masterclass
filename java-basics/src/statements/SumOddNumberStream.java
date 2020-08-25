package statements;

import java.util.stream.IntStream;

public class SumOddNumberStream {

	public static void main(String[] args) {
		System.out.println(sumOdd(5,35));
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
			return IntStream.rangeClosed(start, end).filter(SumOddNumberStream::isOdd).sum();
		} else {
			return -1;
		}

	}
}
