package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//we can not fix nested synch as we can not open lock at one method and unlock in another
public class SelfDeadLockUsingSynch {
	Lock lock1 = new ReentrantLock();
	Lock lock2 = new ReentrantLock();

	public static void main(String[] args) {
//can occure in nested synchronized block as well
		// assume to do one task one thread need to aquire bitht the locks
		SelfDeadLockUsingSynch obj = new SelfDeadLockUsingSynch();
		Thread t1 = new Thread(() -> {
			obj.executeTask1();
		});
		Thread t2 = new Thread(() -> {
			obj.executeTask2();
		});
		t1.start();
		t2.start();
	}

	// this method is skipoin synchronzed as lock will handle it
	public void executeTask1() {
		while (true) {
			//try {

				// lock1.lock();
				// alreayd locked by thread 2
				// hence since there is not imeout it will go away to deadlock
				// lock2.lock();
				// if (aquireLockGoodWay(lock1, lock2)) {
				synchronized (lock1) {
					synchronized (lock2) {

						System.out.println("task1 completed ");
					}
				}
				// }

			//} finally {
				//lock1.unlock();
				//lock2.unlock();
			//}
		}
	}

	public void executeTask2() {
		while (true) {
			//try {

				// lock1.lock();
				// lock2.lock();
				// lock2.lock();
				// lock1.lock();
				// if (aquireLockGoodWay(lock1, lock2)) {
				// System.out.println("task2 completed ");
				// }
				synchronized (lock2) {
					synchronized (lock1) {

						System.out.println("task2 completed ");
					}
				}
		//	} finally {
			//	lock1.unlock();
				//lock2.unlock();
		//	}
		}
	}

	private boolean aquireLockGoodWay(Lock lock1, Lock lock2) {
		while (true) {
			boolean tryLock1 = false;
			boolean tryLock2 = false;
			try {
				tryLock1 = lock1.tryLock();
				tryLock2 = lock2.tryLock();
				if (tryLock1 && tryLock2) {
					return true;
				}
			} finally {
				// wont be unlcking both as once return is true we first use the loick do task
				// and then only close the locks
				if (tryLock1 && !tryLock2) {
					lock1.unlock();
				}
				if (tryLock2 && !tryLock1) {
					lock2.unlock();
				}
			}
		}
	}
}
