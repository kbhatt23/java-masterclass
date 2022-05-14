package strings;

public class StringVsStringBuilder {

	public static void main(String[] args) {
		String s = "sita ram";
		
		System.out.println("s before modification "+s);
		//need to forcefully assign to variable to make it reflect or else a new object of strinig is created and then geced as it is not referenced
		/* s = */ s.toUpperCase();
		/* s= */ s.replaceAll(" ", "");
		
		System.out.println("s after modification "+s);
		
		StringBuilder sb = new StringBuilder(s);
		System.out.println("sb before modification "+sb);
		sb.replace(4, 5, "");
		
		System.out.println("sb after modification "+sb);
	}
	
}
