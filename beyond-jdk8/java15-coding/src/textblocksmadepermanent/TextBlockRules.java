package textblocksmadepermanent;

public class TextBlockRules {

	public static void main(String[] args) {
		String name = "kaka bhatija"; // normal string literal
		System.out.println(name);
		
		//can not add content in same line as """
		
		String text1 = 
				//""" line 1 not possibl as content can not be in same line of delimeter """ 
				"""
				line1		
						
				 last line"""; //allowed in last line
		
		System.out.println(text1);
		
		String text2 = """
				kaka bhatija
				"""; // this adds an empty line at  the last
		   //if empty line not needed end in same line as content
		
		System.out.println(text2.equals(name)); //false as text have empty line at the end
		
		String text3 = """
				kaka bhatija"""; //no empty line
		
		System.out.println(text3.equals(name)); //true as text is same
		
		//also text block is internized and hence same object is used from string literal pool cache
		System.out.println(text3 == name); //true
		
	}
}
