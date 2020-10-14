package forkjoinexecutor;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;
import java.util.concurrent.ThreadLocalRandom;

public class ArraySeperation {
	public static void main(String[] args) {
		ForkJoinPool pool = new ForkJoinPool();
		int[] data  =new int[100];
		RecursiveArrayInitializtion task = new RecursiveArrayInitializtion(data, 0, data.length);
		pool.invoke(task);
		
		Arrays.stream(data).forEach(System.out::println);
	}
}

class RecursiveArrayInitializtion extends RecursiveAction {
	private int[] data;
	private int start;
	private int end;
	private static final int THRESHOLD = 10;

	public RecursiveArrayInitializtion(int[] data, int start, int end) {
		this.data = data;
		this.start = start;
		this.end = end;
	}

	@Override
	protected void compute() {
		// checc if broken down enough
		// since start will alwsys be 0 -> because we split and first part we give to
		// fork/queu, hence it will always be 0->start
		// size of a bathc will alwsys be equals to end
		System.out.println("start is "+start);
		if (end - start <= THRESHOLD) {
			for (int i = start; i < end; i++) {
				data[i] = ThreadLocalRandom.current().nextInt();
			}
		} else {
			// firs thalf in queue, secon half we do
			int mid = ((end - start) / 2) + start;
			RecursiveArrayInitializtion firstHalf = new RecursiveArrayInitializtion(data, start, mid);
			RecursiveArrayInitializtion secondHalf = new RecursiveArrayInitializtion(data, mid , end);
			firstHalf.fork();
			secondHalf.compute();
			firstHalf.join();
		}
	}

}