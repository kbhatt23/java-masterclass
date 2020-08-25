package challenges1;

public class PositiveNegativeOrZero {
	public static void main(String[] args) {
		int number = -1;
		checkNumber(number);
	}

	public static void checkNumber(int number) {
		//since once one condition is met we do not have to even check for another condition
		//as number will wither be 0, negative or positouve
		//best case is if else is -> so that next if condition is not even checked whcihc anyways is going to fail
		if(number > 0) {
			System.out.println("Number is positive");
		}else if(number < 0) {
			System.out.println("Number is negative");
		}else {
			System.out.println("Number is zero");
		}
		
	}
}
