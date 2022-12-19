package trywithresources;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;

public class TryWithResourceDemo {

	public static void main(String[] args) {
		System.out.println("main started");
		int option = 1;
		execute(option);
		
		System.out.println("main ended");
	}

	private static void execute(int option) {
		System.out.println("execute started");

		try (CloseableResource a = new CloseableResource()) {
			runTask(option);
		} catch (IOException e) {
			Throwable[] suppressed = e.getSuppressed();
			StringBuilder s = new StringBuilder();
			for(Throwable t : suppressed) {
				s.append(t);
				s.append(" , ");
			}
			System.out.println("execute IOException block with suppressed: "+
					s
					);
			
			
		}
		System.out.println("execute ended");
	}

	private static void runTask(int option) throws IOException {
		System.out.println("runTask started");

		if (option == 1) {
			throw new IOException();
		}
		
		if(option == 2) {
			throw new RuntimeException();
		}

		System.out.println("runTask ended");
	}
}
