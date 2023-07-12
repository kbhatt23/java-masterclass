package collectionsfactorymethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class SetOfUsage {

	public static void main(String[] args) {
		unmodifiableSet1();
		unmodifiableSet2();
		unmodifiableSet3();
	}

	private static void unmodifiableSet1() {
		Set<String> footballers = new HashSet<>();
		footballers.add("messi");
		footballers.add("kaka");
		footballers.add("ronaldinho");
		footballers.add("maradona");

		Set<String> unmodifiableList = Collections.unmodifiableSet(footballers);
		modifySet(unmodifiableList);
	}

	private static void unmodifiableSet2() {
		Set<String> footballers = new HashSet<>(Arrays.asList("messi", "kaka", "ronaldinho", "maradona"));

		Set<String> unmodifiableSet = Collections.unmodifiableSet(footballers);
		modifySet(unmodifiableSet);
	}

	private static void unmodifiableSet3() {
		Set<String> footballers = Set.of("messi", "kaka", "ronaldinho", "maradona");
		
		modifySet(footballers);
	}

	private static void modifySet(Set<String> footballers) {

		//footballers.add("cristiano");
		 footballers.remove("kaka");
		System.out.println(footballers);
	}

}
