package basics;

import java.util.concurrent.CountDownLatch;

public class CreateThread1 {

	private static CountDownLatch latch = new CountDownLatch(1);
	
	//main thread runs the main method
	//atleast one thread that is main thread with its own method stack and run main method
	public static void main(String[] args) {
		System.out.println("Main started by: "+Thread.currentThread().getName());
		
		Thread worker = new Thread(new Task(latch)); // New state
		
		worker.start(); // Runnable : in queue for thread scheduler
		
		//to ensure that other tasks will be done
		try {
			latch.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Main completed by: "+Thread.currentThread().getName());
	}
}

//Runnable: contract that what is to be executed

class Task implements Runnable{
	
	private CountDownLatch latch ; 
	public Task(CountDownLatch latch ) {
		this.latch=latch;
	}
	
	public void run() {
		System.out.println("run started by: "+Thread.currentThread().getName());
		work();
		System.out.println("run completed by: "+Thread.currentThread().getName());
		latch.countDown();
	}

	private void work() {
		System.out.println("work started by: "+Thread.currentThread().getName());
		close();
		System.out.println("work completed by: "+Thread.currentThread().getName());
	}

	private void close() {
		System.out.println("close started by: "+Thread.currentThread().getName());		
		System.out.println("close completed by: "+Thread.currentThread().getName());		
	}
}
