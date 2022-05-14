package strings;

public class StringInternization {

	public static void main(String[] args) {
		//string literal is internized and hence same object sharing happens with immutability
		String s1 = "jai shree ram";
		String s2 = "jai shree ram";
		
		System.out.println("s1 == s2: "+ (s1==s2));
		
		String s3 = new String("jai shree ram");
		System.out.println("s1 == s3: "+ (s1==s3));
		
		System.out.println("s1 == s3.intern: "+ (s1==s3.intern()));
		
		String s4 = new String("jai shree ram").intern();
		System.out.println("s1 == s4?: "+ (s1==s4));
		
		
		//special one even concat of literal string looks for internization
		
		String s5 = "jai "+"shree "+"ram";
		
		System.out.println("s1 == s5?: "+ (s1==s5));
		
		String x ="shree ram";
		String s6= "jai "+x;
		System.out.println("s1 == s6?: "+ (s1==s6)); //compiler wont understan and hence will be false
		
		//final means compile time constant and hence will 
		final String x11 ="shree ram";
		String s7= "jai "+x11;
		System.out.println("s1 == s7?: "+ (s1==s7)); //compiler wont understan and hence will be false
		
		
		
	}
}
