package stringapienhancements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ReadEscapedLineFromFile {

	public static void main(String[] args) {
		try(Stream<String> linesStream =  Files.lines(Paths.get("escapedlines.txt"))){
			linesStream
			//.filter(line -> !line.isEmpty())
			.filter(Predicate.not(String :: isEmpty))
			.map(String :: translateEscapes)// without this the file data will still contain special chars
			.forEach(System.out::println);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
