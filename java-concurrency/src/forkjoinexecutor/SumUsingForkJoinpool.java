package forkjoinexecutor;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

public class SumUsingForkJoinpool {
	public static void main(String[] args) {
		int[] data = IntStream.range(1, 1000).toArray();
		RecursiveSum task = new RecursiveSum(data, 0, data.length);
		int sum = new ForkJoinPool().invoke(task);
		
		System.out.println(sum);
		System.out.println(Arrays.stream(data).sum());
	}
}

class RecursiveSum extends RecursiveTask<Integer> {
	private int start;
	private int end;
	private int[] data;
	private static final int THRESHOLD = 10;

	public RecursiveSum(int[] data, int start, int end) {
		this.start = start;
		this.end = end;
		this.data = data;
	}

	@Override
	protected Integer compute() {
		if (end - start <= THRESHOLD) {
			// do sum
			int sum = 0;
			for (int i = start; i < end; i++) {
				sum += data[i];
			}
			return sum;
		} else {
			int mid = ((end - start) / 2) + start;
			RecursiveSum left = new RecursiveSum(data, start, mid);
			RecursiveSum right = new RecursiveSum(data, mid, end);
			left.fork();
			int computeresult = right.compute();
			int forkResult = left.join();
			return computeresult + forkResult;
		}
	}

}
