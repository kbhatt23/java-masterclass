package basics;

//demonstrate priority
//demonstrate thread names
public class ThreadPriorityDemo {

	public static void main(String[] args) {
		System.out.println("main started");
		Thread email = new Thread(new CrawlerTask(), "email crawler");
		Thread db = new Thread(new CrawlerTask(), "db crawler");
		
		//higher priority tasks have gurantee of higher cpu time
		email.setPriority(Thread.MAX_PRIORITY);
		
		db.setPriority(Thread.MIN_PRIORITY);
		
		email.start();
		db.start();
		
		//extremely highly likely that email thread will close first and then db as db has less priority
		//since work for both are equal and cpu time for email is more it will close first
		//hence just join db thread
		
		try {
			db.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("main ended");
	}
}

class CrawlerTask implements Runnable{
	
	//Thread slicing may occur
	//but for sure the high priority thread will get more cpu time 
	public void run() {
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println("CrawlerTask executed by "+Thread.currentThread().getName());
		}
	}
}

