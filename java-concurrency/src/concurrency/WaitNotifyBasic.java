package concurrency;

import utils.ThreadUtils;

public class WaitNotifyBasic {

	public void startOne() {
		synchronized (this) {
			System.out.println("Started one");
			ThreadUtils.sleep(2000);
			try {
				System.out.println("One going to sleep");
				wait();
				System.out.println("One comming out of sleep");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Ended one");
		}
	}

	public void startTwo() {
		synchronized (this) {
			System.out.println("Started two");
			ThreadUtils.sleep(2000);
			// after current exceution it will awake thread who awakened me
			notify();
			System.out.println("Ended two");
		}
	}

	public static void main(String[] args) {
		WaitNotifyBasic obj = new WaitNotifyBasic();
		Thread t1 = new Thread(() -> obj.startOne());
		Thread t2 = new Thread(() -> obj.startTwo());
		t1.start();
		// just allwoing one to start first always
		// one will be producer in future
		ThreadUtils.sleep(100);
		t2.start();
	}
}
