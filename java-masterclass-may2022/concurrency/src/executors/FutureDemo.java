package executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureDemo {

	public static void main(String[] args) {
		
		ExecutorService svc = Executors.newSingleThreadExecutor();
		
		int tasks = 4;
		int totalSum = 0 ;
		Future<Integer>[] futures = new Future[tasks];
		for(int i = 0 ; i < tasks ; i++) {
			futures[i] = svc.submit(new FutureTask());
		}
		
		for(int i = 0 ; i < tasks ; i++) {
			try {
				totalSum += futures[i].get();
			} catch (InterruptedException | ExecutionException e) {
				e.printStackTrace();
			}
		}
		
		svc.shutdown();
		
		System.out.println(totalSum);
	}
}

