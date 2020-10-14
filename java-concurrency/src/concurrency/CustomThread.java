package concurrency;

public class CustomThread extends Thread {

	public void run() {
		System.out.println("jai shree ram within main run method from thread " + Thread.currentThread().getName());
		run("jai shree ram");
	}

	private void run(String string) {
		System.out.println("jai shree ram after main run method from thread " + Thread.currentThread().getName());
	}
	public static void main(String[] args) {
		System.out.println("main thread says jai shree ram");
		CustomThread obj = new CustomThread();
		obj.start();
		System.out.println("main thread terminated and says jai shree ram");
	}
}
