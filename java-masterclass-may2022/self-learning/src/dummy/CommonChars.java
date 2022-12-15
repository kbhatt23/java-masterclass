package dummy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CommonChars {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("aec", "bcge" , "aec");
		System.out.println(commonChars(words));
	}
	
	public static Set<Character> commonChars(List<String> words ){
		List<Set<Character>> charList = words.stream()
		    .map(CommonChars :: allChars)
		    
		    .collect(Collectors.toList());
		
		Set<Character> first = charList.get(0);
		for(int i = 1; i < charList.size() ; i++) {
			first.retainAll(charList.get(i));
		}
		
		return first;
	}
	
	public static Set<Character> allChars(String word){
		Set<Character> chars = new HashSet<>();
		for(char c: word.toCharArray()) {
			chars.add(c);
		}
		
		return chars;
	}
}
