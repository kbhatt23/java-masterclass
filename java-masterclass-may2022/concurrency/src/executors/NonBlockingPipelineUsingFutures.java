package executors;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import basics.ThreadUtils;

public class NonBlockingPipelineUsingFutures {

	private static final ExecutorService customerExecutorService = Executors.newFixedThreadPool(2);

	private static final ExecutorService sendEmailExecutorService = Executors.newFixedThreadPool(2);

	public static void main(String[] args) {

		// call one servive : time consuming
		
		Future<String> fetchCustomerEmail = fetchCustomerEmail(7);
		
		

		// take input of previous service and call another service
		Future<?> sendEmail = sendEmail(fetchCustomerEmail);

		
		//shutdown app
		customerExecutorService.shutdown();
		sendEmailExecutorService.shutdown();
		
		System.out.println("all tasks submitted");
		
		try {
			sendEmail.get();
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
		
		System.out.println("all tasks completed");
	}

	// call customer service to fetch name of the customer id
	private static Future<String> fetchCustomerEmail(int id) {

		return customerExecutorService.submit(() -> {
			System.out.println("fetching customername for " + id);
			ThreadUtils.sleepGracefully(2000);
			return "sita ram:" + id + "@gmail.com";
		});

	}

	private static Future<?> sendEmail(Future<String> emailFuture) {

		return sendEmailExecutorService.submit(() -> {
			try {
				System.out.println("sending email to " + emailFuture.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
			ThreadUtils.sleepGracefully(1000);
		});

	}
}
