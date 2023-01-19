package legacy;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

//biggest issue is with usage
//its time starts from 1 jan 1900 unlike epoch
//month starts from 0 and not 1
//too much confusion it can create
public class DateClassIssues {

	public static void main(String[] args) {
		
		dateIssues();
		
		calendarAddition();
	}

	private static void calendarAddition() {
		//trying to represent 10 june 2016
		Calendar calendar = new GregorianCalendar(2016, 5, 10);
		System.out.println("calendar support date: "+calendar.getTime());
	}

	private static void dateIssues() {
		//trying to represent 10 june 2016
		Date june2016 = new Date(2016, 6, 10);
		
		System.out.println("confusion: "+june2016);
		
		//because of this issue in confusion Calendar class was added in jdk 1.1
		
		//month starts from 0 as jan
		//year starts from 1990 so for 2016 we need to do 2016-1900
		Date june2016Tough = new Date(2016-1900, 5, 10);
		System.out.println("real tough date: "+june2016Tough);
	}
}
