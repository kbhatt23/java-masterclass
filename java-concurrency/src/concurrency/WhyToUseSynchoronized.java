package concurrency;

import utils.ThreadUtils;

public class WhyToUseSynchoronized {
	//wont help in race condition
	private /* volatile */ int count;

	public synchronized void incrmentCount() {
		count++;
	}

	public static void main(String[] args) {
		WhyToUseSynchoronized obj = new WhyToUseSynchoronized();
		Thread t = new Thread(() -> {
			//local varipable i is local stakc and hence change in one thread wont reflect in other thread
			int t1Count = 0;
			for (int i = 0; i < 10000; i++) {
				obj.count++;
				t1Count++;
				//hoever obj instanc is same and is present in heap of process and henc ethere will be race condition
				//obj.incrmentCount();
			}
			System.out.println("task completed by thread 1 with count "+t1Count);
		});
		Thread t1 = new Thread(() -> {
			int t1Count = 0;
			for (int i = 0; i < 10000; i++) {
				obj.count++;
				t1Count++;
				//obj.incrmentCount();
			}
			System.out.println("task completed by thread 2 with count "+t1Count);
		});
		t.start();
		t1.start();
		// block until thread completes/
		// if we had given timeout, it will wiat unitl then and even though task is not
		// done thread main will contiune
		ThreadUtils.join(t);
		ThreadUtils.join(t1);
		System.out.println(obj.count);
	}
}
