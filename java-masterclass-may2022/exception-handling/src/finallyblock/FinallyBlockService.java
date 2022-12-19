package finallyblock;

import java.io.IOException;

public class FinallyBlockService {

	public static void serve(int option) throws IOException {
		System.out.println("serve started");

		switch (option) {
		case 0:
			System.out.println("serve processing success");
			break;

		case 1:
			throw new RuntimeException();
		case 2:
			throw new IOException();
		default:
			break;
		}

		System.out.println("serve ended");
	}
}
