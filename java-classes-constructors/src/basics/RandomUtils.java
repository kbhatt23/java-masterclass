package basics;

public class RandomUtils {
	// chose a Character random from this String
	private static String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789"
			+ "abcdefghijklmnopqrstuvxyz";

	public static String generateRandomString(int size) {
		StringBuilder sb = new StringBuilder(size);

		for (int i = 0; i < size; i++) {

			// generate a random number between
			// 0 to AlphaNumericString variable length
			int index = (int) (AlphaNumericString.length() * Math.random());

			// add Character one by one in end of sb
			sb.append(AlphaNumericString.charAt(index));
		}

		return sb.toString();
	}

}
