package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

import utils.ThreadUtils;

public class AtomicIntUsage {
	AtomicInteger counter = new AtomicInteger();
	//	int counter;
	public static void main(String[] args) {
		AtomicIntUsage obj = new AtomicIntUsage();

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				obj.counter.incrementAndGet();
				//obj.counter++;
			}
		});
		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				obj.counter.incrementAndGet();
				//obj.counter++;
			}
		});
		t1.start();
		t2.start();
		ThreadUtils.join(t1);
		ThreadUtils.join(t2);
		System.out.println(obj.counter.intValue());
		//System.out.println(obj.counter);
	}

}
