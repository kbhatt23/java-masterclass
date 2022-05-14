package strings;

public class StringConcat {

	public static void main(String[] args) {
		String a = "hello "+"world" +123;
		
		String b = "hello "+"world" +123 + 100;
		
		String c = 123+100 + "hello "+"world" +123;
		
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
	}
}
