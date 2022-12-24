package arrayutility;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class ParallelSortDemo {

	public static void main(String[] args) {
		sequentialSort();
		parallelSort();
	}

	private static void sequentialSort() {
		long start = System.currentTimeMillis();
		Random random = new Random();
		for(int i = 0 ; i < 100 ; i++) {
			int[] number = IntStream.generate(random :: nextInt)
					.limit(1000000)
					.toArray();
			Arrays.sort(number);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("sequential time taken: "+(end-start));
	}
	
	private static void parallelSort() {
		long start = System.currentTimeMillis();
		Random random = new Random();
		for(int i = 0 ; i < 100 ; i++) {
			int[] number = IntStream.generate(random :: nextInt)
					.limit(1000000)
					.toArray();
			Arrays.parallelSort(number);
		}
		long end = System.currentTimeMillis();
		
		System.out.println("parallel time taken: "+(end-start));
	}
}
