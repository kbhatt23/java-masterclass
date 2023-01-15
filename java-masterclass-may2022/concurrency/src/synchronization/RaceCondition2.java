package synchronization;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class RaceCondition2 {

	private int count;

	// thread synchormizer: no need of synchornzation for this
	private CountDownLatch countDownLatch = new CountDownLatch(4);

	private List<Integer> numbers = new ArrayList<>();

	public synchronized void incrementCount() {
		count++;
	}

	public static void main(String[] args) {
		RaceCondition2 obj = new RaceCondition2();

		int taskSize = 100000;

		Thread thread1 = new Thread(new CounterWorker(obj, taskSize, obj.countDownLatch));
		Thread thread2 = new Thread(new CounterWorker(obj, taskSize, obj.countDownLatch));
		Thread thread3 = new Thread(new CounterWorker(obj, taskSize, obj.countDownLatch));
		Thread thread4 = new Thread(new CounterWorker(obj, taskSize, obj.countDownLatch));
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();

		try {
			obj.countDownLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("final arraylist size " + obj.numbers.size());
		//obj.numbers.stream().forEach(System.out::println);
	}

	public static class CounterWorker implements Runnable {
		private RaceCondition2 raceCondition;

		private int taskSize;

		private CountDownLatch countDownLatch;

		public CounterWorker(RaceCondition2 raceCondition, int taskSize, CountDownLatch countDownLatch) {
			this.raceCondition = raceCondition;
			this.taskSize = taskSize;
			this.countDownLatch = countDownLatch;
		}

		public void run() {
			for (int i = 0; i < taskSize; i++) {
				synchronized (raceCondition) {
					raceCondition.numbers.add(i);
				}
			}

			countDownLatch.countDown();
		}
	}

}
