package concurrency;

import utils.ThreadUtils;

public class SelfProducerConsumer {
	private int size = 1;

	public void startOne() {
		while (true) {
			synchronized (this) {
				if (size == 10) {
					try {
						System.out.println("producer going to sleep");
						wait();
						// making count back to 0
						System.out.println("producer comming out of sleep");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("Started production for " + size);
				ThreadUtils.sleep(500);
				size++;
			}
		}
	}

	public void startTwo() {
		while (true) {
			synchronized (this) {

				if (size == 1) {
					notify();
				}
				System.out.println("Started consuming " + size);
				ThreadUtils.sleep(500);
				System.out.println("Ended consuming " + size);
				if (size > 1) {
					size--;
				}
			}
		}
	}

	public static void main(String[] args) {
		SelfProducerConsumer obj = new SelfProducerConsumer();
		Thread t1 = new Thread(() -> obj.startOne());
		Thread t2 = new Thread(() -> obj.startTwo());
		t1.start();
		// just allwoing one to start first always
		// one will be producer in future
		ThreadUtils.sleep(100);
		t2.start();
	}

}
