package executors;

import java.util.concurrent.Callable;

import basics.ThreadUtils;

public class FutureTask implements Callable<Integer>{

	public Integer call() {
		System.out.println(Thread.currentThread().getName()+" started running");
		
		ThreadUtils.sleepGracefully(1000);
		System.out.println(Thread.currentThread().getName()+" completed running");
		
		return 1;
	}
}
