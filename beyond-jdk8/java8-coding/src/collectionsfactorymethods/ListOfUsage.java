package collectionsfactorymethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListOfUsage {

	public static void main(String[] args) {
		// unmodifiableList1();
		// unmodifiableList2();
		unmodifiableList3();
	}

	private static void unmodifiableList1() {
		List<String> footballers = new ArrayList<>();
		footballers.add("messi");
		footballers.add("kaka");
		footballers.add("ronaldinho");
		footballers.add("maradona");

		List<String> unmodifiableList = Collections.unmodifiableList(footballers);
		modifyList(unmodifiableList);
	}

	private static void unmodifiableList2() {
		List<String> footballers = Arrays.asList("messi", "kaka", "ronaldinho", "maradona");

		List<String> unmodifiableList = Collections.unmodifiableList(footballers);
		modifyList(unmodifiableList);
	}

	private static void unmodifiableList3() {
		List<String> footballers = List.of("messi", "kaka", "ronaldinho", "maradona");
		
		modifyList(footballers);
	}

	private static void modifyList(List<String> footballers) {

		// footballers.add("cristiano");
		// footballers.remove("kaka");
		footballers.set(0, "Messi");
		System.out.println(footballers);
	}

}
