package concurrency;

import utils.ThreadUtils;

public class SimpleProducerConsumer {
	public int count = 1;
	public static void main(String[] args) {
		SimpleProducerConsumer lock = new SimpleProducerConsumer();
		Thread producer = new Thread(() -> lock.runProducer());
		Thread consumer = new Thread(() -> lock.runConsumer());
		producer.start();
		ThreadUtils.sleep(100);
		consumer.start();
	}



	public void runProducer() {
		while (true) {
			synchronized (this) {
				if(count == 10) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("producer started for item "+count);
				ThreadUtils.sleep(300);
				notify();
				
				//System.out.println("producer came out of sleep");
				count++;
			}
		}
	}


	public void runConsumer() {
		while (true) {
			synchronized (this) {
				if(count == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				System.out.println("consumer started for item "+count);
				ThreadUtils.sleep(500);
				notify();
				//System.out.println("consumer completed");
				count--;
			}
		//ThreadUtils.sleep(50);
		}
	}

}