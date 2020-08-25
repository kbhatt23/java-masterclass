package overloading;

public class HeightConversionUtil {
	public static void main(String[] args) {
		System.out.println(convertFeetAndIncehsTocentimetre(1, 11));
	}

	public static double convertFeetAndIncehsTocentimetre(int feet, int inches) {
		// feet can not be negative, incehst can not be negative , inches should be
		// given less than 12
		// as 12 inches is 1 feet so feet should have been updated in that case
		if (feet < 0 || inches < 0 || inches >= 12) {
			throw new RuntimeException("Invalid data provided:-> feet: " + feet + ",inches: " + inches);
		}

		// 1 feet is 12 inches
		double centimeter = feet * 12 * 2.54;
		centimeter += inches * 2.54;
		return centimeter;
	}
	

}
