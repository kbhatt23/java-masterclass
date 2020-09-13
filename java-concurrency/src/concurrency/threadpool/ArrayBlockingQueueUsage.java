package concurrency.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import utils.ThreadUtils;

public class ArrayBlockingQueueUsage {

	private ArrayBlockingQueue<String> usage = new ArrayBlockingQueue<String>(10, true);
	Runnable producer = () -> {
		// no need to synch as it is witnin thread loca stakc ,no change of thread
		// inteference
		int index = 1;
		while (true) {
			// slleping just for making production time consuming
			ThreadUtils.sleep(5000);
			String message = "jai shree ram " + index;
			// once max capacity is reached it waits until it consumer revoves it
			try {
				usage.put(message);
				System.out.println("produced message " + message);
				index++;
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	};

	Runnable concumer = () -> {
		// no need to synch as it is witnin thread loca stakc ,no change of thread
		// inteference
		while (true) {
			// slleping just for making production time consuming
			ThreadUtils.sleep(500);
			String message;
			try {
				message = usage.take();
				System.out.println("consumed message " + message);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// once max capacity is reached it waits until it consumer revoves it
		}
	};

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(2);
		ArrayBlockingQueueUsage obj = new ArrayBlockingQueueUsage();
		service.execute(obj.producer);
		service.execute(obj.concumer);

		service.shutdown();
	}
}