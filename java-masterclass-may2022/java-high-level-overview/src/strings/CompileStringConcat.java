package strings;

public class CompileStringConcat {

	public static void main(String[] args) {
		//singllineappend();
		
		//multi line wont be optimized and will lead to too many string objects on heap
		String a = "abc" ;
		String b = "def" ;
		String c = "ghi" ;
		a += b;
		a +=c;
		System.out.println("a: "+a);
	}

	//single line append gets optimized to stringbuilder
	//but not for multi line
//	private static void singllineappend() {
//		String a = "abc" ;
//		String b = "def" ;
//		String c = "ghi" ;
//		//compiler can help here
//		//auto adds string builder here
//		String d = a + b+ c;
//		System.out.println(d);
//	}
	
	
}
