package threads;

import utils.ThreadUtils;

public class MainThreadUsage {
	public static void main(String[] args) {
		// System.out.println("Running thread "+Thread.currentThread());
		System.out.println(ThreadUtils.ANSI_PURPLE+"jai shree ram says thread " + Thread.currentThread().getName());

		// creating custom thread
		Thread t = new Thread() {
			public void run() {
				ThreadUtils.sleep(1000);
				System.out.println(ThreadUtils.ANSI_GREEN+"jai shree ram says thread " + Thread.currentThread().getName());
			}
		};
		t.start();
		t.interrupt();
		
		System.out.println(ThreadUtils.ANSI_PURPLE+"Task assigned to sperate thread");
		ThreadUtils.join(t);
		System.out.println(ThreadUtils.ANSI_PURPLE+"Task completed by thread "+Thread.currentThread().getName());
	}
}
