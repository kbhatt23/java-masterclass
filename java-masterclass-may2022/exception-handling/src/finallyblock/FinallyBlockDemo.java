package finallyblock;

import java.io.IOException;

public class FinallyBlockDemo {

	public static void main(String[] args) /* throws Exception */{
		System.out.println("main started");
		int option = 2;
		execute(option);
		System.out.println("main ended");
	}

	private static void execute(int option) /* throws Exception */{
		System.out.println("execute started");
		
		try {
			FinallyBlockService.serve(option);
			System.out.println("execute try block completed");
		} catch (IOException e) {
			System.out.println("execute IOException block");
			//throw e;
		}finally {
			System.out.println("execute finally block");
		}
		
		System.out.println("execute ended");
	}
}
