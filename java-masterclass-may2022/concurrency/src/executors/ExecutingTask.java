package executors;

import basics.ThreadUtils;

public class ExecutingTask implements Runnable{

	private final int id;
	
	public ExecutingTask(int id) {
		this.id = id;
	}

	public void run() {
		System.out.println("Thread:"+ Thread.currentThread().getName()+" started task: "+id + " at epoch "+System.currentTimeMillis());
		
		ThreadUtils.sleepGracefully(2000);
		
		System.out.println("Thread:"+ Thread.currentThread().getName()+" ended task: "+id);
	}
}
