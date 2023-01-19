package legacy;

import java.util.Arrays;
import java.util.Calendar;
import java.util.TimeZone;

public class TimeZoneDemo {

	public static void main(String[] args) {
		String[] availableIDs = TimeZone.getAvailableIDs();
		
		
//		Arrays.stream(availableIDs)
//		  .forEach(System.out::println);
		
		TimeZone timeZone = TimeZone.getTimeZone("VST");
		System.out.println(timeZone);
		Calendar currentOnVST = Calendar.getInstance(timeZone);
		
		// default time zone will be system generated ist for e
		Calendar currentOnDefaultTimeZone = Calendar.getInstance(); 
		
		System.out.println("current vst date: "+currentOnVST.get(Calendar.HOUR));
		System.out.println("current ist date: "+currentOnDefaultTimeZone.get(Calendar.HOUR));
		
	}
}
