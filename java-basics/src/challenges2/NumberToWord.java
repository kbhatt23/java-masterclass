package challenges2;

public class NumberToWord {
public static void main(String[] args) {
	int number =232;
	String word = "";
	while(number > 0) {
		int digit = number % 10;
		if(word.length() == 0) {
			word += fetchWordFromDigit(digit);
		}else {
			word = fetchWordFromDigit(digit)+ " "+ word;
		}
		number /=10;
	}
	System.out.println(word);
}

public static String fetchWordFromDigit(int digit) {
	
	switch (digit) {
	case 1:
		return "One";
	case 2:
		return "Two";
	case 3:
		return "Three";
	case 4:
		return "Four";
	case 5:
		return "Five";
	case 6:
		return "Six";
	case 7:
		return "Seven";
	case 8:
		return "Eight";
	case 9:
		return "Nine";

	default:
		return "FAKE";
	}
}
}
