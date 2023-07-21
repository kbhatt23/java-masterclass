package filesenhancements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class FileReadAndWriteString {

	private static final Path readPath = Paths.get("readthis.txt");
	private static final Path writePath = Paths.get("writethis.txt");

	public static void main(String[] args) {
		// readStringBeforeJDK11();
		// readString();
		//readLinesSeperatelyEager();
		readLinesSeperatelyLazy();
		writeLines();
	}

	private static void writeLines() {
		try {
			Files.writeString(writePath, "jai gauri ganesh mahesh");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readLinesSeperatelyLazy() {
		try {
			//this method is lazy
			//loads data from file to jvm mememory one by one
			//hence useful for big files and saves outofmemoryerror
			Stream<String> lines = Files.lines(readPath);
			lines.forEach(line -> System.out.println("readLinesSeperatelyLazy.line: "+line));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void readLinesSeperatelyEager() {
		try {
			// this method is eager , loads all the data in this single string
			// hence use for smaller files only
			// for large file since it loads everything to jvm can cause outofmemoryerror
			List<String> readAllLines = Files.readAllLines(readPath);
			for(String line: readAllLines) {
				System.out.println("readLinesSeperatelyEager.line: "+line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readStringBeforeJDK11() {
		try {
			// this method is eager , loads all the data in this single string
			// hence use for smaller files only
			// for large file since it loads everything to jvm can cause outofmemoryerror
			byte[] readAllBytes = Files.readAllBytes(readPath);
			String allData = new String(readAllBytes);
			System.out.println("readStringBeforeJDK11.allData: " + allData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void readString() {
		try {
			// this method is eager , loads all the data in this single string
			// hence use for smaller files only
			// for large file since it loads everything to jvm can cause outofmemoryerror
			String allData = Files.readString(readPath);
			System.out.println("readString.allData: " + allData);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
