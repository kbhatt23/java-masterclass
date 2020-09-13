package concurrency;

import utils.ThreadUtils;

public class DeadlockSynch {
	public static void main(String[] args) {
		DeadlockSynch obj = new DeadlockSynch("kannu");
		//obj.sayHello("krishna");
		Thread t = new Thread(() -> obj.sayHello("krishna"));
		t.start();
		Thread t1 = new Thread(() -> obj.sayHello("krishna"));
		t1.start();
	}

	public DeadlockSynch(String name) {
		super();
		this.name = name;
	}

	private String name;

	private void sayHello(String otherPersonName) {
		synchronized (this) {
			ThreadUtils.sleep(100);
			System.out.println(this.name + " says hello to " + otherPersonName);
			sayHelloBack(otherPersonName);
		}
	}

	private void sayHelloBack(String otherPersonName) {
		synchronized (this) {
			System.out.println(otherPersonName + " says hello to " + this.name);
		}
	}
	}
