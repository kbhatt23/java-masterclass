package challenges2;

public class FirstLastDigitSum {
public static void main(String[] args) {
	System.out.println(sumFirstAndLastDigit(-5));
}
	public static int sumFirstAndLastDigit(int number) {
		String numberStr = String.valueOf(number);
		if(numberStr.indexOf("-") == 0) {
			return -1;
		}
		int lastDigit = Integer.valueOf(numberStr.substring(numberStr.length()-1));
		int firstDigit;
		if(numberStr.indexOf("-") == 0) {
			firstDigit = Integer.valueOf(numberStr.substring(0, 2));
			if(numberStr.length() ==2) {
				lastDigit = firstDigit;
			}
			}
		else {
			firstDigit = Integer.valueOf(numberStr.substring(0, 1));
			}
		return (lastDigit+firstDigit >= 0) ? lastDigit+firstDigit : -1;
	}
	
	
}
