package localtypeinference;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class BasicTypeInference {

	public static void main(String[] args) {
		jdk7TypeInference();
		jdk8TypeInference();
		jdk10TypeInference();
	}

	private static void jdk10TypeInference() {
		String s = "sita ram";
		
		var s1 = "radhe shyam";
		System.out.println(s + "=" + s.length());
		System.out.println(s1 + "=" + s1.length());
	}

	private static void jdk8TypeInference() {
		Predicate<String> evenLengthStringPredicate = (String input) -> input.length() % 2 == 0 ;
		
		Predicate<String> evenLengthStringPredicateNew = input -> input.length() % 2 == 0 ;
		
		System.out.println(evenLengthStringPredicate.test("fake"));
		System.out.println(evenLengthStringPredicateNew.test("fake"));
	}

	private static void jdk7TypeInference() {
		// in jdk <=6
		List<String> names = new ArrayList<String>();
		
		//in jdk >=7
		List<String> namesKing = new ArrayList<>();
		names.add("first");
		
		namesKing.add("king first");
		System.out.println(names);
		System.out.println(namesKing);
	}
}
