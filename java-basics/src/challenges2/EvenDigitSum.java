package challenges2;

public class EvenDigitSum {
	public static void main(String[] args) {
		System.out.println(getEvenDigitSum(92882));
	}

	public static int getEvenDigitSum(int number) {
		if (number < 0) {
			return -1;
		}
		String numberStr = String.valueOf(number);
		int sum = 0;
		for (int i = 0; i < numberStr.length(); i++) {
			int digit = Integer.parseInt(numberStr.substring(i, i + 1));
			if (digit % 2 == 0) {
				sum += digit;
			}
		}
		return sum;
	}
}
