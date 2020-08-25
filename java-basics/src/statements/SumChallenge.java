package statements;

import java.util.stream.IntStream;

public class SumChallenge {

	public static void main(String[] args) {
		int count = 0;
		int sum=0;
		int start = 1;int end =1001;
		sum = sumUsingForLoop(count, sum, start, end);
		System.out.println("total sum "+sum);
		
		System.out.println("total sum using stream "+sumUsingStream(count, sum, start, end));
	}

	private static int sumUsingForLoop(int count, int sum, int start, int end) {
		for(int i=start ; i<end ; i++) {
			if(count == 5) {
				break;
			}
			if(i % 3 == 0 && i%5 ==0) {
				count++;
				sum+=i;
				System.out.println("number added for sum "+i);
			}
		}
		return sum;
	}
	
	private static int sumUsingStream(int count, int sum, int start, int end) {
		return IntStream.rangeClosed(start, end)
				.filter(num -> (num % 3 == 0 && num% 5 == 0))
				.limit(5)
				.peek(num -> System.out.println("number added for sum "+num))
				.sum();
	}


}
