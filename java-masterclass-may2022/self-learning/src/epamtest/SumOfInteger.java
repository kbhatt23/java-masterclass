package epamtest;

public class SumOfInteger {
	//n * (n+1)/2
	public static void main(String[] args) {
		
		int sumOfArray = sumOfArray(new int[] {1,2,3,4});
		System.out.println("result: "+(sumOfArray == 11));
	}
	//1,2,3,4
	static int sumOfArray(int[] numbers) {
		if(numbers == null || numbers.length == 0) {
			return 0;
		}
		return sumOfArray(numbers, 0);
		
	}
	
	static int sumOfArray(int[] numbers, int index) {
		if(index == numbers.length) {
			return 0;
		}
		
		return numbers[index] + sumOfArray(numbers, index + 1);
	}
}
