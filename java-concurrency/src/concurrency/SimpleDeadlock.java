package concurrency;

public class SimpleDeadlock {

	public static void main(String[] args) {
		SimpleDeadlock simpleDeadlock = new SimpleDeadlock();
		new Thread(() -> simpleDeadlock.method1()).start();
		;
		
		new Thread(() -> simpleDeadlock.method2()).start();
		;
	}
	
	public synchronized void method1() {
		System.out.println("method1 starts");
		method2();
		System.out.println("method1 ends");
	}

	public synchronized void method2() {
		System.out.println("method2 starts");
		
		System.out.println("method2 ends");
	}
}
