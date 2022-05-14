package problems;

import java.util.Arrays;

public class CapitalizeFirstChar {

	private static final String SPACE = " ";

	public static void main(String[] args) {
		String a = "jai shree ram is a great slogan";
		System.out.println("capitalizing string: " + a);

		// stirng is immutable and hence wont update a and here a new splitted string[]
		// is received
		StringBuilder sb = new StringBuilder();
		int index = 0;

		String[] words = a.split(SPACE);
		int lastIndex = words.length - 1;
		for (String word : words) {
			// do not capitalize when there is a single char
			if (word.length() == 1)
				sb.append(word);
			else
				sb.append(word.substring(0, 1).toUpperCase() + word.substring(1));

			if (index < lastIndex)
				sb.append(SPACE);

			index++;
		}

		System.out.println("output " + sb.toString());
	}
}
