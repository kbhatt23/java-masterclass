package concurrency;

import utils.ThreadUtils;

public class WhyToUseSynchoronized_badfix {
	private int count;

	public synchronized void incrmentCount() {
		count++;
	}

	public static void main(String[] args) {
		//race condition happens when different thread have shared object hepa memory
		//if all the objects are different for each thread therer will be no rache condition
		WhyToUseSynchoronized_badfix obj1 = new WhyToUseSynchoronized_badfix();
		WhyToUseSynchoronized_badfix obj2 = new WhyToUseSynchoronized_badfix();
		Thread t = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				obj1.count++;
				//obj.incrmentCount();
			}
		});
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 10000; i++) {
				obj2.count++;
				//obj.incrmentCount();
			}
		});
		t.start();
		t1.start();
		// block until thread completes/
		// if we had given timeout, it will wiat unitl then and even though task is not
		// done thread main will contiune
		ThreadUtils.join(t);
		ThreadUtils.join(t1);
		System.out.println(obj1.count+ obj2.count);
	}
}
