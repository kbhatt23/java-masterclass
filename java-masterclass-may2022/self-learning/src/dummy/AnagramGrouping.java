package dummy;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AnagramGrouping {

	public static void main(String[] args) {
		String str = "cat tac act god dog gad";

		System.out.println(groupAnagrams(str));
	}
	
	public static Collection<List<String>> groupAnagrams(String str ){
		
		String[] words = str.split(" ");
		
		Map<Map<Character, Integer>, List<String>> collect = Arrays.stream(words)
		    .collect(Collectors.groupingBy(AnagramGrouping :: transformAnagram));
		
		return collect.values();
	}
	
	public static Map<Character, Integer> transformAnagram(String word){
		
		Map<Character, Integer> countMAp = new HashMap<>();
		for(char c : word.toCharArray()) {
			if(countMAp.containsKey(c)) {
				countMAp.put(c, countMAp.get(c) + 1);
			}else {
				countMAp.put(c, 1);
			}
		}
		return countMAp;
	}
}
