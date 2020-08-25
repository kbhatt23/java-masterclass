package challenges1;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class LeapYear {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(1991, 03, 23);
		System.out.println(date.isLeapYear());
	}

}
