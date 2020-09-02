package integermanioulation;

import java.util.stream.IntStream;

public class IntegerManipulation {
	public static void main(String[] args) {
		System.out.println(sumOfnNumbers(2));
		int a = 22;
		System.out.println(factorial(a) == factorialWithLoop(a));
	}
	//0+ 1+ 2+ 3+.... n
	public static int sumOfnNumbers(int n) {
		return IntStream.rangeClosed(0, n).sum();
	}
	//0!= 1, 1!=1 2!=2 3! = 6
	public static int factorial(int n) {
		if(n == 1 || n ==0) {
			return 1;
		}
		/*
		 * if(n == 2) { return 2; }
		 */
		return n * factorial(n-1);
	}
	
	public static int factorialWithLoop(int n) {
		if(n == 0 || n ==1) {
			return 1;
		}
		int factorial =1;
		for(int a = n ; a >=1; a--) {
			factorial*=a;
		}
		return factorial;
	}

}
