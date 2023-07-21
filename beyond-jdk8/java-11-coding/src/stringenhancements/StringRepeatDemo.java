package stringenhancements;

public class StringRepeatDemo {

	public static void main(String[] args) {
		//concat same string n time
		
		usingLibrary();
		System.out.println("=================================");
		usingSelf();
	}

	private static void usingLibrary() {
		var hash = "#";
		System.out.println("repeat 7 times: "+hash.repeat(7));
		System.out.println("original hash: "+hash);
		
		var empty = "";
		System.out.println("repeat empty 4 times: "+empty.repeat(4));
		System.out.println("repeat 0 times: "+hash.repeat(0));
		System.out.println("single repeat equals self: "+hash.repeat(1).equals(hash));
	}
	private static void usingSelf() {
		var hash = "#";
		System.out.println("repeat 7 times: "+repeat(hash,7));
		System.out.println("original hash: "+hash);
		
		var empty = "";
		System.out.println("repeat empty 4 times: "+repeat(empty,4));
		System.out.println("repeat 0 times: "+repeat(hash,0));
		System.out.println("single repeat equals self: "+repeat(hash, 1).equals(hash));
	}
	
	public static String repeat(String input , int count) {
		//In case of null or empty string always return same
		//even repeating empty string 10 times will gie empty string
		if(input == null || input.isEmpty()) {
			return input;
		}
		if(count == 0) {
			return "";
		}
		
		StringBuilder response = new StringBuilder();
		for(int i =0 ; i < count ; i++) {
			response.append(input);
		}
		
		return response.toString();
		
	}
}
