package newdatetime;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalField;
import java.time.temporal.TemporalUnit;

public class LegacyIssueFixed {

	public static void main(String[] args) {
		//issues with date fixed
		// constructor is not good static factory is better
		// no need to start from 1900
		//no need to pass int now we have complile time safety check
		
		LocalDate of = LocalDate.of(2016, Month.JUNE, 10);
		System.out.println(of);
		
		//to manipulate it no need of calendar class 
		//immutable instance
		LocalDate plusMonths = of.plusMonths(2);
		System.out.println("still old: "+of);
		System.out.println("plusMonths: "+plusMonths);
		
	}
}
