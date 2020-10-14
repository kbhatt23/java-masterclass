package challenges;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Challenge1 {
	public static void main(String[] args) {
		Runnable r = () -> {
			String ka = "jai shree ram says the world and universe";
			Arrays.stream(ka.split(" ")).forEach(System.out::println);
		};
		new Thread(r).start();
		
		System.out.println(everySecondchar("jaishreeram"));
		
		Supplier<String> supp = () -> "jai shree ram and i love java";
		System.out.println(supp.get());
	}

	public static String everySecondchar(String source) {
		StringBuilder sb = new StringBuilder();
		Predicate<Integer> evenNumbers = i -> i % 2 == 0;
		Consumer<Character> consumer = c -> sb.append(c);
		for(int i=0; i < source.length(); i++) {
			if(evenNumbers.test(i)) {
				consumer.accept(source.charAt(i));
			}
		}
		return sb.toString();
	}
}
