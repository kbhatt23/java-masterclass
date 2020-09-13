package threads;

import utils.ThreadUtils;

public class MultipleThreadsUSage {
public static void main(String[] args) {
	String currentThread = Thread.currentThread().getName();
	System.out.println(ThreadUtils.ANSI_PURPLE+"jai shree ram says thread " + currentThread);
	
	Thread t1 = new Thread(() -> {
		ThreadUtils.sleep(2000);
		System.out.println("jai shree ram says thread "+Thread.currentThread().getName());
	});
	t1.start();
	//t1.interrupt();
	//ThreadUtils.join(t1);
	
	Thread t2 = new Thread(() -> {
		ThreadUtils.join(t1);
		ThreadUtils.sleep(2000);
		System.out.println("jai shree ram says thread "+Thread.currentThread().getName());
	});
	t2.start();
	
	System.out.println(ThreadUtils.ANSI_PURPLE+"Task completed by thread " + currentThread);
}
}
