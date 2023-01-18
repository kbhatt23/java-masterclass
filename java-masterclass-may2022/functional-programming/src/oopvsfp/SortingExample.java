package oopvsfp;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingExample {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("kanishk", "sitarama", "pavanputrahanuman", "lakshman");
		
		System.out.println("before sort: "+names);
		
		sortUsingOOPS(names);
		
		System.out.println("after sort: "+names);
		
		names = Arrays.asList("kanishk", "sitarama", "pavanputrahanuman", "lakshman");
		
		System.out.println("v2 before sort: "+names);
		sortUsingFP(names);
		System.out.println("v2 after sort: "+names);
	}

	//too much imperative
	//less readable
	//less space efficent as 2 .class are created
	//less elegant and reusable
	private static void sortUsingOOPS(List<String> names) {
		names.sort(new Comparator<String>() {
			public int compare(String a, String b) {
				return a.compareTo(b);
			}
		});
		
	}
	
	private static void sortUsingFP(List<String> names) {
		names.sort(String :: compareTo);
	}
}
