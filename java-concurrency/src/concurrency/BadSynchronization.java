package concurrency;

import utils.ThreadUtils;

public class BadSynchronization {
	/*
	 * public synchronized BadSynchronization() {
	 * 
	 * }
	 */
	public static void main(String[] args) {
		BadSynchronization obj = new BadSynchronization();
		Thread t1 = new Thread(() -> obj.method1());
		Thread t2 = new Thread(() -> obj.method2());
		
		t1.start();t2.start();
		ThreadUtils.join(t1);ThreadUtils.join(t2);
	}
	//synchroizied method is global lock
	//meaning if more than one method are synch then if one thread is exceuting one method,
	//other thread will wait for this to be over until it can aquire lock to get method2 access
	private synchronized void method1() {
		System.out.println("method 1 started");
		ThreadUtils.sleep(4000);
		System.out.println("method 1 ended");
	}
	
	private synchronized void method2() {
		System.out.println("method 2 started");
		ThreadUtils.sleep(4000);
		System.out.println("method 2 ended");
	}
}
