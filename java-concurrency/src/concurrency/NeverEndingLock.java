package concurrency;

public class NeverEndingLock {
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			NeverEndingLock.neverNEdingLock();
			
		});
		Thread t2 = new Thread(() -> {
			NeverEndingLock.neverNEdingLock();
			
		});
		t.start();t2.start();
	}
	
	public static synchronized void neverNEdingLock() {
		System.out.println("task started");
		while(true) {
			//fake code
		}
	}
	
	public static synchronized void secondTask() {
		System.out.println("started second task");
	}
}
