package primitivedatatype;

public class StringConcatenation {
public static void main(String[] args) {
	String str = "jai shree ram";
	//concatenation prefernce
	str = str+23;
	System.out.println(str);
	//first operate 20 and 10 and then add string concatenation
	str = str+ (20+10);
	System.out.println(str);
	//no brancket means it will append like stirng concatenate
	str = str+ 20+10;
	System.out.println(str);
}
}
