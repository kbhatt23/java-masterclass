package threads;

import utils.ThreadUtils;

public class InterruptThreadUSage {
	public static void main(String[] args) {
		System.out.println("jai shree ram says thread " + Thread.currentThread().getName());

		Thread t = new Thread(() -> {
			try {
				Thread.sleep(3000);
				System.out.println("jai shree ram says thread " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		});
		t.start();

		 ThreadUtils.sleep(1000);
		t.interrupt();
		System.out.println("task completed by thread " + Thread.currentThread().getName());
	}
}
