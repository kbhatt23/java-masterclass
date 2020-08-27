package challenges2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InoutCalculator {
	public static void main(String[] args) {
		inputThenPrintSumAndAverage();
	}

	public static void inputThenPrintSumAndAverage() {

		Scanner scanner = new Scanner(System.in)
				;
		List<Integer> numbers = new ArrayList<Integer>();
		while(true) {
			scanner.hasNextLine();
			if(scanner.hasNextInt()) {
				numbers.add(scanner.nextInt());
			}else {
				break;
			}
		}
		int sum = 0;
		for(int number : numbers) {
			sum+=number;
		}
		double avgDouble = sum/numbers.size();
		long avg = Math.round(avgDouble);
		System.out.println("SUM = "+sum+" AVG = "+avg);
		scanner.close();
	}
	
}
