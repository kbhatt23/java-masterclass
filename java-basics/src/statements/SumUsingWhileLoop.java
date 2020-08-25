package statements;

import java.util.stream.IntStream;

public class SumUsingWhileLoop {
public static void main(String[] args) {
	int sum = 0;
	
	int start = 10;
	int end =23;
	while(start <= end) {
		sum+=start;
		start++;
	}
	System.out.println(sum);
	System.out.println(IntStream.rangeClosed(10,23).sum());
}
}
