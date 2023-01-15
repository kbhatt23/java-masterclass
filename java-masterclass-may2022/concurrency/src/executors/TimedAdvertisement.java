package executors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import basics.ThreadUtils;

public class TimedAdvertisement {

	private static final ExecutorService service = Executors.newFixedThreadPool(4);

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		// look for ads from multiple sources in parallel
		// have a time out after which whaterver is fetched is returned
		// after timeout if some task is runnign has to be stopped
		// merge all data and return

		List<String> fetchAllAds = new TimedAdvertisement().fetchAllAds(3, TimeUnit.SECONDS);
		System.out.println(fetchAllAds);
		
		System.out.println("total time "+( System.currentTimeMillis() - start));
	}

	private List<String> fetchAllAds(long timeout, TimeUnit timeUnit) {

		Callable<List<String>> sourceOneCall = () -> sourceOne();

		Callable<List<String>> sourceTwoCall = () -> sourceTwo();

		Callable<List<String>> sourceThreeCall = () -> sourceThree();

		Callable<List<String>> sourceFourCall = () -> sourceFour();

		List<String> ads = new ArrayList<>();
		try {
			List<Future<List<String>>> invokeAll = service.invokeAll(
					Arrays.asList(sourceOneCall, sourceTwoCall, sourceThreeCall, sourceFourCall), timeout, timeUnit);
			service.shutdown();
			for (Future<List<String>> future : invokeAll) {
				if (!future.isCancelled()) {
					try {
						ads.addAll(future.get());
					} catch (ExecutionException e) {
						// e.printStackTrace();
						System.out.println("task got timedout/cancelled");
					}
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		return ads;
	}

	private List<String> sourceOne() {
		System.out.println("source one fetching");
		ThreadUtils.sleepGracefully(2000);

		return Arrays.asList("jai shree sita rama lakshman hanuman");
	}

	private List<String> sourceTwo() {
		System.out.println("source two fetching");
		ThreadUtils.sleepGracefully(4000);

		return Arrays.asList("fake hai sala");
	}

	private List<String> sourceThree() {
		System.out.println("source three fetching");
		ThreadUtils.sleepGracefully(1000);

		return Arrays.asList("jai uma mahesh", "jai hari hara");
	}

	private List<String> sourceFour() {
		System.out.println("source four fetching");
		ThreadUtils.sleepGracefully(8000);

		return Arrays.asList("ghatia banda");
	}
}
