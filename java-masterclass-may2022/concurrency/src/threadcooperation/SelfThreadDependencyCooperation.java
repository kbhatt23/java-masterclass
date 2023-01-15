package threadcooperation;

import java.util.concurrent.ThreadLocalRandom;

import basics.ThreadUtils;

public class SelfThreadDependencyCooperation {
	public static void main(String[] args) {
		// usingJoin();

		// too muh cpu cycle cost
		// better to use wait and notify to free cpu
		usingVolatile();

		// usingWaitAndNotify();
	}

	private static void usingVolatile() {

		JobSynchronizer jobSynchronizer = new JobSynchronizer();
		Thread indexer = new Thread(new IndexerUsingVolatile(jobSynchronizer));
		indexer.start();

		Thread downloader = new Thread(new DownloaderUsingVolatile(jobSynchronizer));
		downloader.start();

	
	}

	private static void usingWaitAndNotify() {
		Object lock = new Object();
		Thread indexer = new Thread(new IndexerUsingWaitNotify(lock));
		indexer.start();

		ThreadUtils.sleepGracefully(10);
		Thread downloader = new Thread(new DownloaderUsingWaitNotify(lock));
		downloader.start();

	}

	private static void usingJoin() {
		Runnable taskOne = new DependencyUsingJoinJob(null);
		Thread workerOne = new Thread(taskOne);

		Runnable taskTwo = new DependencyUsingJoinJob(workerOne);
		Thread workerTwo = new Thread(taskTwo);

		workerOne.start();

		workerTwo.start();
	}
}

class DependencyUsingJoinJob implements Runnable {

	private Thread dependentThread;

	public DependencyUsingJoinJob(Thread dependentThread) {
		this.dependentThread = dependentThread;
	}

	@Override
	public void run() {
		if (dependentThread != null)
			try {
				dependentThread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} // executing thread waits for dependent thread

		System.out.println(Thread.currentThread().getName() + " started working");

		ThreadUtils.sleepGracefully(ThreadLocalRandom.current().nextLong(1000, 2000));

		System.out.println(Thread.currentThread().getName() + " completed working");
	}

}

class DownloaderUsingWaitNotify implements Runnable {

	private Object lock;

	public DownloaderUsingWaitNotify(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {

		downloadFiles();
	}

	private void downloadFiles() {
		synchronized (lock) {
			System.out.println("downloading started");

			ThreadUtils.sleepGracefully(ThreadLocalRandom.current().nextLong(2000, 4000));

			lock.notify();
			System.out.println("downloading completed");

		}
	}

}

class IndexerUsingWaitNotify implements Runnable {

	private Object lock;

	public IndexerUsingWaitNotify(Object lock) {
		this.lock = lock;
	}

	@Override
	public void run() {

		indexFiles();
	}

	private void indexFiles() {
		synchronized (lock) {

			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			System.out.println("indexing started");

			ThreadUtils.sleepGracefully(ThreadLocalRandom.current().nextLong(1000, 2000));

			System.out.println("indexing completed");
		}
	}

}

class DownloaderUsingVolatile implements Runnable {

	private JobSynchronizer jobSynchronizer;

	public DownloaderUsingVolatile(JobSynchronizer jobSynchronizer) {
		this.jobSynchronizer = jobSynchronizer;
	}

	@Override
	public void run() {

		downloadFiles();
	}

	private void downloadFiles() {
			System.out.println("downloading started");

			ThreadUtils.sleepGracefully(ThreadLocalRandom.current().nextLong(2000, 4000));

			System.out.println("downloading completed");
			jobSynchronizer.jobDone=true;
	}

}

class IndexerUsingVolatile implements Runnable {

	private JobSynchronizer jobSynchronizer;

	public IndexerUsingVolatile(JobSynchronizer jobSynchronizer) {
		this.jobSynchronizer = jobSynchronizer;
	}

	@Override
	public void run() {

		indexFiles();
	}

	private void indexFiles() {

		while (true) {
			if (jobSynchronizer.jobDone) {
				System.out.println("indexing started");

				ThreadUtils.sleepGracefully(ThreadLocalRandom.current().nextLong(1000, 2000));

				System.out.println("indexing completed");
				break;
			} else {
				System.out.println("indexer still waiting fow download to complete");
			}
		}
	}

}

//volatile is enough to show memory visiblity among caches
//no need of synchronizer nor atomicity and hence no need of sync bock nor atiomiinteger
class JobSynchronizer {

	public boolean jobDone;
}