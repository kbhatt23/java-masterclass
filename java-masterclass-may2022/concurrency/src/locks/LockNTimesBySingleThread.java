package locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import basics.ThreadUtils;

public class LockNTimesBySingleThread {

	public static void main(String[] args) {
		Lock lock = new ReentrantLock();
		new Thread(
				() -> {
					lock.lock();
					//must unlock 2 times or else oteer thread will keep on waiting and starve infinitely
					lock.lock();
					
					try {
						System.out.println("task1 started");
						ThreadUtils.sleepGracefully(2000);
						System.out.println("task1 completed");
					}finally {
						lock.unlock();
						lock.unlock();
					}
				
				}
				).start();
		
		new Thread(
				() -> {
					lock.lock();
					
					try {
						System.out.println("task2 started");
						ThreadUtils.sleepGracefully(2000);
						System.out.println("task2 completed");
					}finally {
						lock.unlock();
					}
				
				}
				).start();
	}
}
