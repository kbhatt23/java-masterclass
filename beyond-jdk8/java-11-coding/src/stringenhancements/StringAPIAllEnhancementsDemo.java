package stringenhancements;

public class StringAPIAllEnhancementsDemo {
	private static final String emptyString = "";
	private static final String singleCharString = "a";
	private static final String blankSpacesString = "    ";
	private static final String blankSpacesCharString = "  a  ";
	private static final String blankSpacesMultiCharString = "  a b  ";
	public static void main(String[] args) {
		//isEmptyDemo();
		//trimDemo();
		//isBlankDemo();
		//repeatDemo();
		linesDemo();
	}

	private static void linesDemo() {
		String lines1 = "jai shree ganesha\n"+"jai shree rama\n"+"jai shree radhe krishna\n" +"jai uma mahesh";
		
		String[] linesArray = lines1.split(System.lineSeparator());
		for(String line: linesArray ) {
			System.out.println(line);
		}
		
		System.out.println("========================");
		lines1.lines().forEach(System.out::println);
	}

	private static void isBlankDemo() {
		System.out.println("isBlankDemo.emptyString: "+emptyString.isBlank());//true
		System.out.println("isBlankDemo.singleCharString: "+singleCharString.isBlank());//false
		System.out.println("isBlankDemo.blankSpacesString: "+blankSpacesString.isBlank());//true
		System.out.println("isBlankDemo.blankSpacesCharString: "+blankSpacesCharString.isBlank());//false
		System.out.println("isBlankDemo.blankSpacesMultiCharString: "+blankSpacesMultiCharString.isBlank());//false
	}

	private static void repeatDemo() {
		System.out.println("repeatDemo.singleCharString: "+singleCharString.repeat(4));
		System.out.println("repeatDemo.emptyString: "+emptyString.repeat(4));
		System.out.println("repeatDemo.emptyString: "+singleCharString.repeat(0));
	}

	private static void trimDemo() {
		System.out.println("trimDemo.emptyString: "+emptyString.trim());
		System.out.println("trimDemo.singleCharString: "+singleCharString.trim());
		System.out.println("trimDemo.blankSpacesString: "+blankSpacesString.trim());
		System.out.println("trimDemo.blankSpacesCharString: "+blankSpacesCharString.trim());
		System.out.println("trimDemo.blankSpacesMultiCharString: "+blankSpacesMultiCharString.trim());
	}

	//empty means size of string is 0
	private static void isEmptyDemo() {
		System.out.println("isEmptyDemo.emptyString: "+emptyString.isEmpty());
		System.out.println("isEmptyDemo.singleCharString: "+singleCharString.isEmpty());
		System.out.println("isEmptyDemo.blankSpacesString: "+blankSpacesString.isEmpty());
		System.out.println("isEmptyDemo.selftrim.blankSpacesCharString: "+blankSpacesCharString.trim().isEmpty());
	}
}
