package strings;

public class EscapeSequences {

	public static void main(String[] args) {
		//lets try to amke json string
		String name = "krishna";
		int age = 23;
		String address = "C 502 Majestic Apartment Sec 18 Dwarka Delhi , -10075";
		System.out.println("{\"name\":\"" + name+"\", \"age\":"+age+", \"address\":\""+address+"\"}");
	
	System.out.println("\\");
	}
}
