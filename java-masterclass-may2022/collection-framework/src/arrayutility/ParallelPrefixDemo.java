package arrayutility;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ParallelPrefixDemo {

	public static void main(String[] args) {
		int[] sequentialPrefix = sequentialPrefix();
		int[] parallelPrefix = parallelPrefix();
		
		
	}
	
	private static int[] sequentialPrefix() {
		long start = System.currentTimeMillis();
		Random random = new Random();
		int[] accumulate = null;
		for(int i = 0 ; i < 100 ; i++) {
			int[] number = IntStream.generate(random :: nextInt)
					.limit(1000000)
					.toArray();
			 accumulate = AccumulativeIndicesArray.accumulate(number);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("sequential time taken: "+(end-start));
		return accumulate;
	}
	
	private static int[] parallelPrefix() {
		long start = System.currentTimeMillis();
		Random random = new Random();
		int[] number = null;
		for(int i = 0 ; i < 100 ; i++) {
			number= IntStream.generate(random :: nextInt)
					.limit(1000000)
					.toArray();
			Arrays.parallelPrefix(number, Integer :: sum);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("parallel time taken: "+(end-start));
		return number;
	}
}
