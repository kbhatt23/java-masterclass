package challenges2;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalUnit;
import java.util.Scanner;

public class ReadUserInput_1 {
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Kindly put username ");
		String userName = scanner.nextLine();
		
		System.out.println("Kindly put your year of birth");
		int dob = scanner.nextInt();
		int age = LocalDate.now().getYear()-dob;
		
		System.out.println("Hello "+userName+", Your age is "+age);
		
		scanner.close();
}
}
