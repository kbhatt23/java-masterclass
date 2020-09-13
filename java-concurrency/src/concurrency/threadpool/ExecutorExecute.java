package concurrency.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import utils.ThreadUtils;

public class ExecutorExecute {
public static void main(String[] args) {
	ExecutorService service = Executors.newFixedThreadPool(2);
	Runnable task = () -> {
		System.out.println("task started");
		ThreadUtils.sleep(1000);
		System.out.println("task completed");
	};
	//submission will be non blokcing
	for(int i =0 ; i< 6 ; i++) {
		service.execute(task);
	}
	//this actually doe snot shutdown
	//just knows that it wont accpet another task ,and once existing tasks are complete will kill main thread
	service.shutdown();
}

}
