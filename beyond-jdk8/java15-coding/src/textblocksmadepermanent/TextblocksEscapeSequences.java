package textblocksmadepermanent;

public class TextblocksEscapeSequences {

	public static void main(String[] args) {
		notAllowNewLineInTextBlocks();
	}

	private static void notAllowNewLineInTextBlocks() {
		//text block benefit is code readablity
		//as part of clean code one line should not exceed a limit of width
		//this allows dev to read more code without scrolling to right and hence adds code readability
		
		//but what if we need not to show a new line but actually append in single line
		//introducing escape charachter in text block in jdk 15
		
		String text = """
				jai shree sita rama,
				jai uma mahesh,
				jai shree radhe krishna
				""";
		System.out.println(text);
		
		String textWithNoNewLine = """
				jai shree sita rama,\
				jai uma mahesh,\
				jai shree radhe krishna\
				""";
		System.out.println(textWithNoNewLine);
	}
}
