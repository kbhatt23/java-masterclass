package charstreams;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class BufferedAndPrintWriters {
	private static String[] names = { "sita rama lakshman hanuman", "uma mahesh karthikeya ganesh nandi" };

	public static void main(String[] args) {
		bufferedWriter();
		printWriter();
	}

	private static void bufferedWriter() {
		String fileName = "files/names1.txt";
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
			for (String name : names)
				writer.write(name);
			writer.newLine();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void printWriter() {
		String fileName = "files/names2.txt";
		try (PrintWriter writer = new PrintWriter(fileName)) {
			for (String name : names)
				writer.println(name);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
