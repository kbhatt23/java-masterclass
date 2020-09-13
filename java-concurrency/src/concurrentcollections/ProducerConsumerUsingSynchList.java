package concurrentcollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import utils.ThreadUtils;

//this class uses concurrent collecton and hence no need to handle race condition using synchronzied

public class ProducerConsumerUsingSynchList {
	public static void main(String[] args) {
		// List<String> messages = Collections.synchronizedList(new ArrayList<>());
		List<String> messages = new ArrayList<>();
		Thread t1 = new Thread(new ListProducer(messages));
		Thread t2 = new Thread(new ListConsumer(messages));
		Thread t3 = new Thread(new ListConsumer(messages));
		t1.start();
		ThreadUtils.sleep(100);
		t2.start();
		t3.start();
	}
}

class ListProducer implements Runnable {
	// has to be shared in proces hepa
	// local objects might not be shared unless returned to second thread
	private List<String> messages;

	public ListProducer(List<String> messages) {
		this.messages = messages;
	}

	@Override
	public void run() {
		// a local variable in thread stack is untouched and od not need any
		// synchronztion
		// only shared object heap can uase thread concurrnecy issues
		// never ending addition to list
		int count = 1;
		while (true) {
			ThreadUtils.sleep(200);
			String message = "jai shree ram " + count;
			System.out.println("Adding message " + message);
			// local variable do not have sync issue
			// we need to handle only sharaebl resources
			synchronized (messages) {
				messages.add(message);
			}
			count++;
		}
	}

}

class ListConsumer implements Runnable {
	// has to be shared in proces hepa
	// local objects might not be shared unless returned to second thread
	private List<String> messages;

	public ListConsumer(List<String> messages) {
		this.messages = messages;
	}

	@Override
	public void run() {
		// never ending addition to list
		while (true) {
			// arraylocking queue makes us wait while reading until items are added
			// hence never comes indexout of bound exception
			synchronized (messages) {

				if (messages.isEmpty()) {
					ThreadUtils.sleep(100);
					System.out.println("consumer is waiting");
					continue;
				}
				// giving chance to producer to add mroe items, and wait till then
				ThreadUtils.sleep(100);
				// keep on removing from queue and using it
				String messgae = messages.remove(0);
				System.out.println("consuming message " + messgae);
			}
		}
	}

}
