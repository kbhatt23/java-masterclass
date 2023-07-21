package predicateenhancements;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PredicateEnhancementDemo {
	private static final Path readPath = Paths.get("readthis.txt");
	
	private static final Predicate<String> isBlankPredicate = String :: isBlank; 

	public static void main(String[] args) {
		skipBlanklinesAndReadApproach1();
		skipBlanklinesAndReadApproach2();
		skipBlanklinesAndReadApproach3();
	}

	private static void skipBlanklinesAndReadApproach3() {
		try (Stream<String> linesStream = Files.lines(readPath)) {
			List<String> lines = linesStream.filter(Predicate.not(String :: isBlank))
											.collect(Collectors.toList());

			System.out.println("skipBlanklinesAndReadApproach3.lines: " + lines);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

	private static void skipBlanklinesAndReadApproach1() {

		try (Stream<String> linesStream = Files.lines(readPath)) {
			List<String> lines = linesStream.filter(line -> !line.isBlank())
											.collect(Collectors.toList());

			System.out.println("skipBlanklinesAndReadApproach1.lines: " + lines);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void skipBlanklinesAndReadApproach2() {
		//even less readable than approach 1
		try (Stream<String> linesStream = Files.lines(readPath)) {
			List<String> lines = linesStream.filter(isBlankPredicate.negate())
											.collect(Collectors.toList());

			System.out.println("skipBlanklinesAndReadApproach2.lines: " + lines);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
