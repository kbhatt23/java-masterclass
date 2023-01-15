package threadcooperation;

import basics.ThreadUtils;

public class BasicInterruption {
	public static void main(String[] args) {
		System.out.println("main started");
		//JDK do not allow force stop
		//it allows only graceful shutdown
		//hence a notification is snet to woker thread to clean up resource
		//eg: if thread had opened db/io connection pool on interruption it can close this connection
		
		//basicinterruption();
		
		interruptionWithWaitAndSleep();
	}

	private static void interruptionWithWaitAndSleep() {

		BlockingInterruptableThred t = new BlockingInterruptableThred();
		
		t.start();
		
		ThreadUtils.sleepGracefully(2000);
		
		t.interrupt();
	
	}

	private static void basicinterruption() {
		InterruptableThred t = new InterruptableThred();
		
		t.start();
		
		ThreadUtils.sleepGracefully(10);
		
		t.interrupt();
	}
}

class InterruptableThred extends Thread{
	
	public void run() {
		
		while(!isInterrupted()) {
			System.out.println("Working on task");
		}
		
		System.out.println("All Task done, doing cleanup"); //do cleanup task
	}
}

class BlockingInterruptableThred extends Thread{
	
	public void run() {
		
		while(true) {
			System.out.println("Working on task");
			
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				//can do cleanup task here or at finally
				System.out.println("interrupted exception: "+e);
				break;
			}
			
			//waiting or sleeping : for both we have interrupted exception to actually do gracefull shutdown
		}
		
		System.out.println("All Task done, doing cleanup"); //do cleanup task
	}
}
