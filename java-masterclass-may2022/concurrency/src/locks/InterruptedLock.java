package locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import basics.ThreadUtils;

public class InterruptedLock {

	//with reentrant lock we can aquire interruptable and finite time wait locks
	private static Lock lock = new ReentrantLock();
	
	public static void main(String[] args) {
		
		//Thread unitterruptedThread = lockMetod();
		
		Thread unitterruptedThread = lockInterruptedMetod();
		
		unitterruptedThread.start();
		
		ThreadUtils.sleepGracefully(1);
		
		unitterruptedThread.interrupt();
		
		lock.lock();
		try {
			System.out.println("main aquired lock");
		}finally {
			lock.unlock();
		}
	}

	private static Thread lockMetod() {
		Thread unitterruptedThread = new Thread(() -> {
			
			lock.lock();
			try {
				System.out.println("Task Started");

				//big task
				for(int i = 0 ;  i < 10000; i++) {
					int a = i+1;
					System.out.println(a);
				}
				
				System.out.println("Task ended");
			}finally {
				lock.unlock();
			}
			
		} );
		return unitterruptedThread;
	}
	
	private static Thread lockInterruptedMetod() {
		Thread unitterruptedThread = new Thread(() -> {
			
			
			//lock.lockInterruptibly();
			try {
				lock.lockInterruptibly();
				System.out.println("Task Started");

				//big task
				for(int i = 0 ;  i < 10000; i++) {
					int a = i+1;
					System.out.println(a);
				}
				
				System.out.println("Task ended");
			} catch (InterruptedException e) {
				System.out.println("clean up");
			}finally {
				lock.unlock();
			}
			
		} );
		return unitterruptedThread;
	}
	

}
