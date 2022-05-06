import java.math.*;
public class CharAsInt{

	
	public static void main(String... args){
	 String s = "123";
	 
	for(int i = 0 ; i < s.length() ; i++){
		char c = s.charAt(i);
		int actualNum = c - '0';
		
		System.out.println(actualNum);
	}
	
	//we can put asci value based on range 0 -65535 as int and assign to char
	char ak = 65;
	System.out.println(ak);
	}
}