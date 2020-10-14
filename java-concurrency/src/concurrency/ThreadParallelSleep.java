package concurrency;

import utils.ThreadUtils;

public class ThreadParallelSleep {
	public static void main(String[] args) {
		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				System.out.println("jai shree ram from thread1 " + i);
			}
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 5; i++) {
				try {
					//fake , as even though we are claling on t1 it actually is staic method and will do sleep for currnet running thead
					//whihc is t2
					t1.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("jai radha madhav from thread2 " + i);
			}
		});
		t1.start();
		t2.start();

	}
}
