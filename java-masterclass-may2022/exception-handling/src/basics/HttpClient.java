package basics;

import java.io.FileNotFoundException;
import java.io.IOException;

public class HttpClient {

	public static void send(int destination, String url) throws  IOException {
		System.out.println("Started Send");

		// destination can not be negative
		// bad case handling
		if (destination < 0) {
			throw new IllegalArgumentException("destination can not be negative,passed: " + destination);
		}

		// destination 0 means file based call and not network
		if (destination == 0) {
			handleFiles(url);
		} else if (destination == 1) {
			handleWebServiceCall(url);
		}

		System.out.println("Ended Send");
	}

	private static void handleWebServiceCall(String url) throws IOException {
		if (url == null || url.isEmpty()) {
			// file not present
			throw new IOException("unable to connect url,passed: " + url);
		} else {
			// logic to update file
			System.out.println("called url " + url);
		}
	}

	private static void handleFiles(String url) throws FileNotFoundException {
		if (url == null || url.isEmpty()) {
			// file not present
			throw new FileNotFoundException("file not found,passed: " + url);
		} else {
			// logic to update file
			System.out.println("updating file " + url);
		}
	}

}
