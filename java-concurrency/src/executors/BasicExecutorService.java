package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import utils.ThreadUtils;

public class BasicExecutorService {
	public static void main(String[] args) {

		// we cna have max 4 processors in my machine
		int availableProcessors = Runtime.getRuntime().availableProcessors();
		System.out.println("max processors " + availableProcessors);
		// useful for compuation things
		ExecutorService service = Executors.newFixedThreadPool(availableProcessors);
		// runnable is very light in cpompoarison to thread
		try {
			Runnable r = () -> {
				System.out.println("Jai shree ram from thread " + Thread.currentThread().getName());
				ThreadUtils.sleep(1000);
			};
			for (int i = 0; i < 8; i++) {
				service.submit(r);
			}
		} finally {
			//gracefull
			service.shutdown();
			
			//wont accept any new runnable object, however service will die only when all of them, are done
			/*
			 * Runnable r = () -> { System.out.println("Jai shree ram from thread " +
			 * Thread.currentThread().getName()); ThreadUtils.sleep(1000); };
			 * service.submit(r);
			 */
		}
		//assume we want to wait unitl 2 seconds only after that we can kill process
		//shutdwonnow will interrupt the runnign threads ->< interrupted exception will occue

		try {
			service.awaitTermination(1, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//after 2 second it will come to next line
		service.shutdownNow();
	}
}
