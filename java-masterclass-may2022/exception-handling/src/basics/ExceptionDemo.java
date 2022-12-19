package basics;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionDemo {

	public static void main(String[] args) {
		System.out.println("Started Main");
		//file cases
		//int destination = 0;
		// int destination = -1;
		//String url = "C:/destination/file1.txt";
		// String url = "";
		// String url = null;
		
		//webservice cases
		int destination = 1;
		//String url="www.google.com";
		String url="";
		
		share(destination, url);
		System.out.println("Ended Main");
	}

	private static void share(int destination, String url) {

		System.out.println("Started Share");
		try {
			HttpClient.send(destination, url);
		} catch (FileNotFoundException e) {
			System.out.println("FileNotFoundException occurred");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException occurred");
			e.printStackTrace();
		}

		System.out.println("Ended Share");
	}
}
