package common;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrintUtility {

	public static void printJoinedStream(Stream<?> stream,String msg) {
		System.out.println(msg+stream.map(String::valueOf)
			.collect(Collectors.joining(",")));
	}
}
