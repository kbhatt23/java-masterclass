package primitivedatatype;

public class CharDataType {
public static void main(String[] args) {
	//char c ='2'; //-> returns false
	char c ='B'; // return true
	//char c ='b'; -> //returns false
		//char can not hold 2 chars -> even though it is 2 byte -> 16 bits
	//char c ='Bb';
	System.out.println(Character.isUpperCase(c));
	int charInInt = c;
	System.out.println(charInInt);
}
}
