package legacy;

import java.util.Date;

public class FindEpoch {

	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println("current date: "+date);
		
		System.out.println("current java time: "+date.getTime()); //epoch time from jan 1 1970
		
		System.out.println("epoch time: "+System.currentTimeMillis()); // epoch time from 1 jan 1970
		//but date in java starts from 1 jan 1900 if used in constructor
	}
}
