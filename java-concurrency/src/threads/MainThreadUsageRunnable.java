package threads;

import utils.ThreadUtils;

public class MainThreadUsageRunnable {
	public static void main(String[] args) {
		// System.out.println("Running thread "+Thread.currentThread());
		String currentThread = Thread.currentThread().getName();
		System.out.println(ThreadUtils.ANSI_PURPLE+"jai shree ram says thread " + currentThread);

		//ThreadUtils.sleep(1000);
		//System.out.println("jai shree ram says thread " + Thread.currentThread().getName());

		// creating custom thread
		Thread t = new Thread(() -> {
			String currentThreadinner = Thread.currentThread().getName();
			ThreadUtils.sleep(1000);
			System.out.println(ThreadUtils.ANSI_GREEN+"jai shree ram says thread " + currentThreadinner);
		});
		t.start();
		//t.run();
		System.out.println(ThreadUtils.ANSI_PURPLE+"Task assigned to sperate thread by thread "+currentThread);
		ThreadUtils.join(200,t);
		//ThreadUtils.join(t);
		System.out.println(ThreadUtils.ANSI_PURPLE+"Task completed by thread " + currentThread);
	}
}
