package exercise;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FindLinesBetweenHashes {

	public static void main(String[] args) {
		try {
			List<String> lines = Files.readAllLines(Paths.get("data.txt"));
			lines.stream()
			    .dropWhile(line -> !FindLinesBetweenHashes.lineContainsHash(line))
			    .skip(1)
			    .takeWhile(line -> !FindLinesBetweenHashes.lineContainsHash(line))
			    .forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static boolean lineContainsHash(String line) {
		return line != null && line.length() == 1 && line.charAt(0) == '#';
	}
}
