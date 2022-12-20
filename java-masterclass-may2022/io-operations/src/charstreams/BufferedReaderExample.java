package charstreams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

	public static void main(String[] args) {
		String fileName = "files/names.txt";
		try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
			String line = null;
			while ( (line=reader.readLine()) != null) {
				System.out.println("Fetched name "+line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
