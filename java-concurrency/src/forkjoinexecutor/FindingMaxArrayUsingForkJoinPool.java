package forkjoinexecutor;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

public class FindingMaxArrayUsingForkJoinPool {
	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool();
		int[] data = IntStream.rangeClosed(1, 100).toArray();
		MAxFindRecustiveTask ka = new MAxFindRecustiveTask(data, 0, data.length);
		Integer invoke = pool.invoke(ka);
		System.out.println(invoke);
		System.out.println(data[invoke]);
		Arrays.stream(data).forEach(System.out::println);
	}
}

//need to return index having max value
class MAxFindRecustiveTask extends RecursiveTask<Integer> {
	private int start;
	private int end;
	private int[] data;
	private static final int THRESHOLD = 10;

	public MAxFindRecustiveTask(int[] data, int start, int end) {
		this.start = start;
		this.end = end;
		this.data = data;
	}

	@Override
	protected Integer compute() { // return type matches the <generic> type
		if (end - start <= THRESHOLD) { // is it a manageable amount of work?
			int position = 0; // if all values are equal, return position 0
			for (int i = start; i < end; i++) {
				if (data[i] > data[position]) {
					position = i;
				}
			}
			return position;
		} else { // task too big, split it
			int halfWay = ((end - start) / 2) + start;
			MAxFindRecustiveTask t1 = new MAxFindRecustiveTask(data, start, halfWay);
			t1.fork(); // queue left half of task
			MAxFindRecustiveTask t2 = new MAxFindRecustiveTask(data, halfWay, end);
			int position2 = t2.compute(); // work on right half of task
			int position1 = t1.join(); // wait for queued task to be complete
			// out of the position in two subsection which is greater?
			if (data[position1] > data[position2]) {
				return position1;
			} else if (data[position1] < data[position2]) {
				return position2;
			} else {
				return position1 < position2 ? position1 : position2;
			}
		}
	}
}
