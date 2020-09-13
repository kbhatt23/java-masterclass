package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import utils.ThreadUtils;

public class BadSynchronizationBlock {
	/*
	 * public synchronized BadSynchronization() {
	 * 
	 * }
	 */
	private Lock lock1 = new ReentrantLock();
	private Lock lock2 = new ReentrantLock();
	public static void main(String[] args) {
		BadSynchronizationBlock obj = new BadSynchronizationBlock();
		Thread t1 = new Thread(() -> obj.method1());
		Thread t2 = new Thread(() -> obj.method2());
		Thread t11 = new Thread(() -> obj.method1());
		Thread t22 = new Thread(() -> obj.method2());

		t1.start();
		t2.start();
		t11.start();t22.start();
		ThreadUtils.join(t1);
		ThreadUtils.join(t2);
		ThreadUtils.join(t22);
		ThreadUtils.join(t11);
	}

	// synchroizied method is global lock
	// meaning if more than one method are synch then if one thread is exceuting one
	// method,
	// other thread will wait for this to be over until it can aquire lock to get
	// method2 access
	private void method1() {
		synchronized (lock1) {
			System.out.println("method 1 started");
			ThreadUtils.sleep(4000);
			System.out.println("method 1 ended");
		}

	}

	private void method2() {
		synchronized (lock2) {
			System.out.println("method 2 started");
			ThreadUtils.sleep(4000);
			System.out.println("method 2 ended");
		}
	}
}
