package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class CachedThreadPoolDemo {

	public static void main(String[] args) {
		
		//no max limit keeps on adding new threads
		//at max 8 threads will be created as there are 8 tasks
		ExecutorService svc = Executors.newCachedThreadPool();
		
		ExecutorUtil.executeNTasks(svc, 8);
	}
}
