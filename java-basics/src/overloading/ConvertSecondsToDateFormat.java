package overloading;

public class ConvertSecondsToDateFormat {
	public static void main(String[] args) {
		System.out.println(formatToString(3945));
	}

	public static String formatToString(int minutes, int seconds) {
		// 60 sends equals minutes, so if we wnat to give more duration put that in
		// minutes instead of adding in seconds
		if (minutes < 0 || seconds < 0 || seconds >= 60) {
			throw new RuntimeException("Invalid data provided:-> minutes: " + minutes + ",seconds: " + seconds);
		}
		return formatToString(minutes + seconds);
	}

//overloaded method -> user can directly pass seconds or can pass minutes and seconds in proper ruled manner
	private static String formatToString(int seconds) {
		if (seconds < 0) {
			throw new RuntimeException("Invalid data provided:-> seconds: " + seconds);
		}
		int hours = seconds / (60 * 60);
		int remainingMinutes = seconds % (60 * 60);
		int remainngSeconds = 0;
		int minutes = remainingMinutes;
		if (remainingMinutes >= 60) {
			remainingMinutes = remainingMinutes / 60;
			remainngSeconds = minutes % 60;
		} else {
			remainingMinutes = 0;
			remainngSeconds = seconds;
		}
		return hours + " : " + remainingMinutes + " : " + remainngSeconds;
	}
}
