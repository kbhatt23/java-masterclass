package executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorUtil {

	private ExecutorUtil() {
	}

	public static void executeNTasks(ExecutorService service, int count) {

		for (int id = 1; id <= count; id++) {
			Runnable task = new ExecutingTask(id);
			service.execute(task);
		}

		service.shutdown();

	}

	public static void executeNTasksInterruptedly(ExecutorService service, int count, long waitTime,
			TimeUnit waitUnit) {

		for (int id = 1; id <= count; id++) {
			Runnable task = new ExecutingTask(id);
			service.execute(task);
		}

		service.shutdown();

		// the thread that is running the method executeNTasksInterruptedly(main for our
		// demo) will wait
		// will wait until timeout happens and on timeout it will interrupt working main
		// thread

		try {
			service.awaitTermination(waitTime, waitUnit);
		} catch (InterruptedException e) {
			System.out.println("exceutor task interrupted");
		}

		while (!service.isTerminated()) {
		}
		System.out.println("all job completed by " + Thread.currentThread().getName());
	}

	public static void executeNTasksWithTimeOut(ExecutorService service, int count, long waitTime, TimeUnit waitUnit) {
		Runnable task = null;
		for (int id = 1; id <= count; id++) {
			task = new ExecutingTask(id);
			service.execute(task);
		}
		// do not accept any new tasl
		// throws runtimeexception if after this line a new task is submitted
		// svc will terminate only when tasks are done
		service.shutdown();

	    //default wait of with no awaitTermination is infinite
		//now we can block the main thread
		//if timeout happens throws timeoutexception , 
		//for interruption throws interrupted exception
		//if main thread is interrupted before timeout
		try {
			service.awaitTermination(waitTime, waitUnit);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//force shutdown
		service.shutdownNow();
	}

}
