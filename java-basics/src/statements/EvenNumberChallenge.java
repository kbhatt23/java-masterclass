package statements;

public class EvenNumberChallenge {

	public static void main(String[] args) {
		int start =22;
		int end = 99;
		
		while(start <= end) {
			System.out.println(start+ " number is even or not "+isEven(start));
			start++;
		}
	}
	
	public static boolean isEven(int number) {
		if(number <= 0) {
			throw new RuntimeException(number  + " Number is invalid");
		}
		if(number % 2 == 0) {
			return true;
		}
		return false;
	}
}
