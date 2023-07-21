package stringenhancements;

public class StringBlankDemo {

	public static void main(String[] args) {
		var empty = "";
		
		System.out.println(empty.isEmpty());
		
		var blank = " ";
		System.out.println(blank.isBlank());
		System.out.println(blank.trim().isEmpty());
		System.out.println("    ".isBlank());
		
		System.out.println("    ".trim().isEmpty());
		
		System.out.println("   a b  ".trim());
		
	}
}
