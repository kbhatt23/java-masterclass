package challenges2;

public class ConvertIntToString {
	public static void main(String[] args) {
		int num = 32323;
		System.out.println(parseToString(num));
	}

	public static String parseToString(int number) throws NumberFormatException {
		if(number <= 0) {
			throw new NumberFormatException("do not support negative numbers");
		}
		String word = "";
		while(number > 0) {
			int digit = number % 10;
			if(word.length() == 0)
				word+=digit;
			else
				word = digit+word;
			number = number/10;
		}
		return word;
	}
}
