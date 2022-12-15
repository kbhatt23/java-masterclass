package codetest;

public class DeadLockReplication {

	private Object lock1 = new Object();

	private Object lock2 = new Object();

	public static void main(String[] args) {
		DeadLockReplication deadLockReplication = new DeadLockReplication();
		Runnable job1  = () -> deadLockReplication.doTask1();
		
		Runnable job2  = () -> deadLockReplication.doTask2();
		new Thread(job1).start();
		
		new Thread(job2).start();
	}

	public void doTask1() {
		synchronized (lock1) {
			System.out.println("task1 aquired lock1");
			//sleep
			try {
				Thread.sleep(10);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			synchronized (lock2) {
				System.out.println("task1 aquired lock2");
				System.out.println("task 1 completed");
			}
		}
	}

	public void doTask2() {
		synchronized (lock2) {
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("task2 aquired lock2");
			synchronized (lock1) {
				System.out.println("task2 aquired lock1");
				System.out.println("task 2 completed");
			}
		}
	}
}
