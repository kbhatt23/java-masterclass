package executors;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPool {

	public static void main(String[] args) {
		
		//delayed();
		
		fixedRate();
	}

	private static void fixedRate() {
		ScheduledExecutorService svc = Executors.newSingleThreadScheduledExecutor();
	
		svc.scheduleAtFixedRate(new ExecutingTask(11), 0, 1, TimeUnit.MINUTES);
		
		System.out.println("fixed rate task submitted, expected start "+System.currentTimeMillis());
		//svc.shutdown();
		
		try {
			svc.awaitTermination(10, TimeUnit.SECONDS);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private static void delayed() {
		ScheduledExecutorService svc = Executors.newSingleThreadScheduledExecutor();
		
		svc.schedule(new ExecutingTask(9), 1, TimeUnit.MINUTES);
		System.out.println("delayed task submitted ,task should execute at epoc "+(System.currentTimeMillis()+60000));
		svc.shutdown();
	}
}
