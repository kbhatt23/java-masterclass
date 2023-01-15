package locks;

import basics.ThreadUtils;

public class UninterruptedSynchronizedBlock {

	//lock for synchronized block
	//rmember synchronized block's lock can never be uninterrupted
	private static Object lock = new Object();
	
	public static void main(String[] args) {
		
		//Thread unitterruptedThread = uninterruptedSynchronized();
		Thread unitterruptedThread = manualnterruptedSynchronized();
		
		unitterruptedThread.start();
		
		ThreadUtils.sleepGracefully(5);
		//trying to interrupt
		//synchronized lock do not release the lock
		//until there is a try/catch or a boolean interrupted flag to break the loop
		
		//incase of synchronized block lock can not be release even in interruption
		// we need to write code to either break the loop or try catch interruptedexception
		//also lock is awaited for infinite amount of time
		unitterruptedThread.interrupt();
		
		synchronized (lock) {
			System.out.println("main aquired lock");
		}
	}

	private static Thread uninterruptedSynchronized() {
		Thread unitterruptedThread = new Thread(() -> {
			
			synchronized (lock) {
				System.out.println("Task Started");

				//big task
				for(int i = 0 ;  i < 10000; i++) {
					int a = i+1;
					System.out.println(a);
				}
				
				System.out.println("Task ended");
			}
			
		} );
		return unitterruptedThread;
	}
	

	private static Thread manualnterruptedSynchronized() {
		Thread unitterruptedThread = new Thread(() -> {
			
			synchronized (lock) {
				System.out.println("Task Started");

				//big task
				for(int i = 0 ;  i < 10000; i++) {
					if(Thread.currentThread().isInterrupted())
						break;
					int a = i+1;
					System.out.println(a);
				}
				
				System.out.println("Task ended");
			}
			
		} );
		return unitterruptedThread;
	}
	
}
