package concurrency;

import utils.ThreadUtils;

public class DaemonThreadUsage {
public static void main(String[] args) {
	System.out.println("main started ");
	Thread t = new Thread() {
		@Override
		public void run() {
			for(int i=0 ; i<10 ; i++) {
				System.out.println("Iterating index "+i+" by thread "+Thread.currentThread().getName());
				ThreadUtils.sleep(100);
			}
		}
	};
	t.setDaemon(true);
	Thread t1 = new Thread() {
		@Override
		public void run() {
			for(int i=0 ; i<10 ; i++) {
				System.out.println("Iterating index "+i+" by thread "+Thread.currentThread().getName());
				ThreadUtils.sleep(50);
			}
		}
	};
	t.start();
	t1.start();
	System.out.println("main ended");
}
}
