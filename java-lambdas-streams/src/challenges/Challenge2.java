package challenges;

import java.util.Arrays;
import java.util.List;

public class Challenge2 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("sita", "ram", "radhe", "shyam", "ramaDuta hanuman", "ram bhakta kannu");

		names.stream()
			.map(name -> {
				StringBuilder sb = new StringBuilder();
				sb.append(name.toUpperCase().charAt(0));
				sb.append(name.toLowerCase().substring(1));
				return sb.toString();
			})
			.forEach(System.out::println);
			;
	}
}
