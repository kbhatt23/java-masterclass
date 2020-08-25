package statements;

public class SumDigits {

	public static void main(String[] args) {
		System.out.println(sumDigits(123));
	}
	
	public static int sumDigits(int number) {
		if(number < 10) {
			//single digit number cn not be added
			//as number itself is the sum
			//also for negative number we return -1
			return -1;
		}
		//to extract last digit we can use modulus by 10
		//to reduce the number we can divide the number by 10
		int sum= 0;
		while(number > 0 ) {
			int currentDigit = number % 10;
			sum+=currentDigit;
			number = number /10;
		}
		return sum;
	}

}
