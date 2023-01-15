package locks;

import java.util.concurrent.CountDownLatch;

public class BasicReadWriteLock {

	private static final int ITERATION = 100000;

	private Object readLock = new Object();
	
	private Object writeLock = new Object();

	public static void main(String[] args) {
		new BasicReadWriteLock().singleLockForReadAndWrite();
		//new BasicReadWriteLock().seperateLockForReadAndWrite();
	}

	private void singleLockForReadAndWrite() {
		long start = System.currentTimeMillis();
		CountDownLatch latch = new CountDownLatch(2);
		new Thread(() -> {
			System.out.println("t1 started");
			for (int i = 0; i < ITERATION; i++) {
				read(i);
			}
			latch.countDown();
		}).start();

		new Thread(() -> {
			System.out.println("t2 started");
			for (int i = 0; i < 1000; i++) {
				write(i);
			}
			latch.countDown();
		}).start();

		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();
		System.out.println("singleLockForReadAndWrite: total time taken " + (end - start));
	}

	private /* synchronized */ void read(int i) {
		synchronized (this) {
			System.out.println("read data: " + i);
		}
	}

	private /* synchronized */ void write(int i) {
		synchronized (this) {
			System.out.println("write data: " + i);
		}
	}

	private void seperateLockForReadAndWrite() {
		long start = System.currentTimeMillis();
		CountDownLatch latch = new CountDownLatch(2);
		new Thread(() -> {
			System.out.println("t1 started");
			for (int i = 0; i < ITERATION; i++) {
				readV1(i);
			}
			latch.countDown();
		}).start();

		new Thread(() -> {
			System.out.println("t2 started");
			for (int i = 0; i < ITERATION; i++) {
				writeV1(i);
			}
			latch.countDown();
		}).start();

		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();
		System.out.println("singleLockForReadAndWrite: total time taken " + (end - start));
	}

	private /* synchronized */ void readV1(int i) {
		synchronized (readLock) {
			System.out.println("read data: " + i);
		}
	}

	private /* synchronized */ void writeV1(int i) {
		synchronized (writeLock) {
			System.out.println("write data: " + i);
		}
	}
}
