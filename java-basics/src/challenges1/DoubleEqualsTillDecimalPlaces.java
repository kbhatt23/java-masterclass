package challenges1;

public class DoubleEqualsTillDecimalPlaces {
	public static void main(String[] args) {
		System.out.println(areEqualByThreeDecimalPlaces(3.1756,3.1757));
		
		double fakeNum=0;
		if(fakeNum == 0.00000d)
			System.out.println("jai shree ram from fake num");
	}

	public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
		String num1Str = String.valueOf(number1);
		String num2Str = String.valueOf(number2);
		int maxFractionsToTest = 3;
		String formattedNum1 = formatToDecimalPlaces(num1Str, maxFractionsToTest);
		String formattedNum2 = formatToDecimalPlaces(num2Str, maxFractionsToTest);
		
		return formattedNum1.equals(formattedNum2);
	}

	private static String formatToDecimalPlaces(String numStr, int maxFractionsToTest) {
		String[] num1Parts = numStr.split("\\.");
		StringBuilder sb = new StringBuilder();
		sb.append(num1Parts[0]).append(".");
		String fractions = num1Parts[1];
		if (fractions == null || fractions.length() == 0) {
			sb.append(0).append(0).append(0);
		} else {
			int index= 0 ;
			for(; index < fractions.length() && index < maxFractionsToTest; index++) {
				sb.append(fractions.charAt(index));
			}
			
			while(index < maxFractionsToTest) {
				sb.append(0);
				index++;
			}
		}
		return sb.toString();
	}
}
