package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class FixedThreadPoolDemo {

	public static void main(String[] args) {
		
		System.out.println("total processors "+Runtime.getRuntime().availableProcessors());
		
		ExecutorService svc = Executors.newFixedThreadPool(1);
		((ThreadPoolExecutor)svc).setCorePoolSize(2);
		
		ExecutorUtil.executeNTasks(svc, 8);
		
		
		
	}
}
