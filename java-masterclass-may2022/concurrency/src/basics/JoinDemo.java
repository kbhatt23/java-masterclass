package basics;

import java.util.concurrent.TimeUnit;

public class JoinDemo {

	public static void main(String[] args) {
		System.out.println("main: started by " + Thread.currentThread().getName());
		

		Thread thread1 = new Thread(new JoinTask1(), "worker-1");
		Thread thread2 = new Thread(new JoinTask2(thread1), "worker-2");
		thread1.start();thread2.start();
		
		System.out.println("main: all tasks submitted by "+Thread.currentThread().getName());
		
		//main shouild let us know once all tasks are done
		
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main: completed by " + Thread.currentThread().getName());
	}
}

class JoinTask1 implements Runnable {

	public void run() {
		System.out.println("Task1 started by " + Thread.currentThread().getName());
		ThreadUtils.sleepGracefully(1000);
		System.out.println("Task1 completed by " + Thread.currentThread().getName());
	}

}

//task2 can only start once task1 is over
class JoinTask2 implements Runnable {
	private Thread dependentThread;

	public JoinTask2(Thread dependentThread) {
		this.dependentThread = dependentThread;
	}

	public void run() {
		
		//only start once dependentThread is done
		try {
			dependentThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Task2 started by " + Thread.currentThread().getName());
		ThreadUtils.sleepGracefully(TimeUnit.SECONDS, 2);
		System.out.println("Task2 completed by " + Thread.currentThread().getName());
	}

}
