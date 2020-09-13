package concurrency;

import utils.ThreadUtils;

public class WhyToUseSynchoronized2 {
	int i;

	public static void main(String[] args) {
		WhyToUseSynchoronized2 obj = new WhyToUseSynchoronized2();
		Thread t1 = new Thread(() -> {
			for (; obj.i < 10; obj.i++) {
				obj.printName();
			}
		});
		Thread t2 = new Thread(() -> {
			for (; obj.i < 10; obj.i++) {
				obj.printName();
			}
		});
		t1.start();
		t2.start();

		ThreadUtils.join(t1);
		ThreadUtils.join(t2);
	}

	private synchronized void printName() {
		String name = Thread.currentThread().getName();
		switch (Thread.currentThread().getName()) {
		case "Thread-0":
			System.out.println(ThreadUtils.ANSI_PURPLE + "jai shree ram says thread " + name + " : " + i);
			break;
		case "Thread-1":
			System.out.println(ThreadUtils.ANSI_GREEN + "jai shree ram says thread " + name + " : " + i);
			break;

		default:
			break;
		}
	}
}
