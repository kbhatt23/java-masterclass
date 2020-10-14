package executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import utils.ThreadUtils;

public class FutureUSage {
	public static void main(String[] args) {
		Callable<String> callable = () -> {
			String name = Thread.currentThread().getName();
			System.out.println("jai shree ram from thread " + name);
			ThreadUtils.sleep(5000);
			return name;
		};
		ExecutorService svc = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		List<Future<String>> futures = new ArrayList<Future<String>>();
		try {
			for (int i = 0; i < 8; i++) {
				futures.add(svc.submit(callable));
			}

		} finally {
			// graceful
			svc.shutdown();
		}

		for (Future<String> future : futures) {
			//try cath inside each means if one future breaks other cna still be continued
			try {
				System.out.println("future obtained by thread " + future.get());
			} catch (Exception e) {

			}
		}
	}
}
