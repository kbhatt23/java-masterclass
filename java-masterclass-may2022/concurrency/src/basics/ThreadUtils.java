package basics;

import java.util.concurrent.TimeUnit;

public class ThreadUtils {

	public static void sleepGracefully(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void sleepGracefully(TimeUnit timeUnit, long time) {
		try {
			timeUnit.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void sleepGracefullyNoTrace(long ms) {
		try {
			Thread.sleep(ms);
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
	}
}
