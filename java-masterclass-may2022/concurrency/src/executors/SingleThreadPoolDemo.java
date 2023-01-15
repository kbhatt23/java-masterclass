package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SingleThreadPoolDemo {

	public static void main(String[] args) {
		
		//ExecutorService interface extends Executor intrface
		ExecutorService svc = Executors.newSingleThreadExecutor();
		
		int count = 4;
		//ExecutorUtil.executeNTasks(svc, count);
		
		//mimicking timeout
		ExecutorUtil.executeNTasksWithTimeOut(svc, count, 4, TimeUnit.SECONDS);
	}
}
