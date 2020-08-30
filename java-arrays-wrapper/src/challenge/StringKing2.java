package challenge;

public class StringKing2 {
public static void main(String[] args) {
	String a  = "ram";
	String b = "ram";
	System.out.println(a == b);
	System.out.println(a.equals(b));
	String c = new String("ram");
	System.out.println(a == c);
	System.out.println(a.equals(c));
}
}
